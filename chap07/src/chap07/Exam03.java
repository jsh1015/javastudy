package chap07;
/*
 * 
 */
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width +"," + height + ")";
	}
}
public class Exam03 {
	public static void main(String[] args) {
		//1. card1 ��ü �����ϱ�
		//2. card1.kind = "Heart", number = 1 ���ʱ�ȭ�ϱ�
		//3. card1 ����ϱ�
		//4. card2 ��ü �����ϱ�
		//5. card2.kind = "Spade", number=1�� �ʱ�ȭ�ϱ�
		//6. card2 ����ϱ�
		//7. card�� ũ�⸦ (50,80)���� �����ϱ�
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 1;
		System.out.println("card1 = " + card1);
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 1;
		System.out.println("card2 = " + card2);
		Card.width = 50;
		Card.height = 80;//��ü ����
		System.out.println(card1);
		System.out.println(card2);
	}

}
