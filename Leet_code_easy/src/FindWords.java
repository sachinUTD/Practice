package scr.amazon;

import java.util.Arrays;

public class FindWords {

	public static void main(String[] args) {
		String[] list = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		System.out.println(countCharacters(list,chars));
	}

	private static int countCharacters(String[] words, String chars) {
		int sum =0;
		char[] ch =chars.toCharArray();
		for (String word : words) {
			char [] c = word.toCharArray();
			boolean b = match(ch,c);
			if(!b)
				sum+=word.length();
		}
		return sum;
	}

	private static boolean match(char[] arr1, char[] arr2) {
		int[] count = new int[26];
		for (char c: arr1)
			count[c-'a']++;
		int[]t =count.clone();
		for (char i : arr2) {
			if (t[i - 'a']-- == 0) {
                return true;
            }
		}
		return false;
		  
	}
}
