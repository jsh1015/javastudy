package chap15;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter ����
 * 		: ���Ͽ� �����͸� ���
 * 			void write(int data) : data�� 1���ڸ� ���Ϸ� ���
 * 			void write(char[] buf) : buf�� ������ ���Ϸ� ���
 * 			void write(char[] buf,int start, int len) : buf�� start�ε������� 
 * 														len����Ʈ ��ŭ ������ ���Ϸ� ���
 * 			void write(String buf) : buf�� ������ ���Ϸ� ���
 * 
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		FileWriter fos = new FileWriter("out2.txt"); 
		//�������� ������ ���� ����, �����ϸ� ���Ͽ� ���� �߰�. => ������ IOException ó���� �ؾ��� : ���� ������
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('��');fos.write('��');fos.write('��');
		//getbytes() : ���ڿ��� byte[] �� ����
		char[] buf = "\n�ݰ����ϴ�. FileOutputStream �����Դϴ�.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("�ȳ�");
		fos.flush();
	}
}
