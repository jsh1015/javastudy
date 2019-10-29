package chap12;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); //E, 5번째 문자 리턴
		System.out.println(s.compareTo("abc")); //-32  
		// <정렬관련 메서드> "ABCDEFGH" - "abc" : (65)A - (97)a = -32
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0
		//대소문자 구분없이
		System.out.println(s.concat("abc")); //ABCDEFGHabc
		//concat() : 문자열 연결. s = s + "abc"
		
		System.out.println(s.endsWith("GH"));//true
		//endsWith : s문자열의 끝이 "GH"?
		System.out.println(s.startsWith("AB"));//true
		//s문자열의 시작이 "AB"?
		
		System.out.println(s.equalsIgnoreCase("abcdefgh"));//true
		//대소문자 구분없이 s문자열 과 abcdefgh 이 같음?
		
		s = new String("This is a String");
		System.out.println(s.indexOf('i')); //2
		//indexOf : 문자나 문자열의 위치 리턴
		System.out.println(s.indexOf('i',5)); //5
		//5번 인덱스 포함 이후 문자나 문자열의 위치를 리턴
		System.out.println(s.indexOf('i',15)); //-1
		//15번 인덱스 포함 이후 문자나 문자열의 위치를 리턴 : -1 15번인덱스 이후에 해당문자없음
		System.out.println(s.indexOf("is")); //2
		//is 문자열의 위치를 리턴
		System.out.println(s.lastIndexOf("is")); //5
		//뒤쪽부터 검색 (마지막 is)
		System.out.println(s.length()); //16
		//s 문자열의 길이
		System.out.println(s.replace("is", "QR")); //ThQR QR a String
		//is를 QR로 치환
		System.out.println(s.substring(5));//is a String
		//5번째 인덱스부터 부분 문자열로 출력
		System.out.println(s.substring(5,13)); //is a Str
		//5번째부터 13번째인덱스 전까지 출력
		System.out.println(s.toLowerCase());//this is a string
		//소문자로 변경
		System.out.println(s.toUpperCase());//THIS IS A STRING
		//대문자로 변경
		System.out.println("   문자열 trim 메서드      ".trim());//문자열 trim 메서드
		//양쪽 공백을 제거
	}
}
