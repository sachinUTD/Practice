
public class LongestCommon_Str {
	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		String result = find(str);
		System.out.println(result);
	}

	private static String find(String[] strs) {
		if(strs.length==0)
		{
			return "";
		}
		String first = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(first)!=0)
			{
				System.out.println(strs[i].indexOf(first));
				first = first.substring(0, first.length()-1);
				if(first.isEmpty())
				{
					return "";
				}
			}
		}
		return first;
	}

}
