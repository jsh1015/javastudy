package chap03;

public class VarEx3 {
/*
 * Ư������ : \
 * 		���ڿ� �ǹ̸� �ο��ϰų�, �ǹ̸� ���� ������ �ǹ� ����
*/
	public static void main(String[] args) {
		char single = '\'';
		String hkd = "Hello \"ȫ�浿\"";
		System.out.println(single);
		System.out.println(hkd);
		String root = "c:\\";
		System.out.println(root);
		
		System.out.println("����\t�뱸\t�λ�");	//tabǥ��
		System.out.println("�ȳ��ϼ���\n�̺κ��� �����ٿ�"); //new line ǥ��
		System.out.println("\uD64D\uAE38\uB3D9"); //�����ڵ�(unicode)�� ǥ��
	}
}
