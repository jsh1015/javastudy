package chap08;
import java.util.Date;
/*
 * ȸ�簡 ����ϴ� ���� ������ �������� �ִ�.
    ������ ���������� ���������� ���� ������.
  ��� ������ ��������(type), �̸�(name), �ּ�(address),�ҼӺμ�(dept)������ �����٤�.
  ���������� ������ȣ(empNo), ����(position), ����(salary)�� ������.
  ������������ ��ุ����(expireDate), �⺻�ӱ�(primaryPay)�� ������.

   ����Ŭ����(Employee)
   �������� Ŭ����(FormalEmployee)
   ����������Ŭ����(InformalEmployee)

   ���� ��� ������ �޿��� �޴´�.
   ���������� �޿��� ���� / 12 �� 

   ������������ �⺻�Ա�
   ��� Ŭ������ getPay() �޼��带 �����ϱ�
 */
class Employee{
	static String type;
	String name, address, dept;
}
class FormalEmployee extends Employee{
	String empNo;
	int salary;
	String position;
	FormalEmployee(String name, String address, String dept, String empNo, 
			int salary, String position ){
		Employee.type = "������";
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
	}
	public String toString() {
		return type + ", �̸� = " + name +", �ּ�="+address + ", �μ�=" + dept
				+", ������ȣ="+empNo +", ����=" + position+", ����=" + salary;
	}
	public int getPay() {
		int a = salary/12;
		return a;
	}
}
class InformalEmployee extends Employee{
	Date expireDate;
	int primaryPay;
	InformalEmployee(String name, String address, String dept, Date expireDate,
			int primaryPay){
		Employee.type = "��������";
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.address = address;
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	public int getPay() {
		return primaryPay;
	}
	public String toString() {
		return type +", �̸� = " + name +", �ּ�="+ address + ", �μ�=" + dept
				+", ��ุ����="+expireDate +", �⺻�ӱ�=" + primaryPay;
	}
}
public class ����08 {
	public static void main(String[] args) {
	//�������� ��ü ����
	  FormalEmployee fe = new FormalEmployee("������", "����� ��걸",
			  "�ѹ���", "1", 5000, "����");
	  System.out.println(fe);
	  System.out.print(fe.name + "�� �޿� : " +   fe.getPay());
	  System.out.println();
	  //���������� ��ü ����
	  Date expireDate = new Date();
	  expireDate.setTime(expireDate.getTime() +1000L * 60 * 60 * 24 * 365 * 2);
	  InformalEmployee ie = new InformalEmployee("�̺���", "����� ���α�", 
			  "������", expireDate, 1000);
	  System.out.println(ie);
	  System.out.print(ie.name + "�� �޿� : " +  ie.getPay());
	}
}
