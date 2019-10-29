package chap08;
/*
 * ��ӿ���
 * 
 * 	1. �ڼհ�ü�� ��ü ������ �θ�ü�� ���� �����Ѵ�.
 * 	2. �ڼհ�ü�� �θ� ��ü�� ����� ���� �� �� �ִ�.
 * 	3. Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
 * 	      �ڼ�Ŭ������ �θ�� �Ѱ��� �����ϴ�.
 * 	4. ��� Ŭ������ Object Ŭ������ ��ӹ޴´�. (class Phone extends Object)
 * 	      ��� ��ü�� Object Ŭ������ ��ü�� �����Ѵ�.
 * 	      ��� ��ü�� Object Ŭ������ ����� ������ �� �ִ�.
 */
class Phone{
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("��ȭ�ɱ�");
	}
	void receive() {
		if(power)
			System.out.println("��ȭ�ޱ�");
	}
}
class SmartPhone extends Phone{	//Phone ��ü�� ��ӹ��� SmartPhone
	void setApp(String name) {
		if(power)
			System.out.println(name + "��ġ �� ~~");
	}
}
public class PhoneEx01 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("���̹�");
	}
}
