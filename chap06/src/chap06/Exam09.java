package chap06;

import java.util.Scanner;

/*
 * ���� ���߱� ����
 * �ý����� 4�ڸ��� ���� �ٸ� ���� ������ �� -- 0~9���� ���δٸ� ��
 * ����ڰ� ����� ���� ���ߴ� ����
 * 		�ڸ����� �´� ��� : ��Ʈ���
 * 		�ڸ����� Ʋ������ ���ڰ� �����ϸ� : ��
 * 	4��Ʈ����� �Ǹ� ����
 */
public class Exam09 {

	public static void main(String[] args) {
		int numarr[] = {0,1,2,3,4,5,6,7,8,9};
		// answer : ����ڰ� ������� �ý����� 4�ڸ� ����.
		int answer[] = new int[4];
		//1. �ߺ����� �ʴ� 4�ڸ����� �����ϱ�
		for(int i=0;i<10000;i++) {	//�����ִ� ��
			int f = (int)(Math.random() * 10);//3
			int t = (int)(Math.random() * 10);//8
			//arr[f], arr[t] �ٲٱ�.
			int temp = numarr[f];
			numarr[f]=numarr[t];
			numarr[t]=temp;
		}
		for(int i=0;i<answer.length;i++) {
			answer[i]=numarr[i];
		}
		for(int a : answer) {
			System.out.print(a);
		}
		System.out.println();
		//����ڷ� ���� ������ �ɶ����� 4�ڸ� ���ڸ� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		int[] data = new int[4];
		int cnt = 0;
		while(true) {
			//ȭ�鿡�� 4�ڸ� ���� �Է�
			System.out.println("���� �ٸ� 4�ڸ� ���ڸ� �Է��ϼ���");
			String input = scan.next();	//���ڷ� �̷���� ���ڿ�
			//"1234"=> data[0]=1, data[1]=2,...
			for(int i=0; i<data.length; i++) {
				data[i] = input.charAt(i)-'0'; //'0'�� ���ָ� ���������� �ٲ�
			}
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<data.length; i++) {
				cnt++;
					if(answer[i] == data[i]) {
						strike++;
					}else{
						for(int j=0; j<data.length; j++) {
							if( answer[i] == data[j])
							ball++;
						}
					}
			}
			/*for(int i=0; i<data.length; i++) {
				for(int j=0; j<data.length; j++) {
					if(answer[i]==data[j]) {
						if(i==j) strike++;
						else ball++;
					}
				}
			}				=== ����� ��� 	*/
			
			if(strike == 4) {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				System.out.println(cnt + "�� �Է�");
				break;
			}else {
				System.out.println(strike + "��Ʈ����, " + ball + "��");
			}
			
			/*
			 * if(strike == data.length) {
								System.out.println(cnt + "�� �Է�");
								System.out.println("�����Դϴ�.");
								break;
			 * System.out.println("strike = " + strike);
			System.out.println("ball = " + ball);
			strike = 0;
			ball = 0;*/
		}
	}

}
