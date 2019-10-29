package chap08;
/*
 * super() 생성자 : 
 */
class Super{	//모든객체는 생성자에 맞춰서 호출해야함
	int x;
//	Super(int x){	//반드시 정수값을 넣어야함.
//		this.x = x;
//	}
}
class Child extends Super{
	int y;
	public Child() { //모든객체는 생성자가 있어야 생성이 가능하다
		super();	//기본값
//		super(100); //부모클래스에 맞게 값을 넣어줌.
	}
}
public class SuperEx {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}

}
