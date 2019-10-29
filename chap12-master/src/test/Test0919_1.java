package test;

import java.util.Random;

/*
 * int getRand(f,t) : �Լ� �����ϱ�
 *   f ~ t �Ǵ� t~ f ����  ������ ���ڸ� ������ ���� �����ϴ� �Լ�
 *   f, t ���� ���Ե�. 
 */
public class Test0919_1 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}
	static int getRand(int f,int t) {
		int min = Math.min(f,t); //-3
		int max = Math.max(f,t); // 1 1 - -3 : 4
		int cha = max - min;
//		return (int)(Math.random() * (cha+1)) + min;
		int seed = (int)(Math.random() * 1000);
		Random r = new Random();
		r.setSeed(seed);
		return  r.nextInt(cha+1) + min;
	}
}

