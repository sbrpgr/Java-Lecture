package ch04;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++)
			sum += i;
		System.out.println(sum);
		
		int product = 1;
		for (int i=1; i<=10; i++)
			product *= i;
		System.out.println(product);
		
		
		Scanner scan = new Scanner(System.in);
		String line ="?";
		for (int i=0; i<5; i++) {
			System.out.println("입력하세요>");
			String s = scan.nextLine();
			line += s + " ";
		}
		System.out.println(line);
		
		
		
		
		
	}

}
