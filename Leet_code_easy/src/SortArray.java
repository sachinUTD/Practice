package scr.amazon;

public class SortArray {

	public static void main(String[] args) {
		
		int[] list = {2,5,4,7};
		int[] res = sortArray(list);
		for(int i : res)
			System.out.println(i);
	}

	private static int[] sortArray(int[] A) {
		int[] res = new int[A.length];
		int even = 0;
		int odd = 1;
		for (int i : A) {
			if(i%2==0)
			{
				res[even] = i;
				even+=2;
			}
			else
			{
				res[odd] = i;
				odd+=2;
						
			}
		}		
		return res;
	}
}
