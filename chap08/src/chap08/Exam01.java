package chap08;
/*
 * SutdaCard 20������ �̷���� SutdaDeck Ŭ���� �����ϱ�
 * 1. �������
 * 	   SutdaCard 20���� ������ �迭
 * 2. ������
 * 	   SutdaCard 20���� �����Ͽ� �迭�� �����ϱ�
 * 3. �޼���
 * (1) void shuffle():ī�带 ����.
 * (2) SutdaCard pick(int index) : index �� �ش��ϴ� ī�� ������ ��ȯ
 * (3) SutdaCard pick() : ������ ī�� ������ ��ȯ
 * 
 * SutdaCard Ŭ����
 * 	1. ������� : int number, boolean isKwang
 *  2. ������ : this ������ �̿��ϱ�
 *  	- () : number=1, isKwang=true
 *  	- (int, boolean) : ��������� ���� �����ϱ�
 *  3. �޼���
 *  	info : number + isKwang?"K":"" ���� ����ϱ�
 */
class SutdaCard{
	int number;
	boolean isKwang;
	
	SutdaCard(int number, boolean isKwang){
		this.number = number;
		this.isKwang = isKwang;
	}
	SutdaCard(){
		this(1,true);
	}
	void info() {
		System.out.println(this);
	}
	public String toString() {
		return number + (isKwang?"K":"");
	}
}
//SutdaDeck has a SutdaCard ���� 
class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	
	SutdaDeck() {	//SutdaCard 20�� �迭�� �����ϱ�
		for(int i=0; i<cards.length; i++) {
			cards[i] = new SutdaCard(i%10+1,(i==0||i==2||i==7)?true:false);
			//cards[] �� ��üȭ
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		// int a = (int)(Math.random()*20);
		// return cards[a];
		return cards[(int)(Math.random()*20)];
	}
	
	void shuffle() {
		for(int i=0; i<1000; i++) {
			int a = (int)(Math.random()*20);
			int b = (int)(Math.random()*20);
					
			SutdaCard temp = cards[a];
			temp = cards[a];
			cards[a] = cards[b];
			cards[b] = temp ; 
		}
	}
	
	public String toString() {
		String result = "";
		for(SutdaCard c : cards) {
			result += c + ",";
		}
		return result;
	}
}
public class Exam01 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck(); //SutdaDeck�� ������
//		1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0)); //3K, 10
		System.out.println(deck.pick());
		
	}

}
