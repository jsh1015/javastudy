package chap09;
class LazerZet implements Printerable{
	@Override
	public void print(){
		System.out.println("레이저 Printer에서 출력함");
	}
}
class InkZet implements Printerable{
	@Override
	public void print(){
		System.out.println("잉크젯 Printer에서 출력함");
	}
}
class PrinterManager{
	//Printerable : Printerable 인터페이스의 구현객체를 리턴
	public static Printerable getPrinter(String type) {
		if(type.equals("INK"))
			return new InkZet(); //Printerable 로 형변환
		else
			return new LazerZet();
	}
}
// **** 인터페이스 ****
// 자료형처럼 쓸수있다.
// 상수와 추상메서드만 사용할 수 있다
public class PrinterEx01 {
	public static void main(String[] args) {
		Printerable able = PrinterManager.getPrinter("INK"); 
		able.print();
		able = PrinterManager.getPrinter("LAZER");
		able.print();
	}
}
