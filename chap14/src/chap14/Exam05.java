package chap14;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * 섯다 게임하기
 * 1. SutdaDeck 객체 생성시 
 * 		[1k,2,3k,4,5,6,7,8k,9,10,1,2,3,4,5,6,7,8,9,10]
 */

class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang?"K":"");
	}
}
class SutdaDeck{
	final int CARD_NUM = 20;
	List<SutdaCard> cards = new ArrayList<>();
	int pos = 0;
	public static HashMap<String,Integer> jokbo = new HashMap<String,Integer>();
	SutdaDeck(){
		for(int i=0;i<CARD_NUM;i++) {
			cards.add(new SutdaCard(i%10+1,(i==0||i==2)?true:false));
		}
		System.out.println(cards); //SutdaCard의 toString() 메서드가 출력
		jokbo.put("KK", 4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+ i + i, 3000+(i*10));
		}
		jokbo.put("12",2060);
		jokbo.put("21",2060);
		jokbo.put("14",2050);
		jokbo.put("41",2050);
		jokbo.put("19",2040);
		jokbo.put("91",2040);
		jokbo.put("110",2030);
		jokbo.put("101",2030);
		jokbo.put("410",2020);
		jokbo.put("104",2020);
		jokbo.put("46",2010);
		jokbo.put("64",2010);
	}
	
	public void shuffle() {
		Collections.shuffle(cards); //List 객체들을 섞기
		System.out.println(cards);
	}
	public SutdaCard pick() {
		SutdaCard c = cards.remove(0); //list에서 카드를 한장 삭제하고 그 카드를 return
		System.out.println("남은카드의 갯수 : " +cards.size());
		return c ;
	}
}
class Player{
	String name;
	SutdaCard c1;
	SutdaCard c2;
	
	Player(String name,SutdaCard c1,SutdaCard c2){
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public int getPoint() {
		Integer result;
		if(c1.toString().indexOf("K")>0 && c2.toString().indexOf("K")>0) {
			result = SutdaDeck.jokbo.get("KK");
		}else {
			String key = "" + c1.num + c2.num;
			result = SutdaDeck.jokbo.get(key);
			if(result == null) {
				result = (c1.num + c2.num)%10;
			}
		}
		return result;
	}
	
	public String toString() {
		return "[" + name + "]" + c1 + "," + c2;
	}
}
public class Exam05 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck(); //족보값을 가지고 있어야함.		
		deck.shuffle();
		Player p1 = new Player("타짜", deck.pick(), deck.pick());
		Player p2 = new Player("고수", deck.pick(), deck.pick());
		System.out.println(p1);
		System.out.println(p2);
		if(p1.getPoint() > p2.getPoint()) { //%10+1000
			System.out.println(p1.name + "승리");
		}else if(p1.getPoint() < p2.getPoint()) {
			System.out.println(p2.name + "승리");
		}else {
			System.out.println("비김, 게임을 다시 하세요");
		}
	}
}
