package chap03;

public class VarEx2 {
/*
 * ����ȯ ����
 * 	���� �ڷ��� => ū�ڷ��� : �ڵ�����ȯ
 * 	ū �ڷ��� => �����ڷ��� : ���������ȯ
 * 
 * 	byte < short,char < int < long(8) < float(4) < double
 * 
 * a = b : ������ �ǹ̰� �ƴϰ�, ������ �ǹ�
 * 		   (b�� ���� a�� �����ض�)
 * 	lvalue : ���Կ����� ������ ��. �ݵ�� ����������.
 * 	rvalue : ���Կ����� �������� ��, ����, ���ͳ�, ���İ���
*/
	public static void main(String[] args) {
		//1. �������� �⺻���� ����ȯ �Ұ�
		String s ="abc"; // "" : ���ڿ�, '':����
		// s = 'a'; //�������� String �⺻���� char ���� ��ȯ�Ұ�
		//2. �⺻�� ���̿� boolean�� ������ 7���� ���� ����ȯ ����
		byte b1 = 100;
		int i1 = b1; 	// int <= byte ����ȯ��. �ڵ�����ȯ
		byte b2 = (byte)i1;//byte <= int ����ȯ��. ���������ȯ
		System.out.println("b1="+b1+",i1="+i1);
		byte b3 = (byte)256; // 1/00000000 => 00000000
		System.out.println("b3=" + b3);
		long l1 = 128l;
		float f1 = l1;
		long l2 = (long)f1;
		char c1 = 'A';
		short s1 = (short)c1;
		char c2 = (char)b1;
		
		int i2 = (int)(i1 + l1);
		// ū�ڷ��� = ū�ڷ��� + �����ڷ���
		// String = String + �⺻�ڷ���
		System.out.println("��ȣ:"+1+2+3); //���ڿ� ������ ���ڰ� ������ ���ڷ� ���(1+2+3)�ϸ� 6
		System.out.println("��ȣ:"+(1+2+3));
		System.out.println(1+2+3+"��");	//���� ������ ���ڰ� ���ͼ� 6��
		
		char c3 = 'A'; //�ƽ�Ű�ڵ� �� 65
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + (char)i3);
		
		// int���� ���� �ڷ����� ������ ����� int
		byte b4;
		byte b5=1;
		byte b6=2;
		b4 = (byte)(b5+b6);
		
		System.out.println("\uD64D");
		
		
	}

}
