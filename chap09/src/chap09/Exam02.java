package chap09;
/*
 * 매개변수를 인터페이스형으로 사용하는 경우 => 허용의 의미로 많이 사용됨.
 *  Repairable 의 대상인지 아닌지
 */
interface Repairable{}
class Unit{
	int hp;
	final int MAX;
	Unit(int hp){
		this.hp = hp;
		MAX = hp; // 한번 초기화 됨
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
	void repair(Repairable r) {	// Repairable 타입인 애들만 가능.
		// Repairable 인터페이스로 묶어버림.
		if(r instanceof Unit) { // Unit의 하위객체가 r인지
			Unit u = (Unit)r;
			u.hp = u.MAX;
			System.out.println(r /*.toString() */ + " 수리 완료"); //r은 아무것도 없지만 toString은 호출할 수 있음
		} // r은 참조변수가 없기때문에 u로 형변환
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
//		s.repair(m); //error Repairable을 구현한 객체가 아니므로 불가능
		s.repair(s);
	}
}