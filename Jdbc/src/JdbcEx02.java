import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/*
 * select 구문 실행 : 레코드 정보가 조회. : ResultSet executeQuery(Sql)
 * DDL, DML 구문 실행 : 변경 발생 	  : int executeUpdate(Sql)
 * 		executeUpdate 실행 후 결과는 변경된 레코드의 갯수를 리턴
 */
public class JdbcEx02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		Statement stmt = conn.createStatement();
		String sql = "create table jdbctemp (id int primary key, name varchar(100))"; //mariadb에서 직접 테이블 삭제해야함.
		int result = stmt.executeUpdate(sql); // 변경(추가,삭제,수정)된 레코드가 없음
		System.out.println("1. 결과 : " + result); //0
		sql = "insert into jdbctemp values(1,'홍길동')"; //추가 = 변경
		result =stmt.executeUpdate(sql); //추가된 레코드 1개
		System.out.println("2. 결과 : " + result); //1
		sql = "insert into jdbctemp values(2,'김삿갓')"; //추가
		result =stmt.executeUpdate(sql); //추가된 레코드 1개
		System.out.println("3. 결과 : " + result); //1
		sql = "delete from jdbctemp where id=1"; //삭제
		result =stmt.executeUpdate(sql); //삭제된 레코드 1개
		System.out.println("4. 결과 : " + result); //1
	}

}
