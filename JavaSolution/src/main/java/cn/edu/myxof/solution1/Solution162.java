package cn.edu.myxof.solution1;

public class Solution162 {
	public int findPeakElement(int[] nums) {
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] > nums[mid + 1]) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
