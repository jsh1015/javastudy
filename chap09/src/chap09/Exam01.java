package chap09;
/*
 * Animal Ŭ����
 */
abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}//�߻�Ŭ����

interface Flyable{
	void fly();
}

class Dove extends Animal implements Flyable{ //Animal�� ��� �޾ұ⶧���� �ٸ� Ŭ���� ��� �Ұ�
	Dove(){
		super("��ѱ�");
	}
	@Override
	public void fly() {
		System.out.println(name + "�� ���� �ٴϴ� ���Դϴ�."); //�������̽��� ������ public!!
	}
	@Override
	void eat() {
		System.out.println(name + "�� ���� ������ ��� �Դ´�.");
	}
}
class Monkey extends Animal{
	Monkey(){
		super("������");
	}
	@Override
	void eat() {
		System.out.println(name + "�� �������� ���Ÿ� �� �Դ´�.");
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) { //true
//			Flyable f = (Flyable)a;
//			f.fly();
			((Flyable) a).fly(); //a.fly()�� ����
			//Animal Ÿ�����δ� fly()�� ������ �� ����.
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) { //false
			((Flyable) a).fly();
		}
	}

}
