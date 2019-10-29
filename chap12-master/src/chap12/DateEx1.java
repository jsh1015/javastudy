package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Data Ŭ���� ����
 * 
 * SimpleDateFormat : ����ȭ Ŭ����.
 *   String format(Date) : Date Ÿ���� ��ü�� ����ȭ�� ���ڿ��� �����Ͽ� ����.
 *   Date   parse(String) : ����ȭ�� ���ڿ��� Date ��ü�� ����
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date(); //����ð� ��ü�� ����
		System.out.println(now);
		//SimpleDateFormat : ��¥�� ���ڿ� ����,
		//                   ���ڿ� ��¥�� ���� ���.
		/*
		 * yyyy : �⵵�� 4�ڸ� ���
		 * MM   : ��
		 * dd   : ����
		 * HH   : 0 ~ 23��,
		 * hh   : 1 ~ 12��  
		 * mm   : ��
		 * ss   : ��
		 * E    : ����
		 * a    : ����, ����
		 */
		SimpleDateFormat sf = 
				 new SimpleDateFormat("dd-MM-yyyy HH:mm:ss E a");
		String dispDate = sf.format(now);
		System.out.println(dispDate);
		String strDate = "2019-09-21"; 
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf2.parse(strDate); //strDate�� date�������� ��ȯ
		} catch (ParseException e1) { //ParseException���� ����ó��
			e1.printStackTrace();
		}
		System.out.println(day); //strDate ���
		System.out.println(sf.format(day)); //day�� sf�������� ��ȯ�ؼ� ���
		//���� : 2019��12��31���� ���� ����ϱ�.
		//     �� �Է°��� "2019��12��31��" ���·�
		//       ��°��� "2019-12-31 ��¥�� ������ ?? ���� �Դϴ�."		
		strDate = "2019��12��31��";
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy��MM��dd��");
		try {
			day = sf3.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sf4 = 
         new SimpleDateFormat("yyyy-MM-dd ��¥�� ������ E���� �Դϴ�.");
		System.out.println(sf4.format(day));
	}
}
