package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Input���� �ް�
 * Output���� ����ϱ�
 */
public class Test0925_1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���ϸ��� �Է��ϼ���");
			String file = scan.next();
			try {
				FileInputStream ip = new FileInputStream("src/chap15/"+file);
				String s = file.substring(0,file.indexOf("."));
				FileOutputStream fos = new FileOutputStream(s + ".bak");
				int data = 0;
				byte[] buf = new byte[ip.available()];
				while((data = ip.read(buf)) != -1) {
					fos.write(new String(buf,0,data).getBytes());
				}
			}catch(FileNotFoundException e) {
				System.out.println("�ش� ������ �����ϴ�.");
				continue;
			}
		}
	}
}
