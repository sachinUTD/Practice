package scr.amazon;

import java.util.Arrays;

public class ArrayPartition1 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4};
		System.out.println(arrayPairSum(num));
	}

	private static int arrayPairSum(int[] num) {
		int sum = 0;
		Arrays.sort(num);
		
		for (int i = 0; i < num.length;) {
			sum = sum+num[i];
			i=i+2;
		} 
		return sum;
	}
}
