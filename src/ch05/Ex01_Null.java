package ch05;

public class Ex01_Null {

	public static void main(String[] args) {
		
		String s = null; // null은 참조형 변수에만 사용 가능
		int[] intArray = null;
//		int a = null;
//		System.out.println(s.length()); //nullPointException
//		intArray[0] = 5;				//nullPointException
		
		String s0 = "";
		System.out.println(s0.length());
	}

}
