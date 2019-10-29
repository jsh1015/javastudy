package chap06;

import java.util.Scanner;

public class 과제03_2 {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("동전으로 바꿀 금액을 입력하세요");
		int money = scan.nextInt();
		int cnt = 0;
		for(int coin : coins) {
			System.out.println(coin + "원 동전 : "+ money/coin + "개");
			cnt += money/coin;
			money %= coin;
		}
		System.out.println("전체 바꿔준 동전의 갯수 : "+cnt);
	}

}
