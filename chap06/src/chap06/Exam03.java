package chap06;
/*
 * 1부터9까지 숫자 중 중복되지 않는 3자리 숫자를 임의로 생성하는 프로그램 작성하기
 */
public class Exam03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] nums = new int[3];
		for(int i=0;i<10000;i++) {
			int f = (int)(Math.random() * 9);//3
			int t = (int)(Math.random() * 9);//8
			//arr[f], arr[t] 바꾸기.
			int tmp = arr[f];
			arr[f]=arr[t];
			arr[t]=tmp;
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=arr[i];
		}
		for(int n : nums)
			System.out.print(n + ",");
	}
}