package chap11;

class MyException2 extends Exception{
	
}
class MyException3 extends MyException2{}

public class Exam05 {
	public static void main(String[] args) {
		try {
			throw new MyException3();
		}catch(MyException2 e){
			System.out.println("MyException2 예외처리");
		}catch(Exception e) {
			System.out.println("Exception 예외처리");
		}
		
		try {
			Thread.sleep(1000);  //Unhandled exception type InterruptedException 반드시 예외처리를 해야함
		} catch (InterruptedException e) { //API 에서 확인
			e.printStackTrace();
		} 
	}

}
