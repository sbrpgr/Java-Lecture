package ch11.sec12_warapper;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_DescendingOrder {

	public static void main(String[] args) {
		Integer[] intArr = {8,19,15,23};
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(intArr));
		
		int[] arr = new int[intArr.length];
		for (int i = 0; i< intArr.length; i++)
			arr[i]= intArr[i];
		System.out.println(Arrays.toString(arr));
	}

}
