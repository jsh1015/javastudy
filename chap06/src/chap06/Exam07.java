package chap06;
/*
 * Command ���ο��� ���ڸ� �Է¹޾� ������ ����� ����ϱ�
 * java Exam07 10 (������ �ƴ� ���ڿ�)
 * int num = Integer.parseInt(args[0]);
 * 
 * 10�� ��� : 1,2,5,10,
 */
public class Exam07 {

	public static void main(String[] args) {
		//Integer.parseInt(String) : ���ڷ� �� ���ڿ� => int�� ���ڷ� ��ȯ �Լ�
		for(String a : args) {
			int num = Integer.parseInt(a);
			if(args.length==0) {
				System.out.println("Ŀ�ǵ���ο� �Ķ���� ���� �Է��ϼ���");
				return;
			}
			System.out.print(num +"�� ��� : ");
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) { //if(num%i == 0)
					if(i*j==num) { 
						System.out.print(i + ",");
					}
				}
			}
			System.out.println();
			
			/*int num = Integer.parseInt(args[0]);
			if(args.length==0) {
				System.out.println("Ŀ�ǵ���ο� �Ķ���� ���� �Է��ϼ���");
				return;
			}
			System.out.print(num +"�� ��� : ");
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if(i*j==num) { 
						System.out.print(i + ",");
					}
				}
			}*/
		}
	}
}
