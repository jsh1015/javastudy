package chap11;
/*
 * UnsupportFunctionException 클래스 구현하기
 * 1. 멤버변수 : private final int ERR_CODE;
 * 2. 멤버메서드 :
 * 		public int getErrCode() : ERR_CODE 값 반환.
 * 		public String getMessage() : 오버라이딩 메서드.
 * 				부모 클래스의 message값과 ERR_CODE 값 반환.
 * 3. 예외처리를 안해도 되도록 구현
 * 4. 생성자는 구동 클래스에 맞게 생서
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
			throw new UnsupportFunctionException("지원하지 않는 기능입니다.",100);
		}catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
		}
	}
}
