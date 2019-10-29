package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
public class CalendarEx3 {
	public static void main(String[] args) throws ParseException {
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine(); //첫번째날짜입력
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String second = scan.nextLine(); //두번째날짜입력
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date fdate = sf.parse(first); //Date<=형식에 맞는 문자열
		Date sdate = sf.parse(second);
		//sdate.getTime() : 1970년부터 날짜까지의 시간을 밀리초
		long datecnt = (sdate.getTime() - fdate.getTime())/(1000*60*60*24);
		System.out.printf("%s -%s 일자의 차이 : %d\n",second,first,datecnt);
		
	}
}
