package chap07;
class Animal{
	String name;
	int age;
	void eat() {
		System.out.println("���ְ� ���");
	}
}
public class ����06_2 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "������";
		a1.age = 20;
		System.out.println("�̸�(name):" + a1.name);
		System.out.println("����(age):" + a1.age);
		a1.eat();
	}

}
