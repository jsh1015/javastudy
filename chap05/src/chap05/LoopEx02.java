package chap05;
/*
 * �ݺ����� �̿��Ͽ� 1~10������ ���� ���ϱ�
 */
public class LoopEx02 {

	public static void main(String[] args) {
		System.out.println("for������ �̿��ϱ�");
		int sum = 0;
		int i=1;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10������ �� : "+sum);
		
		
		System.out.println("while������ �̿��ϱ�");
		sum = 0;
		i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10������ �� : "+sum);
		
		
		System.out.println("do-while������ �̿��ϱ�");
		i = 1;
		sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1~10������ �� : "+sum);
	}

}
