package chap11;

import java.io.IOException;

/*
 * �������̵� �� �޼����� ����ó���� �θ�޼����� ����ó���� ���ų� ���� ������ �����ϴ�.
 * ���� ���þ��� ����ó���� �ȵȴ�. (IOException)
 */
class Parent{
	void method(int i) throws RuntimeException{
		System.out.println(i);
	}
}
class Child extends Parent{
	@Override
	void method(int i){
		System.out.println(i);
		
		//�θ�Ŭ���� �� ���þ��� ����ó���� �ϱ� ���ؼ� try catch�������� ���´�.
		try {
			throw new IOException();
		}catch(IOException e){
			
		}
	}
}
public class ExceptionEx9 {
	public static void main(String[] args) {
	}
}
