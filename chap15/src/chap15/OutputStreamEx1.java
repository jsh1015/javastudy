package chap15;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
/*
 * PrintStream System.out
 * PrintStream 은 OutputStream의 하위 클래스임.
 */
public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
//		out.println('a'); //부모타입이 OutputStream이기때문에 에러 println은 OutputStream의 멤버가 아님.
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		out.flush(); //버퍼의 내용을 목적지로 강제 전송
	}
}
