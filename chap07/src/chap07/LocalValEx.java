package chap07;

public class LocalValEx {

	public static void main(String[] args) { //args : ��������
		int num;		//��������
		boolean b =true;//��������
		if(b) {
			num = 100;
		}else {			//else�������� ����. b�� true�� �ƴҼ��� �����ϱ�
			num = 200;
		}
		System.out.println(num);
		String grade;
		
		int score = 80; //��������
		switch(score/10) {
		case 9:grade="A"; break;
		case 8:grade="B"; break;
		case 7:grade="C"; break;
		case 6:grade="D"; break;
		default : grade="F";	//�ʱ�ȭ�� �ȵɼ� �ִ� ���ɼ��� �ֳ�
		}
		System.out.println("���� : " + grade);
	}

}
