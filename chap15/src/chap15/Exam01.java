package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당파일없음'을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("파일명을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int data = 0;
		try {
			String file = scan.next();
			FileInputStream fis = new FileInputStream("src/chap15/"+ file + ".java");
			byte[] buf = new byte[fis.available()];
			while((data = fis.read(buf)) != -1) {
				System.out.println(new String(buf,0,data));
			}
		}catch(IOException e) {
			System.out.println("해당파일없음");
		}
	}
}
