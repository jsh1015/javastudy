package chap06;
/*
 * 5명 학생의 국어, 영어, 수학 점수를 학생별 총점과 평균을 출력하고
 * 과목별 총점과 평균을 출력하기
 * [결과]
 * 		      국어   영어  수학   총점  평균
 * 1번학생 : 100  80  90  270 90.0..
 * 2번학생 :  80  95  100 275 90.0...
 */
public class Exam10 {
	public static void main(String[] args) {
		int score[][] = {{100,80,90},
						{75,80,65},
						{85,90,100},
						{50,80,70},
						{80,70,70}};
		
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		int sum = 0;
		int ksum = 0;
		int esum = 0;
		int msum = 0;
		int[] total = new int[3];
		for(int i=0; i<score.length; i++) {
			sum = 0;
			System.out.print(i+1 +"번학생\t");
//			for(int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//				sum += (int)score[i][j];
////				total[j] += score[i][j];
//			}
//			ksum += score[i][0];
//			esum += score[i][1];
//			msum += score[i][2];
//			System.out.print(sum + "\t");
//			System.out.println(sum/3f);
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += (int)score[i][j];
				total[j] += score[i][j];
			}
			System.out.println(sum + "\t" + (double)sum /score[i].length);
		}
		System.out.print("과목총점\t");
		for(int i=0; i<total.length; i++) {
			System.out.print(total[i] + "\t");
		}System.out.println();
		System.out.print("과목평균\t");
		for(int i=0; i<total.length; i++) {
			System.out.print((double)total[i] / score.length + "\t");
		}
//		
//		System.out.println("과목총점\t" + ksum + "\t" + esum+ "\t" + msum);
//		System.out.println("과목평균\t" + ksum/score.length + "\t" + esum/score.length+ "\t" + msum/score.length);
			
	}
}
