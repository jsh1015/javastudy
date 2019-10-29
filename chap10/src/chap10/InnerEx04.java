package chap10;
/*
 * 무명의 내부 클래스
 */
interface I {
	void test();
}
abstract class Abs{
	abstract void test();
}

public class InnerEx04 {
	public static void main(String[] args) {
		
		I i = new I() { 
				int iv = 100;
			@Override
			public void test() {
				System.out.println("iv=" + iv);
				System.out.println("내부클래스의 test 메서드");
			}
		}; //이름이 없는거라 외부에서 사용불가
		i.test();
		
//		System.out.println(i.iv); // iv는 인터페이스 I의 멤버가 아니기때문에 error
		int iv = 100;
//		iv++;
		//무명의 내부클래스는 지역내부클래스의 변형
		//지역변수는 상수화가 필요함.
		
		Abs a = new Abs(){
			@Override
			void test() {
				System.out.println("Abs 내부 클래스의 test 메서드");
				System.out.println("iv=" + iv); //지역변수 iv 출력 - iv++하면 error 
			}
		};
		a.test();
	}

}
