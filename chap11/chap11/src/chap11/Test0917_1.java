package chap11;

interface Beta {
//	String testIt();
}

class Alpha implements Beta {
	public String testIt() { 
		return "Tested";
	}
}

public class Test0917_1 {
	 static Beta getIt() {
		 return new Alpha(); //Beta �������̽��� ������ ����Ŭ������ ��ü
	 }

	 public static void main(String[] args) {
		 Beta b = getIt();
//		 Alpha a = (Alpha)b;
//		 System.out.println(a.testIt());
		 System.out.println(((Alpha)b).testIt());
	 }
}
//b�� Beta�� ��ü�ε� Beta�������̽� ���� testIt()�޼��尡 ���⶧���� ������ �߻��Ѵ�.
//�׷��Ƿ� �������̽� �ȿ� testIt �߻�޼��带 �����.
