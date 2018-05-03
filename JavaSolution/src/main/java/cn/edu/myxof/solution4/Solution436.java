package cn.edu.myxof.solution4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution436 {
	public int[] findRightInterval(Interval[] intervals) {
		if (intervals == null || intervals.length == 0) {
			return null;
		}
		int len = intervals.length;
		int[] res = new int[len];
		int[] start = new int[len];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < len;i++){
			map.put(intervals[i].start, i);
			start[i] = intervals[i].start;
		}
		Arrays.sort(start);
		for(int i = 0; i < len;i++){
			int index = Arrays.binarySearch(start, intervals[i].end);
			if(index >= 0){
				res[i] = map.get(start[index]);
			} else{
				index = -(index + 1);
				if(index < len){
					res[i] = map.get(start[index]);
				} else{
					res[i] = -1;
				}
			}
		}
		return res;
	}

	class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
