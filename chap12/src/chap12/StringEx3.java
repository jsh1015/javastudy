package chap12;

public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTM-CSS-JavaScript-Java-JSP-������"; //-���� �з�
		String[] subject = s.split("-");
		for(int i=0;i<subject.length;i++) {
			System.out.println((i+1)+":"+subject[i]);
		}
		s = "ȫ�浿,���,�̸���,������,�Ӳ���";
		String[] names = s.split(","); //names��� �迭��  ,�� ������ �̸����� �ִ´�. 
//		for(int i=0;i<names.length;i++) {
//			System.out.println((i+1)+":"+names[i]);
//		}
		for(String n: names) {
			System.out.println(n);
		}
		System.out.println("��ü�̸�:" + names.length+"��");
		System.out.println();
		
		//����<=���ڿ�
		int i = Integer.parseInt("100");
		System.out.println(i+1);
		double d = Double.parseDouble("100.5");
		System.out.println(d+0.1);
		System.out.println(++d);
		
		//���ڿ��� Format ���·� ����ϱ�
		String sf = String.format("%.2f", d+0.125);
		System.out.println(sf);
		sf = String.format("16���� : %x", i);
		System.out.println(sf);
		sf = String.format("8���� : %o", i);
		System.out.println(sf);

	}
}
