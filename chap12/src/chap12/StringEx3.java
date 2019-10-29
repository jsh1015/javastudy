package chap12;

public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTM-CSS-JavaScript-Java-JSP-스프링"; //-으로 분류
		String[] subject = s.split("-");
		for(int i=0;i<subject.length;i++) {
			System.out.println((i+1)+":"+subject[i]);
		}
		s = "홍길동,김삿갓,이몽룡,성춘향,임꺽정";
		String[] names = s.split(","); //names라는 배열에  ,로 구분한 이름들을 넣는다. 
//		for(int i=0;i<names.length;i++) {
//			System.out.println((i+1)+":"+names[i]);
//		}
		for(String n: names) {
			System.out.println(n);
		}
		System.out.println("전체이름:" + names.length+"명");
		System.out.println();
		
		//숫자<=문자열
		int i = Integer.parseInt("100");
		System.out.println(i+1);
		double d = Double.parseDouble("100.5");
		System.out.println(d+0.1);
		System.out.println(++d);
		
		//문자열을 Format 형태로 출력하기
		String sf = String.format("%.2f", d+0.125);
		System.out.println(sf);
		sf = String.format("16진수 : %x", i);
		System.out.println(sf);
		sf = String.format("8진수 : %o", i);
		System.out.println(sf);

	}
}
