package scr.amazon;

public class DiString {

	public static void main(String[] args) {
		String s = "IDID";
		int[] res = diStringMatch(s);
		for(int i : res)
			System.out.println(i);
	}

	private static int[] diStringMatch(String S) {
		int len = S.length();
		int[] res = new int[len+1];
		int i = 0;
		int d = S.length();
		int j =0;
		for(char c : S.toCharArray())
		{
			if(c=='I')
			{
				res[j]=i;
				i++;
				j++;
			}
			if(c=='D')
			{
				res[j]=d;
				d--;
				j++;
			}
		}
		
		if(S.charAt(len-1)=='I') {
			res[len+1] = res[len]+1;
		}
		if(S.charAt(len-1)=='D') {
			res[len] = res[len-1]-1;
		}
		
		return res;
	}
}
