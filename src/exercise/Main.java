package exercise;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[9]; 
	int count = 0;
	
	for (int i = 0; i < arr.length; i++ ) {
		int nx = sc.nextInt();
		arr[i] = nx;
		}
	
	int max = arr[0];
	for (int j = 0; j < arr.length; j++ ) {
		if (arr[j]> max) {
			max = arr[j];
			}
	for (int k = 0; k < arr.length; k++ ) {
		if (arr[k] == max) {
			count++;
			}
	}
	}
	System.out.println(max +" "+count);
	}
}
	
	
	
	
