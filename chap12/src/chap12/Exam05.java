package chap12;
/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : String format (String str, int len, int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 * 		 나머지 공간은 공백으로 채운다.
 * 		(0:왼쪽정렬, 1:가운데정렬, 2:오른쪽정렬)
 */
public class Exam05 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0)); //자릿수, 정렬
	}
	static String format(String str, int len, int align) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<len;i++) {
			sb.append(" "); //sb에 len만큼 공백을만듬
		}
		int l = len - str.length(); 
		switch(align) {
		case 0 : sb.replace(0, str.length(), str); break;
		case 1 : sb.replace(l/2, str.length()+l/2, str); break;
		case 2 : sb.replace(l, str.length()+1, str); break;
		}
		if(str.length() >= len) {
			return str.substring(0,len);
		} //자리수가 str길이보다 작을때
		return sb.toString();
	}
}
