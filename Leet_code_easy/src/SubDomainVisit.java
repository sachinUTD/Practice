package scr.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisit {

	public static void main(String[] args) {
		
		String[] list = {"9001 discuss.leetcode.com"};
		List<String> res = subdomainVisits(list);
		for( String s : res)
			System.out.println(s);
	}

	private static List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		List<String> res = new ArrayList<String>();
		for (String s : cpdomains) {
			int value = Integer.parseInt(s.substring(0, s.indexOf(" ")));
			String key = s.substring(s.indexOf(" ")+1, s.length());
			String[] domains = key.split("\\.");
			for (int i = 0; i < domains.length; i++) {
				if(map.containsKey(key))
				{
					map.put(key, map.get(key)+value);
				}
				else
				{
					map.put(key, value);
				}
				key = key.substring(key.indexOf(".")+1,key.length());
			}
			
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			res.add(entry.getValue() + " "+entry.getKey()) ;
		}
		return res;
	}
}
