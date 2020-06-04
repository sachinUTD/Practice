package scr.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = new String("123,123,123,123,123");
		test = convert(s);
		for (String k : test) {
			System.out.println(k);
		}
	}

	private static List<String> convert(String s) {
		List<String> sample;
		sample = Arrays.asList(s.split(","));
		return sample;
	}
}
