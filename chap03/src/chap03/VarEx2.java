package chap03;

public class VarEx2 {
/*
 * 형변환 예제
 * 	작은 자료형 => 큰자료형 : 자동형변환
 * 	큰 자료형 => 작은자료형 : 명시적형변환
 * 
 * 	byte < short,char < int < long(8) < float(4) < double
 * 
 * a = b : 같다의 의미가 아니고, 대입의 의미
 * 		   (b의 값을 a에 대입해라)
 * 	lvalue : 대입연산자 왼쪽의 값. 반드시 변수여야함.
 * 	rvalue : 대입연산자 오른쪽의 값, 변수, 리터널, 수식가능
*/
	public static void main(String[] args) {
		//1. 참조형과 기본형은 형변환 불가
		String s ="abc"; // "" : 문자열, '':문자
		// s = 'a'; //참조형인 String 기본형인 char 형이 변환불가
		//2. 기본형 사이에 boolean을 제외한 7개는 서로 형변환 가능
		byte b1 = 100;
		int i1 = b1; 	// int <= byte 형변환됨. 자동형변환
		byte b2 = (byte)i1;//byte <= int 형변환됨. 명시적형변환
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
		// 큰자료형 = 큰자료형 + 작은자료형
		// String = String + 기본자료형
		System.out.println("번호:"+1+2+3); //문자열 다음에 숫자가 나오면 문자로 취급(1+2+3)하면 6
		System.out.println("번호:"+(1+2+3));
		System.out.println(1+2+3+"번");	//정수 다음에 문자가 나와서 6번
		
		char c3 = 'A'; //아스키코드 값 65
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + (char)i3);
		
		// int보다 작은 자료형의 연산의 결과는 int
		byte b4;
		byte b5=1;
		byte b6=2;
		b4 = (byte)(b5+b6);
		
		System.out.println("\uD64D");
		
		
	}

}
