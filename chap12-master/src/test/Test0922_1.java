package test;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * ȭ�����κ��� ��¥�� "2019/05/11"�� ���·� �Է¹޾Ƽ� ������������ 
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Էµ� ��¥�� 9999/99/99�� ���α׷��� �����Ѵ�.
 * �� �Էµ� ��¥�� ������ �߸��� ��� �޼����� �����ְ� �ٽ� �Է¹޵��� �Ѵ�.
 * => ����ó�� ���
 */
public class Test0922_1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("��¥�� �Է��ϼ��� (yyyy/MM/dd)");
			String day = scan.next();
			Date d = null;
			if(day.equals("9999/99/99")) break;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				d = sdf.parse(day);
			}catch(ParseException e){
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			SimpleDateFormat sdf2 = new SimpleDateFormat("E�����Դϴ�.");
			System.out.println(sdf2.format(d));
		}
		System.out.println("���α׷� ����");
	}
}

