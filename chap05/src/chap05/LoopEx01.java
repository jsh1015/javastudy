package chap05;
/*
 * �ݺ��� ����
 * for
 * 		for(�ʱⰪ;���ǽ�;������){ ...}
 * 		: �ַ� ���۰� ���ᰡ �����Ȱ��. �������� ó��.
 * while
 * 		while(���ǽ�){...}
 * 		: ��������϶�.
 * 		  exit ���ڰ� �Էµɶ� ����, 9���ڰ� �Էµɶ� ����...
 * do while
 * 		do{...} while(���ǽ�);
 * 		: ��������϶�.
 * 		    ���ǿ� ������� �ѹ��� ������ ������ ��.
 */
public class LoopEx01 {

	public static void main(String[] args) {
		/*System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5); 
		*/
		System.out.println("for�������� 1~5���� ����ϱ�");
		for(int i=1; i<=5; i++) {
			System.out.print(i); //12345
		}
		System.out.println();
		
		System.out.println("while�������� 1~5���� ����ϱ�");
		int i = 1;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		System.out.println("do-while�������� 1~5���� ����ϱ�");
		i= 1;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		System.out.println();
	}

}
