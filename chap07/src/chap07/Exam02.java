package chap07;
/*
 * Rectangle 객체를 3개 저장할 배열을 생성하기
 * 0번지 : 가로=10, 세로=20
 * 1번지 : 가로=11, 세로=21
 * 2번지 : 가로=12, 세로=22
 * 인 객체를 생성하고
 * 각각의 넓이와 둘레 출력하기
 */
public class Exam02 {
	public static void main(String[] args) {
		Rectangle[] a = new Rectangle[3];	// Rectangle 타입의 배열 생성
		for(int i=0; i<a.length; i++) {
			a[i] = new Rectangle();	//Rectangle 객체를 객체화. 각각에 대한 객체를 만듬 /동적할당.
			a[i].width = 10+i;
			a[i].height = 20+i;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(i+ "번지 ");
			a[i].area();
			a[i].length();
		}
	}

}
