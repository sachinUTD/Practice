package scr.amazon;

public class SortArrayParity {

	public static void main(String[] args) {
		int[] ls = {1};
		int[] res = sortParity(ls);
		for (int i : res) {
			System.out.println(i);
		}
	}

	private static int[] sortParity(int[] A) {
		int[] res = new int[A.length];
		int min = 0;
		int max = A.length-1;
		for (int i = 0; i < A.length; i++) {
			if(A[i]%2==0)
			{
				res[min]=A[i];
				min+=1;
			}
			else
			{
				res[max]=A[i];
				max-=1;
			}
		}
		return res;
	}
}
