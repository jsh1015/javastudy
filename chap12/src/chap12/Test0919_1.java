package chap12;

import java.util.Random;

/*
 * int getRand(f,t) : 함수 구현하기
 * 		f~t 또는 t~f까지 범위에 숫자를 임의의 수로 리턴하는 함수
 * 		f,t 값은 포함됨.
 */
public class Test0919_1 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(3,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}

	static int getRand(int f, int t) {
		Random rand = new Random();
		int a = 0;
		if(t<f) {
			a = (rand.nextInt(f-t+1)+t);
		}else if(t>f){
			a = (rand.nextInt(t-f+1)+f);
		}
		return a;
	}
}
