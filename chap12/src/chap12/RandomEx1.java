package chap12;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(0); //seed 설정
		Random rand2 =new Random();
		/*
		 * System.currentTimeMillis() : 1970년 1월 1일부터 현재까지의 시간을 밀리초로 리턴
		 * 								현재시간.
		 */
		rand2.setSeed(System.currentTimeMillis()); //seed 설정
		//seed값을 같게하면 난수가 같게나옴
		System.out.println("rand ==> ");
		for(int i=0; i<5; i++) {
			//nextInt(100) : 0~99 정수형 난수 발생
			System.out.println(i +":"+rand.nextInt(100));
		}
		System.out.println();
		System.out.println("\nrand2 ==>");
		for(int i=0;i<5;i++)
			System.out.println(i + ":" + rand2.nextInt(100));
	}
}
