
public class Jshfamily {
	private int no;
	private String name;
	private int age;
	private String job;
	private int gender;
	
	public Jshfamily(int no, String name, int age, String job, int gender) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
	}
	
	public Jshfamily(String name, int age, String job, int gender) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String g = null;
		if(gender == 1) {
			g = "남자";
		}else if(gender ==2) {
			g = "여자";
		}
		return "이름:" + name + ", 나이:" + age + 
				", 직업:" + job + ", 성별:" + g;
	}
	
}
