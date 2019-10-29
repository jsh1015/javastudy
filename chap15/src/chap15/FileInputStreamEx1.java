package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileInputStream : ���Ϸκ��� �����͸� �б�
 * 		int read() : 1byte�� �о ����
 * 		int read(byte[] buf) : buf�� ũ�⸸ŭ �о �����͸� buf�� ����. ���� ���� ����Ʈ�� ����
 * 		int read(byte[] buf, int start, int len) : 
 * 								�����͸� len ����Ʈ ��ŭ �о buf�� start �ε������� ����. 
 * 								���� ���� ����Ʈ�� ����
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java"); //������ ��ġ
		System.out.println("***************read() �޼��带 �̿��Ͽ� �б�");
		int data = 0;
		while((data = fis.read()) != -1) { //������ ������ �о���� ���� /IOException
			System.out.print((char)data);
		}
		
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("***************read(byte[] buf) �޼��带 �̿��Ͽ� �б�");
		byte[] buf = new byte[fis.available()];
		// fis.available() : �б� ���� ����Ʈ �� ����
		while((data=fis.read(buf))!= -1) {
			//buf�� 0�� �ε������� data ���� ��ŭ ���ڿ��� ����
			System.out.println(new String(buf,0,data));
		}
		
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("***************read(byte[] buf, int start, int len) �޼��带 �̿��Ͽ� �б�");
		buf = new byte[fis.available()];
		// fis.available() : �б� ���� ����Ʈ �� ����
		while((data=fis.read(buf,0,buf.length))!= -1) {
			//buf�� 0�� �ε������� data ���� ��ŭ ���ڿ��� ����
			System.out.println(new String(buf,0,data));
		}

	}
}
