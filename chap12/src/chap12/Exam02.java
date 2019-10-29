package chap12;
public class Exam02 {
	
	public static void main(String[] args) {
		System.out.println(round(3.1215,1)); //3.1
		System.out.println(round(3.1215,2)); //3.12
		System.out.println(round(3.1215,3)); //3.122
		System.out.println(round(3.1215,4)); //3.1215
	}

	static double round(double d, int i) {
		return Double.parseDouble(String.format("%."+i+"f", d));
	}
}
