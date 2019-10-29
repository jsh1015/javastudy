package chap06;
/*
 * Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
 * java Exam07 10 (정수가 아닌 문자열)
 * int num = Integer.parseInt(args[0]);
 * 
 * 10의 약수 : 1,2,5,10,
 */
public class Exam07 {

	public static void main(String[] args) {
		//Integer.parseInt(String) : 숫자로 된 문자열 => int형 숫자로 변환 함수
		for(String a : args) {
			int num = Integer.parseInt(a);
			if(args.length==0) {
				System.out.println("커맨드라인에 파라미터 값을 입력하세요");
				return;
			}
			System.out.print(num +"의 약수 : ");
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) { //if(num%i == 0)
					if(i*j==num) { 
						System.out.print(i + ",");
					}
				}
			}
			System.out.println();
			
			/*int num = Integer.parseInt(args[0]);
			if(args.length==0) {
				System.out.println("커맨드라인에 파라미터 값을 입력하세요");
				return;
			}
			System.out.print(num +"의 약수 : ");
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if(i*j==num) { 
						System.out.print(i + ",");
					}
				}
			}*/
		}
	}
}
