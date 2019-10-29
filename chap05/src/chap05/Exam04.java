package chap05;

public class Exam04 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.print(i + "´Ü\t");
		}System.out.println();
		for(int i=2; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i +"="+(i*j) +"\t");
			}
			System.out.println();
		}
	}
}