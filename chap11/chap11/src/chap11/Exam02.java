package chap11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * jdbc �� Exam03.java �ҽ��� �����ϱ�
 * �ֿܼ��� select ������ �Է¹޾� ȭ�鿡 ����ϱ�
 * select ���� ������ �߻��� ���
 * select ������ Ʋ�Ƚ��ϴ� Ȯ���ϼ���. �޼��� ����ϰ�, ���� select ���� �Է¹ޱ�
 * 
 * �÷���1	�÷���2
 * ��1		��2
 * ...
 */
public class Exam02 {
	public static void main(String[] args) throws Exception {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
			
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.println("select ������ �Է��ϼ��� (���� : exit)");
				String a = scan.nextLine(); //���� �������� nextLine���� �޾ƾ���
			
				if(a.equals("exit")) break; // = : ���������� ������ ����� �� / equals : ������ ������ 
			
				PreparedStatement pstmt = conn.prepareStatement(a);
				
				//====================================================================
				ResultSet rs = null;
				try {
					rs = pstmt.executeQuery();
				}catch(SQLException e){
					System.out.println("select ������ Ʋ�Ƚ��ϴ� Ȯ���ϼ���."); //SQLSyntaxErrorException
					continue;
				}
				//====================================================================
				
				ResultSetMetaData rsmt = rs.getMetaData();	//��Ÿ�����Ϳ����� �÷��� ������ �˷�
			
				PreparedStatement pstmt2 = conn.prepareStatement("select count(*) from (" + a + ") a"); //**
				//** (select * from student )�� ���ڵ带 a�� �ؼ� �װ��� ������ ���ض�.
				ResultSet rs2 = pstmt2.executeQuery();
				rs2.next();	//next�� �Ǿ�� resultset�� ���� ����.
				
				System.out.println("========================================");
				System.out.println("��ȸ�� �÷��� : " + rsmt.getColumnCount());	//��Ÿ�����Ϳ��� ���� �� ���� ������ Inlineview�� ���Ѱ�.
				System.out.println("��ȸ�� ���ڵ� ���� : " + rs2.getInt(1)); //ù��° �÷��� ���� == ���ڵ� ����
				System.out.println("========================================");
				System.out.printf("%-10s %-18s %-10s\n", "�÷���", "�÷�Ÿ��", "NULL ���");
					for(int i=1; i<=rsmt.getColumnCount() ; i++) {	
						System.out.printf("%-10s %-15s(%3d) %-10s\n",
								rsmt.getColumnName(i),	//�÷���
								rsmt.getColumnTypeName(i), //�÷�Ÿ��
								rsmt.getColumnDisplaySize(i), //���ڸ�����
								(rsmt.isNullable(i)==0?"NOT NULL" : "NULL")); // nullable null �� �������� ����
					}
					System.out.println("========================================");
			
					for(int i=1; i<=rsmt.getColumnCount() ; i++) {
						System.out.print(rsmt.getColumnLabel(i) + "\t"); //alias�� �־��� �� ����
					}System.out.println(); //����κ�
			
			
					while(rs.next()) {
						for(int i=1; i<=rsmt.getColumnCount(); i++) {
							System.out.print(rs.getString(i) + "\t");
						}
						System.out.println();
					}
			System.out.println("���α׷� ����");
			}
	}
}
