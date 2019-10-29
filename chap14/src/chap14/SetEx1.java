package chap14;

import java.util.HashSet;
import java.util.Set;

/*
 * Set ÀÎÅÍÆäÀÌ½º : Áßº¹ °´Ã¼¸¦ ÀúÀåÇÏÁö ¾Ê´Â´Ù.
 * 		±¸ÇöÅ¬·¡½º : HashSet, LinkedHashSet, TreeSetÀÌ ÀÖ´Ù.
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"È«±æµ¿",1,"1","±è»ñ°«","ÀÌ¸ù·æ","È«±æµ¿","¼ºÃáÇâ","Çâ´ÜÀÌ","È«±æµ¿","±è»ñ°«"};
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		for(int i=0;i<arr.length;i++) {
			if(!set1.add(arr[i])) { //È«±æµ¿ Áßº¹ÀÌ¹Ç·Î false, ±è»ñ°« Áßº¹ÀÌ¹Ç·Î false
				if(!set2.add(arr[i])) { //+È«±æµ¿ Áßº¹ÀÏ¶§ false +±è»ñ°«
					set3.add(arr[i]); //+È«±æµ¿
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
