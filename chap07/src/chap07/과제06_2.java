package chap07;
class Animal{
	String name;
	int age;
	void eat() {
		System.out.println("¸ÀÀÖ°Ô ¾ä¾ä");
	}
}
public class °úÁ¦06_2 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "¿ø¼şÀÌ";
		a1.age = 20;
		System.out.println("ÀÌ¸§(name):" + a1.name);
		System.out.println("³ªÀÌ(age):" + a1.age);
		a1.eat();
	}

}
