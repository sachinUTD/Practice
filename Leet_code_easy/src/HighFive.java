package scr.amazon;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighFive {

	public static void main(String[] args) {
		
		int[][] table = {{1,98},{1,98},{1,98},{1,98},{1,98},
						{2,10},{2,20},{2,98},{2,98},{2,98}};
		int[][] res = highFive(table);
		System.out.println(res[0][0]);
		System.out.println(res[0][1]);
		System.out.println(res[1][0]);
		System.out.println(res[1][1]);
	}

	private static int[][] highFive(int[][] table) {
		TreeMap<Integer, PriorityQueue<Integer>> treeMap = new TreeMap();
		for(int[] item : table)
		{
			int id = item[0];
			int score = item[1];
			if(treeMap.containsKey(id))
			{
				PriorityQueue<Integer> heap = treeMap.get(id);
				heap.offer(score);
				if(heap.size()>5)
				{
					heap.poll();
				}
				treeMap.put(id, heap);
			}
			else {
				PriorityQueue<Integer> heap = new PriorityQueue<>();
				heap.offer(score);
				treeMap.put(id, heap);
			}
		}
		
		int res[][] = new int[treeMap.size()][2];
		for(int id : treeMap.keySet())
		{
			PriorityQueue<Integer> heap = treeMap.get(id);
			int sum = 0;
			while(!heap.isEmpty())
			{
				sum+=heap.poll();
			}
			res[id-1][0]=id;
			res[id-1][1]=sum/5;
		}
		
		return res;
	}
	

}
