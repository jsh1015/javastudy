package chap07;
/*
 * 선언 위치에 따른 변수의 종류
 * 클래스 변수 : 클래스 내부에 선언.
 * 			  static 예약어로 선언함
 * 			   클래스 정보가 메모리에 로드될때 변수 메모리 할당.
 *  		   객체화와 관련없는 함수임
 *  		   메모리 할당 위치 : 클래스 영역
 *  		   클래스의 모든 객체의 공통 변수로 사용됨.
 *  		   사용 : 클래스명.변수명.
 * 인스턴스 변수 : 클래스 내부에 선언됨.
 * 				자료형 변수명; 선언됨.
 * 				객체화 시 메모리 할당받음.
 * 				반드시 객체화 되어야 변수를 사용할 수 있음
 * 				메모리 할당 위치 : 힙영역
 * 				사용 : 참조변수명.변수명
 * 지역변수(매개변수 포함) : 메서드 내부에서 선언됨.
 * 						초기화 되어야 함
 * 						변수선언이 실행될 때 메모리 할당.
 * 						메모리 할당 위치 : 스택영역
 * 						사용 : 변수명
 */
class Sonata{
	String color;	//인스턴스변수
	int number;		//인스턴스변수
	static int width = 250;  //클래스변수, static변수 
	static int height = 150; //클래스변수
	public String toString() {
		return color + ":" + number + "(" + width + "," +height + ")";
	}
}
public class SonataEx01 {
	public static void main(String[] args) {
		System.out.println("자동차 크기 : " + Sonata.width + "," + Sonata.height); //static이 붙은애들만 사용가능
		Sonata car1 = new Sonata();	//car1 지역변수
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1:" + car1); //car1.toString() 메서드호출 	
		//toString메서드가 자동으로 호출됨
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
