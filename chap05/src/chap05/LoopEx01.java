package chap05;
/*
 * 반복문 예제
 * for
 * 		for(초기값;조건식;증감식){ ...}
 * 		: 주로 시작과 종료가 지정된경우. 순차적인 처리.
 * while
 * 		while(조건식){...}
 * 		: 비순차적일때.
 * 		  exit 문자가 입력될때 까지, 9문자가 입력될때 까지...
 * do while
 * 		do{...} while(조건식);
 * 		: 비순차적일때.
 * 		    조건에 상관없이 한번은 문장을 실행할 때.
 */
public class LoopEx01 {

	public static void main(String[] args) {
		/*System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5); 
		*/
		System.out.println("for구문으로 1~5까지 출력하기");
		for(int i=1; i<=5; i++) {
			System.out.print(i); //12345
		}
		System.out.println();
		
		System.out.println("while구문으로 1~5까지 출력하기");
		int i = 1;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		System.out.println("do-while구문으로 1~5까지 출력하기");
		i= 1;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		System.out.println();
	}

}
