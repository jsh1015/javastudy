import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/*
 * select ���� ���� : ���ڵ� ������ ��ȸ. : ResultSet executeQuery(Sql)
 * DDL, DML ���� ���� : ���� �߻� 	  : int executeUpdate(Sql)
 * 		executeUpdate ���� �� ����� ����� ���ڵ��� ������ ����
 */
public class JdbcEx02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Statement stmt = conn.createStatement();
		String sql = "create table jdbctemp (id int primary key, name varchar(100))"; //mariadb���� ���� ���̺� �����ؾ���.
		int result = stmt.executeUpdate(sql); // ����(�߰�,����,����)�� ���ڵ尡 ����
		System.out.println("1. ��� : " + result); //0
		sql = "insert into jdbctemp values(1,'ȫ�浿')"; //�߰� = ����
		result =stmt.executeUpdate(sql); //�߰��� ���ڵ� 1��
		System.out.println("2. ��� : " + result); //1
		sql = "insert into jdbctemp values(2,'���')"; //�߰�
		result =stmt.executeUpdate(sql); //�߰��� ���ڵ� 1��
		System.out.println("3. ��� : " + result); //1
		sql = "delete from jdbctemp where id=1"; //����
		result =stmt.executeUpdate(sql); //������ ���ڵ� 1��
		System.out.println("4. ��� : " + result); //1
	}

}
