package ch04;

import java.util.Random;
import java.util.Scanner;

public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		Random ran = new Random(); // 객체 생성
		int number = ran.nextInt(100)+1;
		
		System.out.print("1에서 100까지의 정수를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		number = num;
		
		String vlwm;
				
		if (number % 15 == 0)
			vlwm = "FizzBuzz";
		else if (number % 5 == 0)
			vlwm = "Buzz";
		else if (number % 3 == 0)
			vlwm = "Fizz";
		else
			vlwm = " ";
		System.out.println(number + "," + vlwm);
		
		
	
		
		if (number % 15 == 0)
			System.out.println(number + ", FizzBuzz");
		else if (number % 3 == 0)
			System.out.println(number + ", Fizz");
		else if (number % 5 == 0)
			System.out.println(number + ", Buzz");
		else
			System.out.println(number + ", " + number);
		
	}

}
