package test;
 /*
 * ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
 * �޼���� : fillZero
 * ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ���  �����, ���� �� ������ 0���� ä���.
 *        ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
 *        ���� �־��� length�� ���� 0�� ���ų� ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : String
 * �Ű����� : String src, int length
 * 

 [���]
0000012345

123
null
 */
public class Test0919_2{
 public static void main(String[] args) {
  String src = "12345";
  System.out.println(fillZero(src, 10));
  System.out.println(fillZero(src, -1));
  System.out.println(fillZero(src, 3));
  System.out.println(fillZero(null, 3));
 }
 static String fillZero(String str,int len) {
	 if(str == null) return str;
	 if(len <= 0) return "";
	 if(str.length() >= len) return str.substring(0,len);
	 StringBuffer sb = new StringBuffer();
	 for(int i=0;i<str.length();i++) {
		 sb.append(0);
	 }
	 sb.replace(len-str.length(), len, str);
	 return sb.toString();
 }
}