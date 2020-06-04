package scr.amazon;

public class SumMinDigit {

	public static void main(String[] args) {
		int[] ls = {99,771,33,66,55};
		int res = find(ls);
		System.out.println(res);
	}

	private static int find(int[] ls) {
		int k = ls[0];
		for (int i = 1; i < ls.length; i++) {
			if(k>ls[i])
			{
				k=ls[i];
			}
		}
		
		int sum =0;
		
		while(k>0)
		{
			sum += k%10;
			k/=10;
		}
		if(sum%2==0)
		{
			return 1;
		}
		else
		return 0;
	}
}
