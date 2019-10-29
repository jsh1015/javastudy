package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Scanner �� �̿��Ͽ� File ���� �б�
 */
public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		//File : ������ ������ �����ϴ� Ŭ����
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()) {//���� ���� ����?
			String line = scan.nextLine();//line = "ȫ�浿,4.5,3.8,4.2"
			Scanner scan2 = new Scanner(line).useDelimiter(","); // line�� ,�α���
			double sum = 0;
			int i = 0;
			String name = scan2.next();//name="ȫ�浿" / scan2�� ù��°String�� name������.
			System.out.print(name + ":"); //ȫ�浿      :
			while(scan2.hasNextDouble()) { 
				double score = scan2.nextDouble();//4.5
				sum += score;
				System.out.print(score + ","); //���� ��� : 4.5,3.8,4.2,
				i++; //���� ����
			}
			System.out.println("sum="+sum+",avg=" + 
			((int)(sum/i * 100))/100.0);
			totalSum += sum;
			cnt++;
		}
		System.out.println("�ο���:" + cnt);	
		System.out.println("���հ�:" + totalSum);
	}
}
