package chap09;
/*
 * �Ű������� �������̽������� ����ϴ� ��� => ����� �ǹ̷� ���� ����.
 *  Repairable �� ������� �ƴ���
 */
interface Repairable{}
class Unit{
	int hp;
	final int MAX;
	Unit(int hp){
		this.hp = hp;
		MAX = hp; // �ѹ� �ʱ�ȭ ��
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
	}
	public String toString() { 
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);
	}
	public String toString() { 
		return "DropShip";
	}
}
class Marine extends GroundUnit{
	Marine(){ 
		super(40);
	}
	public String toStirng() { 
		return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(60);
	}
	void repair(Repairable r) {	// Repairable Ÿ���� �ֵ鸸 ����.
		// Repairable �������̽��� �������.
		if(r instanceof Unit) { // Unit�� ������ü�� r����
			Unit u = (Unit)r;
			u.hp = u.MAX;
			System.out.println(r /*.toString() */ + " ���� �Ϸ�"); //r�� �ƹ��͵� ������ toString�� ȣ���� �� ����
		} // r�� ���������� ���⶧���� u�� ����ȯ
	}
	public String toString() {
		return "SCV";
	}
}
public class Exam02 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d =  new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
//		s.repair(m); //error Repairable�� ������ ��ü�� �ƴϹǷ� �Ұ���
		s.repair(s);
	}
}