package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�, ������ �Է¹޾� �Է¹��� ���Ͽ� �Էµ� ���� �����ϱ�.
 * exit �� �ԷµǸ� ���� �Է� �����ϱ�
 * 
 * [���]
 * ���ϸ��� �Է��ϼ���
 * aaa.txt
 * ������ ������ �Է��ϼ���
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 * exit
 * 
 * aaa.txt�� ���� ����
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 */
public class Exam02 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String file = scan.next();
		FileOutputStream fos = new FileOutputStream(file);
		System.out.println("������ ������ �Է��ϼ���");
		while(true) {
			String txt = scan.next();
			if(txt.equals("exit")) {
				break;
			}else{
//				byte[] buf = txt.getBytes();
				fos.write(txt.getBytes());
				fos.write("\n".getBytes());
			}
		}
		
//		String text = scan.nextLine();
//		FileWriter f = new FileWriter(text,true);
//		System.out.println("������ �Է��ϼ���");
//		while(true) {
//			String data = scan.nextLine();
//			if(data.equals("exit")) {
//				System.out.println("�����մϴ�."); break;
//			}
//			f.write(data + "\n");
//		}
//		f.flush();
	}
}
