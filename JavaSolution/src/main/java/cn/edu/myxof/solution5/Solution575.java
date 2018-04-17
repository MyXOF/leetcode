package cn.edu.myxof.solution5;

import java.util.HashSet;
import java.util.Set;

public class Solution575 {
	public int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (int c : candies) {
			set.add(c);
		}
		return candies.length > set.size() * 2 ? set.size() : candies.length / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
