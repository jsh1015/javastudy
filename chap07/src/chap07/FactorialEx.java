package chap07;
/*
 * call stack 영역
 * 재귀메서드(함수) : 자신이 자신 메서드를 다시 호출하는 메서드
 * 		=> 스택 영역이 존재하므로 가능함.
 */
public class FactorialEx {

	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
	}
	public static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1); //재귀함수(자기자신을 호출할 수 있는 함수)
	}

}
