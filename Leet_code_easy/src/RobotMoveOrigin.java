package scr.amazon;

public class RobotMoveOrigin {

	public static void main(String[] args) {
		String sample = "RRDD";
		boolean res = findmove(sample);
		System.out.println(res);
	}

	private static boolean findmove(String sample) {

		int x = 0;
		int y = 0;
		for (char c: sample.toCharArray()) {
			if(c=='D') y +=1;
			if(c=='U') y -=1;
			if(c=='L') x +=1;
			if(c=='R') x -=1;
		}
		if(x==0 && y==0)
			return true;
		else
		return false;
	}
}
