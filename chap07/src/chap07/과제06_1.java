package chap07;
/*
 * 20190903
 * 17���� ��Ҹ� ������ �ִ� �迭 arr�� �����Ͽ� ���� ����� ���� ����ϱ�
 * Arrays.sort() �Լ� ������� �ʱ�
 */
public class ����06_1 {
	public static void main(String[] args) {
		int arr[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,15,13,9,31}; 
		
		int temp =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i ; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}	//����
		
		for(int a : arr) {
			System.out.print(a + ",");
		}
		System.out.println();
		
		int[][] arr2 = new int[5][5];
		
		int index = 0;
		
		for(int i=0; i<(int)arr2.length/2+1; i++) {
			for(int j=i; j<arr2[i].length-i; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		for(int i=(int)arr2.length/2+1; i<arr2.length; i++) {
			for(int j=arr2.length-i-1; j<=i; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(arr2[i][j] == 0) {
					System.out.print("\t");
				}else {
					System.out.printf("%4d\t",arr2[i][j]);
				}
			}
			System.out.println();
		}
	}

}
