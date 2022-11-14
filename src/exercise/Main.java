package exercise;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	
	int[] arr = new int[a]; 
	for (int i = 0; i < arr.length; i++ ) {
		int b = sc.nextInt();
		arr[i] = b;
	}
	int c = sc.nextInt();
	int count = 0;
	for (int i = 0; i < arr.length; i++ ) {
		if (c == arr[i]) {
			count++;
		}
		
	}
	System.out.println(count);
}}