package chap09;
interface RemoteControl{
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean a) {
		if(a) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("TV�� ������ " + volume + "���� �����մϴ�.");
	}
	
}
class Audio implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio�� ������ " + volume + "���� �����մϴ�.");
	}
}
public class Exam03 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); //TV�� �մϴ�.
		rc.setVolume(10); //TV�� ������ 10���� �����մϴ�.
		rc.turnOff(); //TV�� ���ϴ�.
		rc.setMute(true); //������ ó���մϴ�. default
		rc = new Audio();
		rc.turnOn(); //Audio �� �մϴ�.
		rc.setVolume(20); //Audio�� ������ 20���� �����մϴ�.
		rc.turnOff(); //Audio�� ���ϴ�.
		rc.setMute(false); //������ �����մϴ�.
		RemoteControl.changeBattery(); //�������� ��ȯ�մϴ�. static
	}
}