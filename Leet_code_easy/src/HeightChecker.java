package scr.amazon;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int[] heights = {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
	}

	private static int heightChecker(int[] heights) {
		int[] sorted = heights.clone();
		int i =0;
		int count = 0;
		Arrays.sort(sorted);
		for (int num : sorted) {
			if(num !=heights[i])
			{
				count++;
			}
				i++;
		}
		return count;
	}
}
