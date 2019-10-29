package chap12;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(0); //seed ����
		Random rand2 =new Random();
		/*
		 * System.currentTimeMillis() : 1970�� 1�� 1�Ϻ��� ��������� �ð��� �и��ʷ� ����
		 * 								����ð�.
		 */
		rand2.setSeed(System.currentTimeMillis()); //seed ����
		//seed���� �����ϸ� ������ ���Գ���
		System.out.println("rand ==> ");
		for(int i=0; i<5; i++) {
			//nextInt(100) : 0~99 ������ ���� �߻�
			System.out.println(i +":"+rand.nextInt(100));
		}
		System.out.println();
		System.out.println("\nrand2 ==>");
		for(int i=0;i<5;i++)
			System.out.println(i + ":" + rand2.nextInt(100));
	}
}
