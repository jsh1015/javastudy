package chap15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/*
 * 자바에서 제공되는 표준 입출력 객체
 * 표준입력 : InputStream System.in : 키보드에서 입력. 한 char씩 한단위로 가져옴
 * 표준출력 : PrintStream System.out : 콘솔(화면)에 데이터 출력
 * 표준오류 : PrintStream System.err : 콘솔(화면)에 데이터 출력 (빨간색으로)
 * 
 * IO 스트림 : 데이터 이동 통로, 단방향(입력,출력), 지연(버퍼가 존재)
 * 
 * 		입력
 * 			바이트 : InputStream => 1바이트 단위로 읽음.
 * 			문자 	 : Reader	   => 2바이트 단위로 읽음.
 * 			바이트형입력스트림 -> 문자형입력스트림 : InputStreamReader : Reader 클래스의 하위 클래스
 * 		출력
 * 			바이트 : OutputStream => 1바이트 단위로 출력.
 * 			문자 	 : Writer		=> 2바이트 단위로 출력.
 * 			바이트형출력스트림 -> 문자형출력스트림 : OutputStreamWriter : Reader 클래스의 하위 클래스
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
//		InputStream in = System.in; //표준입력객체
		Reader in = new InputStreamReader(System.in); 
		int data = 0;
		while((data=in.read()) != -1) { // ctrl+z : 종료
			System.out.print((char)data);
		}
	}
}
