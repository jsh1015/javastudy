package chap07;
class Coin{
	int side; 
	int serialNo;
	static int sno;
	
	void flip() {
		side = (int)(Math.random()*2);
	}
}
public class ����06_3 {
	public static void main(String[] args) {
		Coin[] co = new Coin[10];
		int totalCnt = 0; //�ո鰹��
		int totalCnt2 = 0;	//�޸鰹��
		for(int i=0; i<co.length; i++) {
			co[i] = new Coin();
			co[i].serialNo = ++Coin.sno;
			System.out.print(co[i].serialNo + "������ : ");
			co[i].flip();
			if(co[i].side ==0) {
				System.out.println("�ո�");
				totalCnt++;
			}else {
				System.out.println("�޸�");
				totalCnt2++;
			}
		}
		
		System.out.println("��ü �ո� ������ ���� : " + totalCnt);
		System.out.println("��ü �޸� ������ ���� : " + totalCnt2);
		
		
	}

}
