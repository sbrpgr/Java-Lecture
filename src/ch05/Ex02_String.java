package ch05;

public class Ex02_String {

	public static void main(String[] args) {
		
		String s1 = "홍길동"; //리터럴로 작성하면 공통 사용
		String s2 = "홍길동";
		System.out.println(s1 == s2); //true  동일한 기억장소를 가리킴
		
		String s3 = new String("홍길동"); //new는 생성자, 생성자로 만든 홍길동은 다른 장소에 보관
		String s4 = new String("홍길동");
		System.out.println(s3 == s4); // false 각각 다른 장소에 저장되어 있기 때문
		
		// 값이 같은지를 물어볼 경우 equals() method 사용
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	}

}
