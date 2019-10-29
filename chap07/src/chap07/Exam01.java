package chap07;
/*
 * ����(width), ����(height)�� ������ �������ִ�
 * ���簢��(Rectangle) Ŭ���� �����
 * ��� �޼���δ� ���̸� ���ϴ� area(), �ѷ��� ���ϴ� length()�� ������.
 */
class Rectangle{
		int width;
		int height; //�������
		void area() {	//����޼���
			System.out.print("���� = " + width*height + ", ");
		}
		void length() {
			System.out.println("�ѷ� = " + (width+height)*2);
		}
}
/*
 * Exam01 : ���� Ŭ����. main �޼��带 ����� ������ �ִ� Ŭ����.
 * 		   public Ŭ����������.
 *  ������ �̸��� �ݵ�� public Ŭ������ �̸��� �����ؾ� ��.
 *  �ϳ��� ���Ͽ� �ΰ��� public Ŭ������ �Ұ�����.
 */
public class Exam01{ 
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();
		//���� : 30, ���� : 20 �� ���簢���� ��ü�� �����ϰ�, ����, �ѷ��� ����ϱ�
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		r2.area();
		r2.length();
	}

}
