package chap4;

import java.util.Scanner;

/*
 * 조건 연산자를 이용하기
 * 점수를 입력받아서 90이상이면 "A학점" 80이상이면"B학점" 70이상이면 "C학점"
 * 				60이상이면 "D학점" 그외는 "F학점" 출력하기
 */
public class Exam07 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String result;
		if(a>=90) {
			result = "A학점";
		}else if(a>=80) {
			result = "B학점";
		}else if(a>=70) {
			result = "C학점";
		}else if(a>=60) {
			result = "D학점";
		}else {
			result = "F학점";
		}
		System.out.println(a+ "점수는 " + result + " 입니다");
		/*System.out.println(a + "점수는" +
							((a>=90)?"A":(a>=80)?"B":
							(a>=70)?"C":(a>=70)?"D":"F")+ "학점 입니다.");	*/
	}

}
