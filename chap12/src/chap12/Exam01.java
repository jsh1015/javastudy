package chap12;
/*
 * count �޼��� �����ϱ�
 * int count("���ڿ��ҽ�", "ã�¹��ڿ�") :���ڿ� �ҽ����� ã�� ���ڿ��� ������ ����
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12"));//2
		System.out.println(count("12345AB12AB345AB","AB"));//3
		System.out.println(count("12345","6"));//0
	}

	static int count(String a, String b) {
//		int cnt = 0;
//		int index = a.indexOf(b); //b�� ��ġ
//		while(true) {
//			if(a.indexOf(b, index) == -1) {
//				break;
//			}else{
//				cnt++;
//				index = a.indexOf(b, index)+1;
//			}
//		}
//			return cnt;
		
		int idx=0, cnt=0;
		while(true) {
			idx = a.indexOf(b,idx); //a�� b��ġ
			if(idx == -1) break;
			idx++;
			cnt++;
		}
		return cnt;
	}
}
