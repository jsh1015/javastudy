import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jshfamil_ {
	static Connection conn;	//connection ����.
	
	static { // static �ʱ�ȭ �� : �޸𸮿� �ε�Ǵ� ���� �ѹ��� �����ϱ� ���� �۾�
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("========= �޴��� �����ϼ��� ========");
			System.out.println("1 : ����ȸ���߰�");
			System.out.println("2 : ����ȸ������");
			System.out.println("3 : ����ȸ��Ż��");
			System.out.println("4 : ����ȸ�������ȸ");
			System.out.println("9 : ���α׷� ����");
			System.out.println("===============================");
			int num = scan.nextInt();
			
			if(num==9) break;
			switch(num) {
			case 1: insert(); break;
			case 2: update(); break;
			case 3: delete(); break;
			case 4: select(); break;
			}
		}
		System.out.println("���α׷� ����");
		
	}

	private static void insert() throws SQLException {	
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸� : ");
		String name = scan.next();
		System.out.print("���� ���� : ");
		int age = scan.nextInt();
		System.out.print("���� ���� : ");
		String job = scan.next();
		System.out.print("���� ����(1:����,2:����): ");
		int gender = scan.nextInt();
		
		PreparedStatement pstmt = conn.prepareStatement
				("insert into jshfamily (name,age,job,gender) value (?,?,?,?)");
		pstmt.setString(1,name);
		pstmt.setInt(2,age);
		pstmt.setString(3,job);
		pstmt.setInt(4,gender);
		pstmt.executeUpdate();
		
		System.out.println("���� �߰� �Ϸ�");
	}

	private static void update() throws SQLException {
		System.out.print("���� ��ȣ : ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from jshfamily where no = ?");
		pstmt.setInt(1,no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			Jshfamily s = new Jshfamily(rs.getString("name"), rs.getInt("age"), rs.getString("job"), rs.getInt("gender")) ;
			System.out.println(s);
			
			System.out.println("���� �׸��� �����ϼ���");
			System.out.print("���� �̸� : " + s.getName() + " �����Ͻðڽ��ϱ�?(Y/N) : ");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ �̸��� �Է� : " );
				String name = scan.next();
				s.setName(name);
			}
			
			System.out.print("���� ���� : " + s.getAge() + " �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ ���̸� �Է� : ");
				int age = scan.nextInt();
				s.setAge(age);
			}
			
			System.out.print("���� ���� : " + s.getJob() + " �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ ������ �Է� : ");
				String job = scan.next();
				s.setJob(job);
			}
			
			System.out.print("���� ����(1:����,2:����) : " + s.getGender() + " �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ ������ �Է� : ");
				int gender = scan.nextInt();
				s.setGender(gender);
			}
			
			pstmt.close();
			
			System.out.println("���� ���� �Ϸ�");
		}
	}

	private static void delete() throws SQLException {
		select();
		System.out.println("Ż���� ���� ȸ���� ��ȣ�� �Է��ϼ���");
		PreparedStatement pstmt = conn.prepareStatement("delete from jshfamily where no=?");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		pstmt.setInt(1,no);
		pstmt.executeUpdate();
	}

	private static void select() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("select * from jshfamily");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Jshfamily s = new Jshfamily(rs.getInt("no"), rs.getString("name"), rs.getInt("age"), rs.getString("job"), rs.getInt("gender"));
			System.out.println("��ȣ:" + s.getNo() + ", " + s);
		}
	}

}
