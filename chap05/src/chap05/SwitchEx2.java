package chap05;
/*
 * switch ������ ���Ǵ� �ڷ���
 * 	=> byte, short, int, char, String
 * switch ������ ������ �ʴ� �ڷ���
 * 	=> boolean, long, float, double
 * 
 * ���ǹ� : if, switch
 * 		��� switch ������ if������ ���� ������
 * 		��� if ������ switch �������� ������ �� ����.
 */
public class SwitchEx2 {

	public static void main(String[] args) {
		int value =1;
		switch(value) {
		//���� ���� �ȵ�
		case 1 : System.out.println(value); break;
		case 2 : System.out.println(value); break;
		default : System.out.println(value); break;
		}
	}
}
