package chap07;
/*
 * Rectangle ��ü�� 3�� ������ �迭�� �����ϱ�
 * 0���� : ����=10, ����=20
 * 1���� : ����=11, ����=21
 * 2���� : ����=12, ����=22
 * �� ��ü�� �����ϰ�
 * ������ ���̿� �ѷ� ����ϱ�
 */
public class Exam02 {
	public static void main(String[] args) {
		Rectangle[] a = new Rectangle[3];	// Rectangle Ÿ���� �迭 ����
		for(int i=0; i<a.length; i++) {
			a[i] = new Rectangle();	//Rectangle ��ü�� ��üȭ. ������ ���� ��ü�� ���� /�����Ҵ�.
			a[i].width = 10+i;
			a[i].height = 20+i;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(i+ "���� ");
			a[i].area();
			a[i].length();
		}
	}

}
