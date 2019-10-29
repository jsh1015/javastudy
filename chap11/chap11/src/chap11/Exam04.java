package chap11;
/*
 * UnsupportFunctionException Ŭ���� �����ϱ�
 * 1. ������� : private final int ERR_CODE;
 * 2. ����޼��� :
 * 		public int getErrCode() : ERR_CODE �� ��ȯ.
 * 		public String getMessage() : �������̵� �޼���.
 * 				�θ� Ŭ������ message���� ERR_CODE �� ��ȯ.
 * 3. ����ó���� ���ص� �ǵ��� ����
 * 4. �����ڴ� ���� Ŭ������ �°� ����
 */
class UnsupportFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportFunctionException(String msg, int ERR_CODE){
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	public String getMessage() {
		return super.getMessage() + ERR_CODE; 
	}
}
public class Exam04 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.",100);
		}catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
		}
	}
}
