package chap4;

import java.util.Scanner;

/*
 * ���� �����ڸ� �̿��ϱ�
 * ������ �Է¹޾Ƽ� 90�̻��̸� "A����" 80�̻��̸�"B����" 70�̻��̸� "C����"
 * 				60�̻��̸� "D����" �׿ܴ� "F����" ����ϱ�
 */
public class Exam07 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String result;
		if(a>=90) {
			result = "A����";
		}else if(a>=80) {
			result = "B����";
		}else if(a>=70) {
			result = "C����";
		}else if(a>=60) {
			result = "D����";
		}else {
			result = "F����";
		}
		System.out.println(a+ "������ " + result + " �Դϴ�");
		/*System.out.println(a + "������" +
							((a>=90)?"A":(a>=80)?"B":
							(a>=70)?"C":(a>=70)?"D":"F")+ "���� �Դϴ�.");	*/
	}

}
