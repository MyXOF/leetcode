package cn.edu.myxof.solution2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution215 {
	public int findKthLargest(int[] nums, int k) {
		Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int num : nums) {
			queue.add(num);
		}
		for (int i = 0; i < k - 1; i++) {
			queue.poll();
		}
		return queue.poll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
