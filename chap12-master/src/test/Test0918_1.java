package test;
class Card {
	String kind;
	int num;
	Card(String kind,int num) {
		this.kind = kind;
		this.num = num;
	}
	Card() {
		this("Spade",1);
	}
	// equals : Object Ŭ���� ���. ���Ŭ������ ��ü���� ���� ����.
	//          ������ ���Ҷ� ���. ������ Ŭ�������� �������̵� �ʿ�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card c = (Card)obj;
			return kind.equals(c.kind) && num == c.num;
		} else return false;
	}
	//toString : Object Ŭ������ ���.
	//           ��ü�� ���ڿ� ǥ�ø� ���� �޼���.
	//           ���������̸��� ���ڿ��� ǥ���Ҷ� �ڵ� ȣ��Ǵ� �޼���
	//  Object Ŭ���� 
	//         Ŭ������@16�����ؽ��ڵ尪
	public String toString() {
		return "("+kind + "," + num + ")";
	}
}
public class Test0918_1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade",1);
		Card c2 = new Card();
		if(c1==c2) {
			System.out.println("c1�� c2�� ���� ��ü�Դϴ�.");
		} else {
			System.out.println("c1�� c2�� �ٸ� ��ü�Դϴ�.");
		}
		if(c1.equals(c2)) {
			System.out.println("c1�� c2�� ���� ������ ī�� �Դϴ�.");
		} else {
			System.out.println("c1�� c2�� �ٸ� ������ ī�� �Դϴ�.");
		}
		System.out.println("c1 ī�� :" + c1);
		System.out.println("c2 ī�� :" + c2);
	}
}
