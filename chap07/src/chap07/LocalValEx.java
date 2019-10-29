package chap07;

public class LocalValEx {

	public static void main(String[] args) { //args : 지역변수
		int num;		//지역변수
		boolean b =true;//지역변수
		if(b) {
			num = 100;
		}else {			//else가없으면 에러. b가 true가 아닐수도 있으니깐
			num = 200;
		}
		System.out.println(num);
		String grade;
		
		int score = 80; //지역변수
		switch(score/10) {
		case 9:grade="A"; break;
		case 8:grade="B"; break;
		case 7:grade="C"; break;
		case 6:grade="D"; break;
		default : grade="F";	//초기화가 안될수 있는 가능성이 있나
		}
		System.out.println("학점 : " + grade);
	}

}
