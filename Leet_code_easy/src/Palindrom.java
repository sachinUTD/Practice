
public class Palindrom {
	public static void main(String[] args) {
		long num = 12321;
		boolean result = _pal(num);
		System.out.println(result);
	}

	private static boolean _pal(long num) {
		if(num<0)
		{
			return false;
		}
			long rev_num=0;
			long new_num = num;
			while(new_num!=0)
			{
				rev_num = rev_num*10+new_num%10;
				new_num= new_num/10;
			}
			if(rev_num==num)
				return true;
			return false;
			}

}
