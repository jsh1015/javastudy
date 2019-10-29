package chap15;

import java.io.FileReader;
import java.io.IOException;
/*
 * FileReader 예제 : FileReader 클래스는 파일을  1char 단위로 읽는 기능
 * 		int read() : 파일을 1char 단위로 읽어 리턴
 * 		int read(char[] buf) : buf의 크기만큼 데이터를 읽어서 buf에 데이터를 저장하고 실제로 읽은 바이트수 리턴
 * 
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap15/InputStreamEx1.java"); //파일의 위치
		System.out.println("*************** read() 메서드를 이용하여 읽기 ***************");
		int data = 0;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}System.out.println();
		
		fis = new FileReader("src/chap15/InputStreamEx1.java"); //파일의 위치
		System.out.println("*************** read(char[] buf) 메서드를 이용하여 읽기 ***************");
		char[] buf = new char[1024];
		while((data = fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}System.out.println();
		
		fis = new FileReader("src/chap15/InputStreamEx1.java"); //파일의 위치
		System.out.println("*************** read(char[] buf,int start, int len) 메서드를 이용하여 읽기 ***************");
		buf = new char[1024];
		while((data = fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}
}
