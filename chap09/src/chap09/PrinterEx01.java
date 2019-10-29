package chap09;
class LazerZet implements Printerable{
	@Override
	public void print(){
		System.out.println("������ Printer���� �����");
	}
}
class InkZet implements Printerable{
	@Override
	public void print(){
		System.out.println("��ũ�� Printer���� �����");
	}
}
class PrinterManager{
	//Printerable : Printerable �������̽��� ������ü�� ����
	public static Printerable getPrinter(String type) {
		if(type.equals("INK"))
			return new InkZet(); //Printerable �� ����ȯ
		else
			return new LazerZet();
	}
}
// **** �������̽� ****
// �ڷ���ó�� �����ִ�.
// ����� �߻�޼��常 ����� �� �ִ�
public class PrinterEx01 {
	public static void main(String[] args) {
		Printerable able = PrinterManager.getPrinter("INK"); 
		able.print();
		able = PrinterManager.getPrinter("LAZER");
		able.print();
	}
}
