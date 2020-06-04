package scr.amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowel {

	public static void main(String[] args) {
		String s= "Leetcodeeeeeeeeeeerrrrrwww";
		String result = removeVowel(s);
		System.out.println(result);
	}

	private static String removeVowel(String s) {
		Set<Character> vowel = new HashSet(Arrays.asList('a','e','i','o','u'));
		StringBuilder sb = new StringBuilder();
		/*
		 * for(int i = 0; i<s.length();i++) { if(!vowel.contains(s.charAt(i))) {
		 * sb.append(s.charAt(i)); } }
		 */
		for(char c : s.toCharArray()) {
			if(!vowel.contains(c)) {
			sb.append(c);
			}
		}
		return sb.toString();
	}
}
