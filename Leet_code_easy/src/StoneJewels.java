package scr.amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StoneJewels {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAbAbb";
		int result = numJewelsInStones( J, S);
		System.out.println(result);
	}

	private static int numJewelsInStones(String J, String S) {
		int k =0;
		Set<Character> set = new HashSet<Character>();
		for(char c : J.toCharArray())
		{
			set.add(c);
		}
		for(char c : S.toCharArray())
		{
			if(set.contains(c))
			k++;
		}
		
		return k;
		
	}
}
