package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileInputStream : 파일로부터 데이터를 읽기
 * 		int read() : 1byte를 읽어서 리턴
 * 		int read(byte[] buf) : buf의 크기만큼 읽어서 데이터를 buf에 저장. 실제 읽은 바이트수 리턴
 * 		int read(byte[] buf, int start, int len) : 
 * 								데이터를 len 바이트 만큼 읽어서 buf에 start 인덱스부터 저장. 
 * 								실제 읽은 바이트수 리턴
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java"); //파일의 위치
		System.out.println("***************read() 메서드를 이용하여 읽기");
		int data = 0;
		while((data = fis.read()) != -1) { //권한이 없으면 읽어오지 못함 /IOException
			System.out.print((char)data);
		}
		
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("***************read(byte[] buf) 메서드를 이용하여 읽기");
		byte[] buf = new byte[fis.available()];
		// fis.available() : 읽기 가능 바이트 수 리턴
		while((data=fis.read(buf))!= -1) {
			//buf의 0번 인덱스부터 data 길이 만큼 문자열로 변경
			System.out.println(new String(buf,0,data));
		}
		
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("***************read(byte[] buf, int start, int len) 메서드를 이용하여 읽기");
		buf = new byte[fis.available()];
		// fis.available() : 읽기 가능 바이트 수 리턴
		while((data=fis.read(buf,0,buf.length))!= -1) {
			//buf의 0번 인덱스부터 data 길이 만큼 문자열로 변경
			System.out.println(new String(buf,0,data));
		}

	}
}
