package chap11;
/*
 * throws : ����ó�� : �߻��� ���ܸ� �����ϱ�
 * throw  : ���ܹ߻� : ���� ���� �߻�
 */
public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("���� ���� �߻�");
		}catch(Exception e) {	//JVM���� ����ó�� �˾Ƽ� ����.
			e.printStackTrace();
		}
	}
}
