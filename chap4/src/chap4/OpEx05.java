package chap4;
/*
 * 부호 연산자 : +,-
 * 		+ : 현재의 부호를 유지
 * 		- : 현재의 부호를 변경
 */
public class OpEx05 {
	public static void main(String[] args) {
		int x = -10;
		System.out.println("x="+ + x);
		System.out.println("-x="+ + -x);
		x = 10;
		System.out.println("+x="+ + x);
		System.out.println("-x="+ + -x);
	}
}
