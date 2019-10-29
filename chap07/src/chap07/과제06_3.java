package chap07;
class Coin{
	int side; 
	int serialNo;
	static int sno;
	
	void flip() {
		side = (int)(Math.random()*2);
	}
}
public class °úÁ¦06_3 {
	public static void main(String[] args) {
		Coin[] co = new Coin[10];
		int totalCnt = 0; //¾Õ¸é°¹¼ö
		int totalCnt2 = 0;	//µÞ¸é°¹¼ö
		for(int i=0; i<co.length; i++) {
			co[i] = new Coin();
			co[i].serialNo = ++Coin.sno;
			System.out.print(co[i].serialNo + "¹øµ¿Àü : ");
			co[i].flip();
			if(co[i].side ==0) {
				System.out.println("¾Õ¸é");
				totalCnt++;
			}else {
				System.out.println("µÞ¸é");
				totalCnt2++;
			}
		}
		
		System.out.println("ÀüÃ¼ ¾Õ¸é µ¿ÀüÀÇ °¹¼ö : " + totalCnt);
		System.out.println("ÀüÃ¼ µÞ¸é µ¿ÀüÀÇ °¹¼ö : " + totalCnt2);
		
		
	}

}
