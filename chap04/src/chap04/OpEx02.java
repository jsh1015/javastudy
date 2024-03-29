package chap04;
/*
 * 증감연산자 예제 2 : 증감연산자와 다른 연산자를 같이 사용하는 경우
*/
public class OpEx02 {
	public static void main(String[] args) {
		int x=5, y=5;
		y=x++;	//1. y=x, y=5, 2. x++: x=6
		System.out.println("x=" + x + ",y="+y); //x=6,y=5
		y=++x;	//1. ++x: x=7, 2. y=x, y=7
		System.out.println("x=" + x + ",y="+y);	//x=7,y=7
		System.out.println("x="+ x++);	//1. "x=7"출력, x++,x=8;
		System.out.println("x="+ ++x);
		x = y--;
		System.out.println("x=" + x + ",y="+y);
	}

}
