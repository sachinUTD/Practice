import java.util.HashMap;

public class Two_Sum {

	public static void main(String[] args) {
		int[] num = {2,12,2,5,3,1};
		int target = 7;
		int[] result = tw_sum(num,target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

	private static int[] tw_sum(int[] num, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			int bal = target - num[i];
			if(map.containsKey(bal)) {
				return new int [] {map.get(bal),i};
			}
			map.put(num[i], i);
		}
		return null;
	}
}
