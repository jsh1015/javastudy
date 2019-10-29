import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jshfamil_ {
	static Connection conn;	//connection 생성.
	
	static { // static 초기화 블럭 : 메모리에 로드되는 순간 한번만 연결하기 위한 작업
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
			System.out.println("========= 메뉴를 선택하세요 ========");
			System.out.println("1 : 가족회원추가");
			System.out.println("2 : 가족회원변경");
			System.out.println("3 : 가족회원탈퇴");
			System.out.println("4 : 가족회원목록조회");
			System.out.println("9 : 프로그램 종료");
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
		System.out.println("프로그램 종료");
		
	}

	private static void insert() throws SQLException {	
		Scanner scan = new Scanner(System.in);
		System.out.print("가족 이름 : ");
		String name = scan.next();
		System.out.print("가족 나이 : ");
		int age = scan.nextInt();
		System.out.print("가족 직업 : ");
		String job = scan.next();
		System.out.print("가족 성별(1:남자,2:여자): ");
		int gender = scan.nextInt();
		
		PreparedStatement pstmt = conn.prepareStatement
				("insert into jshfamily (name,age,job,gender) value (?,?,?,?)");
		pstmt.setString(1,name);
		pstmt.setInt(2,age);
		pstmt.setString(3,job);
		pstmt.setInt(4,gender);
		pstmt.executeUpdate();
		
		System.out.println("가족 추가 완료");
	}

	private static void update() throws SQLException {
		System.out.print("가족 번호 : ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from jshfamily where no = ?");
		pstmt.setInt(1,no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			Jshfamily s = new Jshfamily(rs.getString("name"), rs.getInt("age"), rs.getString("job"), rs.getInt("gender")) ;
			System.out.println(s);
			
			System.out.println("변경 항목을 선택하세요");
			System.out.print("가족 이름 : " + s.getName() + " 변경하시겠습니까?(Y/N) : ");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 이름을 입력 : " );
				String name = scan.next();
				s.setName(name);
			}
			
			System.out.print("가족 나이 : " + s.getAge() + " 변경하시겠습니까?(Y/N) : ");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 나이를 입력 : ");
				int age = scan.nextInt();
				s.setAge(age);
			}
			
			System.out.print("가족 직업 : " + s.getJob() + " 변경하시겠습니까?(Y/N) : ");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 직업을 입력 : ");
				String job = scan.next();
				s.setJob(job);
			}
			
			System.out.print("가족 성별(1:남자,2:여자) : " + s.getGender() + " 변경하시겠습니까?(Y/N) : ");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 성별을 입력 : ");
				int gender = scan.nextInt();
				s.setGender(gender);
			}
			
			pstmt.close();
			
			System.out.println("가족 변경 완료");
		}
	}

	private static void delete() throws SQLException {
		select();
		System.out.println("탈퇴할 가족 회원의 번호를 입력하세요");
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
			System.out.println("번호:" + s.getNo() + ", " + s);
		}
	}

}
