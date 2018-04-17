package cn.edu.myxof.solution5;

public class Solution565 {
	public int arrayNesting1(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int count = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == Integer.MAX_VALUE)
				continue;
			int next = nums[i];
			nums[i] = Integer.MAX_VALUE;
			int n = 1;
			while (next != i) {
				int tmp = nums[next];
				nums[next] = Integer.MAX_VALUE;
				next = tmp;
				n++;
			}
			count = Math.max(count, n);
		}
		return count;
	}

	public int arrayNesting2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int count = 0;
		int len = nums.length;
		boolean[] flags = new boolean[len];
		for (int i = 0; i < len; i++) {
			if (flags[i])
				continue;
			int next = i;
			int n = 1;
			while (nums[next] != i) {
				flags[next] = true;
				next = nums[next];
				n++;
			}
			count = Math.max(count, n);
		}
		return count;
	}

	public static void main(String[] args) {
		// int[] nums = {5,4,0,3,1,6,2};
		// TODO Auto-generated method stub
	}

}
