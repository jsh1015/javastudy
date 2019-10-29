package chap07;
/*
 * ���� ��ġ�� ���� ������ ����
 * Ŭ���� ���� : Ŭ���� ���ο� ����.
 * 			  static ������ ������
 * 			   Ŭ���� ������ �޸𸮿� �ε�ɶ� ���� �޸� �Ҵ�.
 *  		   ��üȭ�� ���þ��� �Լ���
 *  		   �޸� �Ҵ� ��ġ : Ŭ���� ����
 *  		   Ŭ������ ��� ��ü�� ���� ������ ����.
 *  		   ��� : Ŭ������.������.
 * �ν��Ͻ� ���� : Ŭ���� ���ο� �����.
 * 				�ڷ��� ������; �����.
 * 				��üȭ �� �޸� �Ҵ����.
 * 				�ݵ�� ��üȭ �Ǿ�� ������ ����� �� ����
 * 				�޸� �Ҵ� ��ġ : ������
 * 				��� : ����������.������
 * ��������(�Ű����� ����) : �޼��� ���ο��� �����.
 * 						�ʱ�ȭ �Ǿ�� ��
 * 						���������� ����� �� �޸� �Ҵ�.
 * 						�޸� �Ҵ� ��ġ : ���ÿ���
 * 						��� : ������
 */
class Sonata{
	String color;	//�ν��Ͻ�����
	int number;		//�ν��Ͻ�����
	static int width = 250;  //Ŭ��������, static���� 
	static int height = 150; //Ŭ��������
	public String toString() {
		return color + ":" + number + "(" + width + "," +height + ")";
	}
}
public class SonataEx01 {
	public static void main(String[] args) {
		System.out.println("�ڵ��� ũ�� : " + Sonata.width + "," + Sonata.height); //static�� �����ֵ鸸 ��밡��
		Sonata car1 = new Sonata();	//car1 ��������
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1:" + car1); //car1.toString() �޼���ȣ�� 	
		//toString�޼��尡 �ڵ����� ȣ���
		Sonata car2 = new Sonata();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2:" + car2);
		car2.width = 300;
		car1.height = 200;
		System.out.println("car1:" + car1);
		System.out.println("car2:" + car2);	//
	}
}
