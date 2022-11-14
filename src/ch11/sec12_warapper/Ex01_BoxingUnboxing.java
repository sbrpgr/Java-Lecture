package ch11.sec12_warapper;

import ch11.sec07_string.Ex09_ValueOf;

public class Ex01_BoxingUnboxing {

	public static void main(String[] args) {
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = 300;
		
		
		int valu1 = obj1.intValue();
		int valu2 = obj2.intValue();
		int valu3 = obj3;
		
		System.out.println(valu1 + ","+ valu2 + "," +valu3);
		System.out.println(obj1.toString());
	}

}
