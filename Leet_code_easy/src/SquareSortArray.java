package scr.amazon;

import java.util.Arrays;

public class SquareSortArray {

	public static void main(String[] args) {
		
		int[] ls = {-4,-1,0,3,10};
		int[] res = sort(ls);
		for(int num : res)
		{
			System.out.println(num);
		}
	}

	private static int[] sort(int[] A) {
		int[] res = new int[A.length];
		int i=0;
		for(int num :A)
		{
			res[i]= num * num ;
			i++;
		}
		Arrays.sort(res);
		return res;
	}
}
