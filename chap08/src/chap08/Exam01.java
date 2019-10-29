package chap08;
/*
 * SutdaCard 20장으로 이루어진 SutdaDeck 클래스 구현하기
 * 1. 멤버변수
 * 	   SutdaCard 20장을 저장할 배열
 * 2. 생성자
 * 	   SutdaCard 20장을 생성하여 배열에 저장하기
 * 3. 메서드
 * (1) void shuffle():카드를 섞기.
 * (2) SutdaCard pick(int index) : index 에 해당하는 카드 한장을 반환
 * (3) SutdaCard pick() : 임의의 카드 한장을 반환
 * 
 * SutdaCard 클래스
 * 	1. 멤버변수 : int number, boolean isKwang
 *  2. 생성자 : this 생성자 이용하기
 *  	- () : number=1, isKwang=true
 *  	- (int, boolean) : 멤버변수에 값을 저장하기
 *  3. 메서드
 *  	info : number + isKwang?"K":"" 정보 출력하기
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
//SutdaDeck has a SutdaCard 관계 
class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	
	SutdaDeck() {	//SutdaCard 20장 배열에 저장하기
		for(int i=0; i<cards.length; i++) {
			cards[i] = new SutdaCard(i%10+1,(i==0||i==2||i==7)?true:false);
			//cards[] 를 객체화
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
		SutdaDeck deck = new SutdaDeck(); //SutdaDeck의 생성자
//		1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0)); //3K, 10
		System.out.println(deck.pick());
		
	}

}
