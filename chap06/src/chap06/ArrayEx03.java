package chap06;

import java.util.Arrays;

/*
 * �ζ� ��ȣ ��÷��
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] balls=new int[45];
		int[] lotto = new int[6];
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		//balls ����
		for(int i=0;i<1000;i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			//swap �˰���
			int tmp = balls[f];
			balls[f]= balls[t];
			balls[t]=tmp;
		}
		//6���� ��ȣ ����
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=balls[i];
		}
		//�����ϱ�
		//Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++) {
			boolean change = false; //���������� �߰��� ���߰� �ϱ����� ��
			for(int j=0;j<lotto.length-1-i; j++) {
				//i���°� �ѹ� ������ �������� �������ϱ�. 
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1]=temp;
					change = true;
				}
			}
			if(!change) break;
		}
		
		//���� ��ȣ���
		for(int b : lotto) {
			System.out.print(b+",");
		}
	}
}