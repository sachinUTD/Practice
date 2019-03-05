import java.util.HashMap;
import java.util.Stack;

public class Parentheses {
	public static void main(String[] args) {
		String str = "(){}[]";
		boolean result = find(str);
		System.out.println(result);
	}

	private static boolean find(String str) {
		Stack<Character> ch = new Stack<Character>();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		char[] par = str.toCharArray();
		for (int i = 0; i < par.length; i++) {
			if(map.containsKey(par[i]))
			{
				char topel = ch.empty() ? '#': ch.pop();
				if(topel!=map.get(par[i]))
				{
					return false;
				}
			}
			else
			{
				ch.push(par[i]);
			}
		}
		return ch.isEmpty();
	}

}
