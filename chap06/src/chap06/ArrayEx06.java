package chap06;
/*
 * command ���ο��� �Ķ���� �ޱ�
 */
public class ArrayEx06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Ŀ�ǵ���ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("java ArrayEx6 ȫ�浿 ���");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]=" + args[i]);
		}
	}
}
