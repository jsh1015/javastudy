package chap06;
/*
 * command line���� ���ڷ� �̷���� ���ڸ� �ΰ� �޾Ƽ� �μ��� ������� ���Ͻÿ�
 */
public class Exam08 {
	public static void main(String[] args) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if(args.length != 2) {
				System.out.println("command line�� �ΰ��� �Ķ���͸� �Է��ϼ���");
				System.out.println("java Exam08 10 20");
				return; //main �޼��� ����
			}
			System.out.print(num1 +","+ num2 + "�� �ּҰ���� : ");
			for(int i=1; i<=num1; i++) {
					if(num1%i == 0 && num2%i == 0) {
						System.out.print(i + ",");
					}
			}
	}
	/*
	 * int min = (num1>num2)? num2: num1;
	 * for(int i=1; i<=min; i++){
	 * 	if(num1%i==0 && num2%i==0){
	 * 		System.out.print(i + ",");
	 * 	}
	 */
}