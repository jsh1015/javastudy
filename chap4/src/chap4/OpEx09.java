package chap4;
/*
 * 대입연산자 :
 */
public class OpEx09 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num); //100
		num += 10;
		System.out.println(num); //110
		num /= 10;
		System.out.println(num); //11
		num *= 2+3;
		System.out.println(num); //55
		System.out.println("\n");
		byte b =1;
		b*=2;
		System.out.println(b);
		b*=2;
		System.out.println(b);
		b*=2;
		System.out.println(b);
		// byte형이기 때문에 형변환이 필요/ b = (b*2);
	}
}
