import java.util.HashMap;

public class Romn_to_int {

	public static void main(String[] args) {
		
	String roman = "xxx";
	int result = roman_to_int(roman);
	System.out.println(result);
	}

	private static int roman_to_int(String roman) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] ch = roman.toCharArray();
		int k=0;
		if(ch[roman.length()-1]=='I' && ch[roman.length()-2]=='I' && ch[roman.length()-3]=='I')
		{
			k=3;
			for (int i = ch.length-4; i >=0; i--) {
				if(k>map.get(ch[i]))
					k =  k-map.get(ch[i]);
				if(k<=map.get(ch[i]))
					k = k+map.get(ch[i]);
			}
		}
		else
		{
		for (int i = ch.length-1; i >=0; i--) {
			if(k>map.get(ch[i]))
				k =  k-map.get(ch[i]);
			if(k<=map.get(ch[i]))
				k = k+map.get(ch[i]);
		}
		}
		return k;
	}
}
