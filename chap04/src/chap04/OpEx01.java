package chap04;
/*
 * ����������
 * 		++ : ������ ���� 1����.
 * 		-- : ������ ���� 1����.
*/
public class OpEx01 {
	public static void main(String[] args) {
		int x =5,y=5;
		x++;	//������
		y--;
		System.out.println("x="+x+",y="+y);
		x=y=5;
		++x;	//������
		--y;
		System.out.println("x="+x+",y="+y);
	}
}
