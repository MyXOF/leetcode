package cn.edu.myxof.solution2;

public class Solution27 {
	public int removeElement(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				n--;
			} else {
				i++;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
