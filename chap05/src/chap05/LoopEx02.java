package chap05;
/*
 * 반복문을 이용하여 1~10까지의 합을 구하기
 */
public class LoopEx02 {

	public static void main(String[] args) {
		System.out.println("for구문을 이용하기");
		int sum = 0;
		int i=1;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		
		System.out.println("while구문을 이용하기");
		sum = 0;
		i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		
		System.out.println("do-while구문을 이용하기");
		i = 1;
		sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지의 합 : "+sum);
	}

}
