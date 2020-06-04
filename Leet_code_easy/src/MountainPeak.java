package scr.amazon;

public class MountainPeak {

	public static void main(String[] args) {
		
		int[] num = {0,2,1,0};
		System.out.println(peakIndexInMountain(num));
	}

	private static int peakIndexInMountain(int[] num) {
		int lo = 0;
		int hi = num.length-1;
		while (lo<hi) {
			int mi = lo + (hi-lo)/2;
			if(num[mi] <num[mi+1])
			{
				lo = mi+1;
			}
			else
				hi = mi;
		}
		
		return lo;
	}
}
