package chap14;

import java.util.*;

/*
 * 1. ���ѹα�(����), ĳ����(��Ÿ��), ����(����), ������(����)�� HashMap�� �����ϰ�
 *	    ȭ�鿡�� �����̸��� �Է¹޾�, �ش糪���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
 * 2. ��ϵ� ���� �ƴ� ��� "��ϵ� ������ �����ϴ�. ����Ͻðڽ��ϱ�?(���:y)"
 * 		=> y,Y�ΰ�� ������ ����ϱ�
 * 3. ���α׷� ������ ���� ��ϵ� ����� ���� ����� ����ϱ� 
 */
public class Exam04 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		String[] a = {"���ѹα�","ĳ����","����","������"};
		String[] b = {"����","��Ÿ��","����","����"};
		for(int i=0;i<a.length;i++) {
			m.put(a[i], b[i]);
		}
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���� �Է��ϼ���(���ѹα�|ĳ����|����|������|����:��)");
			String c = scan.next();
			if(c.equals("��")) {
				break;
			}
			if(m.get(c)==null) {
				System.out.println(" * ��ϵ� ������ �����ϴ�. ����Ͻðڽ��ϱ�? (���:y)");
				String yn = scan.next();
				if(yn.equalsIgnoreCase("y")) {
					System.out.println(" - ���� �Է��ϼ���");
					String a1 = scan.next();
					System.out.println(" - ������ �Է��ϼ���");
					String b1 = scan.next();
					m.put(a1, b1);
					System.out.println("*����� �Ϸ�Ǿ����ϴ�*");
				}
			}
			System.out.println(c + "�� ���� : " + m.get(c));
		}
		Set<Map.Entry<String, String>> entry = m.entrySet();
		for(Map.Entry<String, String> r : entry) {
			System.out.println(r.getKey() + "�� ���� : " + r.getValue());
		}
//		for(Object k : m.entrySet()) {
//			System.out.println(k);
//		}
		System.out.println("���α׷� ����");
	}
}
