package chap11;
/*
 * 다중 catch 구문 예제
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException 예외 발생
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0])); //NumberFormatException 예외발생
			System.out.println(10/Integer.parseInt(args[0]));
			
			String str = null; //객체가 없다.
			System.out.println(str.charAt(0)); //객체가 없어 메소드 호출 X
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command라인에 파라미터를 입력하세요");
		}catch(NumberFormatException e) {
			System.out.println("파라미터 라인에 숫자를 입력하세요");
		}catch(RuntimeException e) { //전체 예외처리
			System.out.println("1. 오류발생 : 전산부로 전화요망");
			e.printStackTrace(); //몇번째 줄인지 알려줌
		}catch(Exception e) { //전체 예외처리
			System.out.println("2. 오류발생 : 전산부로 전화요망");
		}
		//상위클래스의 형태는 반드시 밑에 해줘야 함. 위에하면 위에서 다 처리하기 때문에 밑의 예외처리가 에러
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//		at chap11.ExceptionEx2.main(ExceptionEx2.java:8)
		
		//홍길동 입력후
//		홍길동
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "홍길동"
//			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
//			at java.base/java.lang.Integer.parseInt(Integer.java:658)
//			at java.base/java.lang.Integer.parseInt(Integer.java:776)
//			at chap11.ExceptionEx2.main(ExceptionEx2.java:10)		
	}

}
