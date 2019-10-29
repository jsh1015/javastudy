package chap12;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); //E, 5��° ���� ����
		System.out.println(s.compareTo("abc")); //-32  
		// <���İ��� �޼���> "ABCDEFGH" - "abc" : (65)A - (97)a = -32
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0
		//��ҹ��� ���о���
		System.out.println(s.concat("abc")); //ABCDEFGHabc
		//concat() : ���ڿ� ����. s = s + "abc"
		
		System.out.println(s.endsWith("GH"));//true
		//endsWith : s���ڿ��� ���� "GH"?
		System.out.println(s.startsWith("AB"));//true
		//s���ڿ��� ������ "AB"?
		
		System.out.println(s.equalsIgnoreCase("abcdefgh"));//true
		//��ҹ��� ���о��� s���ڿ� �� abcdefgh �� ����?
		
		s = new String("This is a String");
		System.out.println(s.indexOf('i')); //2
		//indexOf : ���ڳ� ���ڿ��� ��ġ ����
		System.out.println(s.indexOf('i',5)); //5
		//5�� �ε��� ���� ���� ���ڳ� ���ڿ��� ��ġ�� ����
		System.out.println(s.indexOf('i',15)); //-1
		//15�� �ε��� ���� ���� ���ڳ� ���ڿ��� ��ġ�� ���� : -1 15���ε��� ���Ŀ� �ش繮�ھ���
		System.out.println(s.indexOf("is")); //2
		//is ���ڿ��� ��ġ�� ����
		System.out.println(s.lastIndexOf("is")); //5
		//���ʺ��� �˻� (������ is)
		System.out.println(s.length()); //16
		//s ���ڿ��� ����
		System.out.println(s.replace("is", "QR")); //ThQR QR a String
		//is�� QR�� ġȯ
		System.out.println(s.substring(5));//is a String
		//5��° �ε������� �κ� ���ڿ��� ���
		System.out.println(s.substring(5,13)); //is a Str
		//5��°���� 13��°�ε��� ������ ���
		System.out.println(s.toLowerCase());//this is a string
		//�ҹ��ڷ� ����
		System.out.println(s.toUpperCase());//THIS IS A STRING
		//�빮�ڷ� ����
		System.out.println("   ���ڿ� trim �޼���      ".trim());//���ڿ� trim �޼���
		//���� ������ ����
	}
}
