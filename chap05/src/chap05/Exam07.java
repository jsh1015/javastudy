package chap05;
/*
 * 1. 1부터 100까지 2의 배수이거나 3의 배수의 합 구하기
 * 		2 3 4 6 8 10 12 14 15 16 18 ....
 * 2. 1부터 100까지 2의 배수도 아니고 3의 배수도 아닌 수의 합 구하기
 * 		1 5 7 11 13 17...
 */
public class Exam07 {
	public static void main(String[] args) { 
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2== 0 || i%3==0) {
			sum  += i ;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i=1; i<=100; i++) {
//			if(i%2!=0 && i%3!=0) {
//			sum += i;
//			}
			if(i%2== 0 || i%3==0) continue;
			sum += i;
		}
		System.out.println(sum);
	}
}