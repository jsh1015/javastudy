package chap11;
/*
 * throws : 예외처리 : 발생된 예외를 제거하기
 * throw  : 예외발생 : 예외 강제 발생
 */
public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			throw new Exception("예외 강제 발생");
		}catch(Exception e) {	//JVM에서 예외처리 알아서 해줌.
			e.printStackTrace();
		}
	}
}
