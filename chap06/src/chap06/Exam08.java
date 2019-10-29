package chap06;
/*
 * command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
 */
public class Exam08 {
	public static void main(String[] args) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if(args.length != 2) {
				System.out.println("command line에 두개의 파라미터만 입력하세요");
				System.out.println("java Exam08 10 20");
				return; //main 메서드 종료
			}
			System.out.print(num1 +","+ num2 + "의 최소공약수 : ");
			for(int i=1; i<=num1; i++) {
					if(num1%i == 0 && num2%i == 0) {
						System.out.print(i + ",");
					}
			}
	}
	/*
	 * int min = (num1>num2)? num2: num1;
	 * for(int i=1; i<=min; i++){
	 * 	if(num1%i==0 && num2%i==0){
	 * 		System.out.print(i + ",");
	 * 	}
	 */
}