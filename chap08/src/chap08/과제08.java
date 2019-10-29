package chap08;
import java.util.Date;
/*
 * 회사가 고용하는 여러 유형의 직원들이 있다.
    직원은 정규직원과 비정규직원 으로 나뉜다.
  모든 직원은 직원구분(type), 이름(name), 주소(address),소속부서(dept)정보를 가진다ㅏ.
  정규직원은 직원번호(empNo), 직급(position), 연봉(salary)를 가진다.
  비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)를 가진다.

   직원클래스(Employee)
   정규직원 클래스(FormalEmployee)
   비정규직원클래스(InformalEmployee)

   또한 모든 직원은 급여를 받는다.
   정규직원은 급여로 연봉 / 12 로 

   비정규직원은 기본입금
   모든 클래스에 getPay() 메서드를 구현하기
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
		Employee.type = "정규직";
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
	}
	public String toString() {
		return type + ", 이름 = " + name +", 주소="+address + ", 부서=" + dept
				+", 직원번호="+empNo +", 직급=" + position+", 연봉=" + salary;
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
		Employee.type = "비정규직";
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
		return type +", 이름 = " + name +", 주소="+ address + ", 부서=" + dept
				+", 계약만료일="+expireDate +", 기본임금=" + primaryPay;
	}
}
public class 과제08 {
	public static void main(String[] args) {
	//정규직원 객체 생성
	  FormalEmployee fe = new FormalEmployee("김정규", "서울시 용산구",
			  "총무부", "1", 5000, "과장");
	  System.out.println(fe);
	  System.out.print(fe.name + "의 급여 : " +   fe.getPay());
	  System.out.println();
	  //비정규직원 객체 생성
	  Date expireDate = new Date();
	  expireDate.setTime(expireDate.getTime() +1000L * 60 * 60 * 24 * 365 * 2);
	  InformalEmployee ie = new InformalEmployee("이비정", "서울시 구로구", 
			  "영업부", expireDate, 1000);
	  System.out.println(ie);
	  System.out.print(ie.name + "의 급여 : " +  ie.getPay());
	}
}
