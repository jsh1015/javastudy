package chap08;
/*
 * super() ������ : 
 */
class Super{	//��簴ü�� �����ڿ� ���缭 ȣ���ؾ���
	int x;
//	Super(int x){	//�ݵ�� �������� �־����.
//		this.x = x;
//	}
}
class Child extends Super{
	int y;
	public Child() { //��簴ü�� �����ڰ� �־�� ������ �����ϴ�
		super();	//�⺻��
//		super(100); //�θ�Ŭ������ �°� ���� �־���.
	}
}
public class SuperEx {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}

}
