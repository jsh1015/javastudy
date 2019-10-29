package chap11;

class MyException2 extends Exception{
	
}
class MyException3 extends MyException2{}

public class Exam05 {
	public static void main(String[] args) {
		try {
			throw new MyException3();
		}catch(MyException2 e){
			System.out.println("MyException2 ����ó��");
		}catch(Exception e) {
			System.out.println("Exception ����ó��");
		}
		
		try {
			Thread.sleep(1000);  //Unhandled exception type InterruptedException �ݵ�� ����ó���� �ؾ���
		} catch (InterruptedException e) { //API ���� Ȯ��
			e.printStackTrace();
		} 
	}

}
