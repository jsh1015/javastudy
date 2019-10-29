package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고, 내용을 입력받아 입력받은 파일에 입력된 내용 저장하기.
 * exit 가 입력되면 내용 입력 종료하기
 * 
 * [결과]
 * 파일명을 입력하세요
 * aaa.txt
 * 저장할 내용을 입력하세요
 * 안녕하세요
 * 반갑습니다.
 * exit
 * 
 * aaa.txt의 파일 내용
 * 안녕하세요
 * 반갑습니다.
 */
public class Exam02 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String file = scan.next();
		FileOutputStream fos = new FileOutputStream(file);
		System.out.println("저장할 내용을 입력하세요");
		while(true) {
			String txt = scan.next();
			if(txt.equals("exit")) {
				break;
			}else{
//				byte[] buf = txt.getBytes();
				fos.write(txt.getBytes());
				fos.write("\n".getBytes());
			}
		}
		
//		String text = scan.nextLine();
//		FileWriter f = new FileWriter(text,true);
//		System.out.println("내용을 입력하세요");
//		while(true) {
//			String data = scan.nextLine();
//			if(data.equals("exit")) {
//				System.out.println("종료합니다."); break;
//			}
//			f.write(data + "\n");
//		}
//		f.flush();
	}
}
