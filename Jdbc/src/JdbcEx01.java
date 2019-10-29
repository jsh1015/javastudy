import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * Java와 DBM(Mariadb 사용)연결하기
 * 1. 드라이버 파일(mariadb-java-client-2.4.2.jar) classpath연결. 사용도구설정
 * 2. JDBC 관련 패키지 : java.sql.*
 * 3. 드라이버 클래스를 로드하기
 * 4. db와 Java를 연결하는 객체 생성하기
 */

//import java.sql.*

public class JdbcEx01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{ //예외처리
		//3. 드라이버 클래스를 로드하기
		//	  문자열로 지정된 클래스를 메모리에 로드하는 작업 / classpath에서 찾아서 로드
		Class.forName("org.mariadb.jdbc.Driver"); //예외처리를 해야 에러가 안남
		//4. db와 Java를 연결하는 객체 생성하기
		//	 mariadb서버로 가서 권한을 확인한 후 연결
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		//5. SQL 명령문을 DB에 전달하기위한 객체 생성
		//	  명령전달 Statement(인터페이스)객체 생성
		Statement stmt = conn.createStatement();
		//6. Statement 객체를 이용하여 Sql 구문실행. 결과얻기
		ResultSet rs = stmt.executeQuery("select * from student");
		//7. 결과 조회
		while(rs.next()) { //한개 레코드씩 조회.
			System.out.print("학번 : " + rs.getString("studno"));
			System.out.print(", 이름 : " + rs.getString("name"));
			System.out.print(", 학년 : " + rs.getString("grade"));
			System.out.print(", 키 : " + rs.getString("height"));
			System.out.print(", 몸무게 : " + rs.getString("weight"));
			System.out.println(", 학과코드 : " + rs.getString("major1"));
		}
		
		//문제 : 교수테이블에서 교수의 번호,이름,id,입사일,급여,보너스,학과코드를 화면에 출력하기
		ResultSet p = stmt.executeQuery("select * from professor");
		while(p.next()) {
			System.out.print("번호 : " + p.getString("no"));
			System.out.print(", 이름 : " + p.getString("name"));
			System.out.print(", id : " + p.getString("id"));
			System.out.print(", 입사일 : " + p.getString("hiredate"));
			System.out.print(", 급여 : " + p.getString("salary"));
			System.out.print(", 보너스 : " + p.getString("bonus"));
			System.out.println(", 학과코드 : " + p.getString("deptno"));
		}
	}

}
