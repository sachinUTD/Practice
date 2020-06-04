package scr.amazon;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i = 153;
		boolean res = armsNum(i);
		System.out.println(res);
	}

	private static boolean armsNum(int i) {
		int copyi = i;
		int numdigit = 0;
			while(copyi>0)
			{
				numdigit++;
				copyi = copyi/10;
			}
		int sum =0;
		copyi = i;
		while(copyi>0)
		{
			int digit = copyi%10;
			sum += Math.pow(digit, numdigit);
			copyi/=10;
		}
		
		return sum==i;
	}
}
