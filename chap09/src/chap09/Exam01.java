package chap09;
/*
 * Animal 클래스
 */
abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}//추상클래스

interface Flyable{
	void fly();
}

class Dove extends Animal implements Flyable{ //Animal을 상속 받았기때문에 다른 클래스 상속 불가
	Dove(){
		super("비둘기");
	}
	@Override
	public void fly() {
		System.out.println(name + "은 날아 다니는 새입니다."); //인터페이스의 접근자 public!!
	}
	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아 먹는다.");
	}
}
class Monkey extends Animal{
	Monkey(){
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따 먹는다.");
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) { //true
//			Flyable f = (Flyable)a;
//			f.fly();
			((Flyable) a).fly(); //a.fly()는 에러
			//Animal 타입으로는 fly()를 접근할 수 없음.
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) { //false
			((Flyable) a).fly();
		}
	}

}
