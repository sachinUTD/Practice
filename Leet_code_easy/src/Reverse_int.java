
public class Reverse_int {
	
	public static void main(String[] args) {
		int num = 1534236469;
		int result = rev_int(num);
		System.out.println(result);
				
	}

	private static int rev_int(int num) {
			long rev_num=0;
			while(num!=0)
			{
				rev_num = rev_num*10+num%10;
				num= num/10;
			}
			if(rev_num > Integer.MAX_VALUE || rev_num < Integer.MIN_VALUE)
			{
				return 0;
			}
			return (int)rev_num;
	}

}
