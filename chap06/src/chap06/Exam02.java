package chap06;
/*
 * Math.random() �Լ��� �̿��Ͽ� 1���� 10������ ������ ���� �迭�� 10�� �����ϱ�
 * �迭�� ����� ����ŭ * �� ����ϱ�
 *  0 <= Math.random() < 1.0
 * arr= {3,5,2,1...}
 * 3:***
 * 5:*****
 * 2:**
 * ...
 */
public class Exam02 {
	public static void main(String[] args) {
		int[] arr= new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		for(int a : arr) {
			System.out.print(a + ":");
			for(int i=0;i<a;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}