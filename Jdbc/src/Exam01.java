
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. dept ���̺��� �̿��Ͽ� ���������� ���ڵ常 dept_seoul ���̺�� �����ϱ�
 * 2. dept_seoul ���̺�
 * 	  deptno : 50, dname : Ư��������, loc : ���� ���ڵ� �߰�
 * 3. dept_seoul ���̺�
 * 	  deptno : 60 ���ڵ��� dname : Ư������1�� �����ϱ�
 * 4. dept_seoul ���̺��� ��� �÷��� ������ ȭ�鿡 ����ϱ�
 */
public class Exam01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Statement stmt = conn.createStatement();
		String sql = "create table dept_seoul as (select * from dept where loc = '����')";
		int result = stmt.executeUpdate(sql);
		System.out.println("1.��� :" + result);
		
		sql = "insert into dept_seoul (deptno, dname, loc) value (50,'Ư��������','����')";
		result = stmt.executeUpdate(sql);
		System.out.println("2.��� :" + result);
		
		sql = "update dept_seoul set dname = 'Ư������1��' where deptno = 60 ";
		result = stmt.executeUpdate(sql);
		System.out.println("3.��� :" + result);
		
		sql = "select * from dept_seoul";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print("��ȣ : " + rs.getString("deptno"));
			System.out.print(", �μ� : " + rs.getString("dname"));
			System.out.println(", ���� : " + rs.getString("loc"));
		}
	}

}
