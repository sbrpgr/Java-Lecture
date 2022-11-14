package ch05;

import java.util.Arrays;

public class Ex11_Array {

	public static void main(String[] args) {
		int score1 = 80, score2 = 70, score3 = 95, score4 = 68, score5 = 85;
		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum/5.;
		System.out.println(avg);
	
	int[] score = {80,70,95,68,85};
	System.out.println(score[0]); // 첫번째 요소
	System.out.println(score[4]);
	sum = 0;
	for (int i = 0; i < score.length; i++)
		sum += score[i];
	System.out.println((double)sum/score.length);
	
	//배열의 선언
	int[] intArray = new int[] {1,2,3,4,5};
	double[] doubleArray = {5.2, 2.3, 1.4, 4.4, 4.5}; // 초기화값을 {}로 제공
	String[] strArray = new String[5]; // 갯수만 정해서 배열을 생성
	
	int a;
	int[] b = new int[3];
//	System.out.println(a); // 초기화 되지 않은 변수를 참조해서 에러
	System.out.println(b[0]); // 배열은 기본값으로 초기화됨
	
	System.out.println(intArray.length);
	
	String s = "홍길동";
	System.out.println(s.length());

	System.out.println(score);
	System.out.println(Arrays.toString(score));
	}
	

}
