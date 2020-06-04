package scr.amazon;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {

	public static void main(String[] args) {
		String[] list = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
		System.out.println(numUniqueEmail(list));
	}

	private static int numUniqueEmail(String[] emails) {

		Set<String> sample = new HashSet<String>();
		for(String email : emails)
		{
			int i = email.indexOf('@');
			String local = email.substring(0,i);
			String domain = email.substring(i, email.length());
			if(local.contains("+")) {
				local = local.substring(0,local.indexOf('+'));
				
			}
			local = local.replaceAll("\\.", "");
			sample.add(local+domain);
		}
		return sample.size();
	}
}
