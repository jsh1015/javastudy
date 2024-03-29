package chap4;
/*
 * shift 연산자 : 비트 이동 연산자
 * 	<< n : 왼쪽으로 n비트만큼 이동. 오른쪽의 n비트 0으로 채움
 *  >> n : 오른쪽으로 n비트만큼 이동. 왼쪽의 n비트 부호비트 채움.
 *  >>> n : 오른쪽으로 n비트만큼 이동. 왼쪽의 n비트 0으로 채움.
 */
public class OpEx08 {
	public static void main(String[] args) {
		System.out.println("8<<2 : " + (8<<2)); //32
		/*
		 * 8	: 00001000
		 * <<2	: 00100000 : 32
		 */
		System.out.println("8>>2 : " + (8>>2)); //2
		/*
		 * 8	: 00001000
		 * >>2	: 00000010 : 2
		 */
		System.out.println("8>>>2 : " + (8>>>2));
		/*
		 * 8	: 00001000
		 * >>>2 : 00000010 : 2
		 */
		System.out.println("-8<<2 : " + (-8<<2));
		/*
		 * -8	: 11111000
		 * <<2	: 11100000 : -32
		 */
		System.out.println("-8>>2 : " + (-8>>2));
		/*
		 * -8	: 11111000
		 * >>2	: 11111110
		 */
		System.out.println("-8>>>2 : " + (-8>>>2)); //1073741822
		/*
		 * -8	: 11111000
		 * >>>2	: 00111110
		 */
	}
}
