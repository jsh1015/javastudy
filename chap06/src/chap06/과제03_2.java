package chap06;

import java.util.Scanner;

public class ����03_2 {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �ٲ� �ݾ��� �Է��ϼ���");
		int money = scan.nextInt();
		int cnt = 0;
		for(int coin : coins) {
			System.out.println(coin + "�� ���� : "+ money/coin + "��");
			cnt += money/coin;
			money %= coin;
		}
		System.out.println("��ü �ٲ��� ������ ���� : "+cnt);
	}

}
