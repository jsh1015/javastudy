package chap05;
/*
 * ��ø�ݺ��� : �ݺ��� ���ο� �ݺ����� ������
 * ������ ����ϱ�
 */
public class LoopEx03 {
	public static void main(String[] args) {
		  for(int i=2; i<=9; i++) {
			System.out.println("\n"+ i + "��");
			for(int j=2; j<=9;j++) {
				System.out.println(i + "*" + j +"="+(i*j));
				}  
		/*for(int i=2; i<=9; i++) {
			System.out.println(i+"��");
			for(int j=2; j<=9; j++) {
				System.out.print(i + "*" + j +"="+(i*j) +" ");
			}
			System.out.println(" ");
			//���η� ���*/
		}
	}
}