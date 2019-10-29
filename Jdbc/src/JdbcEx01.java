import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * Java�� DBM(Mariadb ���)�����ϱ�
 * 1. ����̹� ����(mariadb-java-client-2.4.2.jar) classpath����. ��뵵������
 * 2. JDBC ���� ��Ű�� : java.sql.*
 * 3. ����̹� Ŭ������ �ε��ϱ�
 * 4. db�� Java�� �����ϴ� ��ü �����ϱ�
 */

//import java.sql.*

public class JdbcEx01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{ //����ó��
		//3. ����̹� Ŭ������ �ε��ϱ�
		//	  ���ڿ��� ������ Ŭ������ �޸𸮿� �ε��ϴ� �۾� / classpath���� ã�Ƽ� �ε�
		Class.forName("org.mariadb.jdbc.Driver"); //����ó���� �ؾ� ������ �ȳ�
		//4. db�� Java�� �����ϴ� ��ü �����ϱ�
		//	 mariadb������ ���� ������ Ȯ���� �� ����
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		//5. SQL ��ɹ��� DB�� �����ϱ����� ��ü ����
		//	  ������� Statement(�������̽�)��ü ����
		Statement stmt = conn.createStatement();
		//6. Statement ��ü�� �̿��Ͽ� Sql ��������. ������
		ResultSet rs = stmt.executeQuery("select * from student");
		//7. ��� ��ȸ
		while(rs.next()) { //�Ѱ� ���ڵ徿 ��ȸ.
			System.out.print("�й� : " + rs.getString("studno"));
			System.out.print(", �̸� : " + rs.getString("name"));
			System.out.print(", �г� : " + rs.getString("grade"));
			System.out.print(", Ű : " + rs.getString("height"));
			System.out.print(", ������ : " + rs.getString("weight"));
			System.out.println(", �а��ڵ� : " + rs.getString("major1"));
		}
		
		//���� : �������̺��� ������ ��ȣ,�̸�,id,�Ի���,�޿�,���ʽ�,�а��ڵ带 ȭ�鿡 ����ϱ�
		ResultSet p = stmt.executeQuery("select * from professor");
		while(p.next()) {
			System.out.print("��ȣ : " + p.getString("no"));
			System.out.print(", �̸� : " + p.getString("name"));
			System.out.print(", id : " + p.getString("id"));
			System.out.print(", �Ի��� : " + p.getString("hiredate"));
			System.out.print(", �޿� : " + p.getString("salary"));
			System.out.print(", ���ʽ� : " + p.getString("bonus"));
			System.out.println(", �а��ڵ� : " + p.getString("deptno"));
		}
	}

}
