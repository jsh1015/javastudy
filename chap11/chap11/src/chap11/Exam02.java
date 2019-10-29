package chap11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * jdbc 의 Exam03.java 소스를 복사하기
 * 콘솔에서 select 구문을 입력받아 화면에 출력하기
 * select 구문 오류가 발생한 경우
 * select 구문이 틀렸습니다 확인하세요. 메세지 출력하고, 다음 select 구문 입력받기
 * 
 * 컬럼명1	컬럼명2
 * 값1		값2
 * ...
 */
public class Exam02 {
	public static void main(String[] args) throws Exception {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
			
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.println("select 구문을 입력하세요 (종료 : exit)");
				String a = scan.nextLine(); //엔터 값때문에 nextLine으로 받아야함
			
				if(a.equals("exit")) break; // = : 참조변수가 같은지 물어보는 것 / equals : 내용이 같은지 
			
				PreparedStatement pstmt = conn.prepareStatement(a);
				
				//====================================================================
				ResultSet rs = null;
				try {
					rs = pstmt.executeQuery();
				}catch(SQLException e){
					System.out.println("select 구문이 틀렸습니다 확인하세요."); //SQLSyntaxErrorException
					continue;
				}
				//====================================================================
				
				ResultSetMetaData rsmt = rs.getMetaData();	//메타데이터에서는 컬럼의 갯수만 알려
			
				PreparedStatement pstmt2 = conn.prepareStatement("select count(*) from (" + a + ") a"); //**
				//** (select * from student )의 레코드를 a로 해서 그것의 갯수를 구해라.
				ResultSet rs2 = pstmt2.executeQuery();
				rs2.next();	//next가 되어야 resultset을 쓸수 있음.
				
				System.out.println("========================================");
				System.out.println("조회된 컬럼수 : " + rsmt.getColumnCount());	//메타데이터에서 구할 수 없기 때문에 Inlineview로 구한것.
				System.out.println("조회된 레코드 갯수 : " + rs2.getInt(1)); //첫번째 컬럼의 갯수 == 레코드 갯수
				System.out.println("========================================");
				System.out.printf("%-10s %-18s %-10s\n", "컬럼명", "컬럼타입", "NULL 허용");
					for(int i=1; i<=rsmt.getColumnCount() ; i++) {	
						System.out.printf("%-10s %-15s(%3d) %-10s\n",
								rsmt.getColumnName(i),	//컬럼명
								rsmt.getColumnTypeName(i), //컬럼타입
								rsmt.getColumnDisplaySize(i), //몇자리인지
								(rsmt.isNullable(i)==0?"NOT NULL" : "NULL")); // nullable null 이 가능하지 않음
					}
					System.out.println("========================================");
			
					for(int i=1; i<=rsmt.getColumnCount() ; i++) {
						System.out.print(rsmt.getColumnLabel(i) + "\t"); //alias를 넣어줄 수 있음
					}System.out.println(); //헤더부분
			
			
					while(rs.next()) {
						for(int i=1; i<=rsmt.getColumnCount(); i++) {
							System.out.print(rs.getString(i) + "\t");
						}
						System.out.println();
					}
			System.out.println("프로그램 종료");
			}
	}
}
