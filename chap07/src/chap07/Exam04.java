package chap07;
/*
 * Rectangle2 Ŭ������ �����ϱ�
 * 	 ������� : width, height, serialNo(�簢����ȣ), sno(��ȣ �����ϱ� ���� ����)
 * 	 ��� �޼��� : 
 * 			int area() : ���� ���ϱ�
 * 			int length() : �ѷ��� ���ϱ�
 * 			public String toString() �޼��� �����ϱ�
 * ����Ŭ���� ����
 * 	Rectangle2 Ŭ������ 5�������� �ִ� �迭 �����ϱ�
 *  1���簢�� : ����(10), ����(20);
 *  2���簢�� : ����(15), ����(25);
 *  3���簢�� : ����(20), ����(30);
 *  
 *  ���� �簢���� ����, �ѷ� ����ϰ�, ��ü ������ �հ� �ѷ��� �� ����ϱ�
 *  [���]
 *  1���簢�� : (����,����) => ���� : 100, �ѷ� : 200
 *  
 *  ��ü �簢�� ������ ��:
 *  ��ü �簢�� �ѷ��� ��:
 */

class Rectangle2{
	int width, height, serialNo;
	static int sno;
	int area() {
		return width*height;
	}
	int length() {
		return (width*height)*2;
	}
	public String toString() {
		return serialNo + "���簢�� : (" + width + "," + height + ") => ���� : " + area() +
				", �ѷ� : " + length();
	}
}
public class Exam04 {
	public static void main(String[] args) {
//		Rectangle2 r1 = new Rectangle2();
//		r1.height = 10;
//		r1.width = 20;
//		r1.serialNo = 1;
//		
//		Rectangle2 r2 = new Rectangle2();
//		r2.height = 15;
//		r2.width = 25;
//		r2.serialNo = 1;
//		
//		Rectangle2 r3 = new Rectangle2();
//		r3.height = 10;
//		r3.width = 20;
//		r3.serialNo = 1;
		
		
		//����Ŭ����
		Rectangle2[] arr = new Rectangle2[3];
		int totalArea = 0;
		int totalLength = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i*5+10;
			arr[i].height = i*5+20;
			arr[i].serialNo = ++Rectangle2.sno;
			System.out.println(arr[i]);
			totalArea += arr[i].area();
			totalLength += arr[i].length();
		}
		
		System.out.println("��ü �簢�� ������ �� : " + totalArea );
		System.out.println("��ü �簢�� �ѷ��� �� : " + totalLength);
	}
}
