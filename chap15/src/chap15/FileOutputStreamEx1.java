package chap15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream 예제
 * 		: 파일에 데이터를 출력
 * 			void write(int data) : data중 1바이트만 파일로 출력
 * 			void write(byte[] buf) : buf의 내용을 파일로 출력
 * 			void write(byte[] buf,int start, int len) : buf의 start인덱스부터 
 * 														len바이트 만큼 내용을 파일로 출력
 * 
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.txt"); 
		//존재하지 않으면 파일 생성, 존재하면 파일에 내용 추가. => 하지만 IOException 처리를 해야함 : 권한 때문에
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		//getbytes() : 문자열을 byte[] 로 리턴
		byte[] buf = "\n반갑습니다. FileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.flush();
	}
}
