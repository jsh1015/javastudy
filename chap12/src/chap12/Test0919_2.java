package chap12;
/*
 * [°á°ú]
 * 0000012345
 * 
 * 123
 * null
 */
public class Test0919_2 {
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		System.out.println(fillZero(null,3));
	}
	static String fillZero(String src, int length) {
		StringBuffer ab = new StringBuffer();
		for(int i=0;i<length;i++) {
			ab.append(" ");
		}
		if(src==null){
			return "null";
		}
		if(length<0) {
			return " ";
		}else if(src.length()>=length) {
			return src.substring(0,length);
		}else {
			int l = length - src.length();
			String a = null;
			for(int i=0; i<l; i++) {
				ab.replace(i, i+1, "0");
			}
			ab.replace(l, ab.length(), src);
		}
		return ab.toString();
	}
}
