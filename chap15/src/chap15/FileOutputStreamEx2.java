package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * FileOutputStream 을 이용하여 error 로그 파일 생성하기.
 */
public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}

	private static void firstMethod() {
		secondMethod();
	}

	private static void secondMethod() {
		try {
			throw new Exception("파일에 예외 메세지 저장하기");
		}catch(Exception e) {
			e.printStackTrace(); //표준오류객체로 메세지 출력.
			try {
				/*
				 * ("error.log", true)
				 * 	"error.log" : 생성할 파일의 이름. 파일없으면 생성. 파일이 있으면 내용 변경
				 * 	true/false  : true : 파일이 있는 경우 기존의 내용에 새로운 내용을 추가
				 * 				  false : 파일이 있는 경우 기존의 내용을 새로운 내용으로 변경
				 */
				FileOutputStream fos = new FileOutputStream("error.log",true); 
															//true : append :기존내용을 없애지 않고 추가.
				fos.write(e.getMessage().getBytes());
				//e.getMessage().getBytes() : getBytes()하는 이유 : getBytes()의 리턴타입이 'byte형 배열'이기 때문
				
				e.printStackTrace(new PrintStream(fos)); //error.log 파일에 e.printStackTrace()내용을 출력
				fos.write("==========================\n\n".getBytes());
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
