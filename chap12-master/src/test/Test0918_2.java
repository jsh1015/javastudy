package test;

public class Test0918_2 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk12/work/Test.java";
		String path="";
		String fileName = "";
		int idx = fullPath.lastIndexOf("/");
		path = fullPath.substring(0,idx);
		fileName = fullPath.substring(idx+1);
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}
