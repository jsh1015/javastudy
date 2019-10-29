package test;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * 화면으로부터 날짜를 "2019/05/11"의 형태로 입력받아서 무슨요일인지 
 * 출력하는 프로그램을 작성하시오.
 * 입력된 날짜가 9999/99/99면 프로그램을 종료한다.
 * 단 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받도록 한다.
 * => 예외처리 사용
 */
public class Test0922_1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("날짜를 입력하세요 (yyyy/MM/dd)");
			String day = scan.next();
			Date d = null;
			if(day.equals("9999/99/99")) break;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				d = sdf.parse(day);
			}catch(ParseException e){
				System.out.println("잘못된 형식입니다. 다시 입력하세요.");
				continue;
			}
			SimpleDateFormat sdf2 = new SimpleDateFormat("E요일입니다.");
			System.out.println(sdf2.format(d));
		}
		System.out.println("프로그램 종료");
	}
}

