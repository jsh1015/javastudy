package chap15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream ����
 * 		: ���Ͽ� �����͸� ���
 * 			void write(int data) : data�� 1����Ʈ�� ���Ϸ� ���
 * 			void write(byte[] buf) : buf�� ������ ���Ϸ� ���
 * 			void write(byte[] buf,int start, int len) : buf�� start�ε������� 
 * 														len����Ʈ ��ŭ ������ ���Ϸ� ���
 * 
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.txt"); 
		//�������� ������ ���� ����, �����ϸ� ���Ͽ� ���� �߰�. => ������ IOException ó���� �ؾ��� : ���� ������
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('��');fos.write('��');fos.write('��');
		//getbytes() : ���ڿ��� byte[] �� ����
		byte[] buf = "\n�ݰ����ϴ�. FileOutputStream �����Դϴ�.\n".getBytes();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.flush();
	}
}