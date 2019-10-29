package chap03;

public class VarEx1 {
	public static void main(String[] args) { //프로그램의 시작점
		// 변수의 선언 및 초기화
		byte b1 = -22;
		byte b2; //변수의 선언 b2 저장공간 메모리 1바이트 할당
		//바이트로 저장할 수 있는 값의 범위. -128 ~ -127 저장가능
		b2 = -22; //변수의 초기화
		short s1 = -220;
		int i1 = 100;
		long l1 = 1000;
		//변수값 내용을 화면에 출력하기
		//System.out.println : 화면의 값을 출력.
		System.out.println("b1=" + b1); //b1=-22
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		System.out.println("b2=" + b2);
		float f1 = 1.0f;	//실수형은 무조건 double형
		double d1 = 2.0d;	//2d = 2.0
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		/*
		 * 실수형 리터널의 기본자료형은 double임
		 * float 리터널로 표시하기 위해서는 접미사를 붙여야한다.
		 * F,f : float 리터널
		 * D,d : double 리터널
		 * L,l : long 리터널
		*/
	}
}

/*
 * 자료형
 * 		기본형 - 논리형 : boolean(1)
 * 			      정수형 : byte(1),short(2),int(4),long(8)
 * 			      문자형 : char(2) 
 * 			      실수형 : float(4), double(8)
 * 		참조형 - 배열, 클래스, 인터페이스
 * 형변환 => VarEx2.java
 * 		1. 기본형과, 참조형사이는 형변환 불가. (Wrapper 클래스는 제외됨)
 * 		2. 기본형에서 boolean 7개의 자료형은 서로 형변환이 가능함
 * 		3. 자동형변환 : 형변환 연산자를 생략 가능한 형변환
 * 		      명시적 형변환 : 형변환 연산자를 생략 불가한 형변환
*/
