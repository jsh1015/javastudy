package chap04;
/*
 * 증감연산자
 * 		++ : 숫자의 값을 1증가.
 * 		-- : 숫자의 값을 1감소.
*/
public class OpEx01 {
	public static void main(String[] args) {
		int x =5,y=5;
		x++;	//후위형
		y--;
		System.out.println("x="+x+",y="+y);
		x=y=5;
		++x;	//전위형
		--y;
		System.out.println("x="+x+",y="+y);
	}
}
