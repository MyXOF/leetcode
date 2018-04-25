package cn.edu.myxof.solution5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution56 {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>();
		if (intervals == null || intervals.size() == 0)
			return res;
		Collections.sort(intervals, (p1,p2)->{return p1.start-p2.start;});
		int len = intervals.size();
		Interval curr = intervals.get(0);
		for(int i = 1; i < len;i++){
			Interval tmp = intervals.get(i);
			if(tmp.start > curr.end){
				res.add(curr);
				curr = tmp;
			} else{
				curr.end = Math.max(tmp.end, curr.end);
			}
		}
		res.add(curr);
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
