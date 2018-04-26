package cn.edu.myxof.solution3;

public class Solution33 {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int len = nums.length;
		int start = 0, end = len - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[start] < nums[end]) {
				if (nums[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[mid] <= nums[end]) {
					if (target > nums[mid] && target <= nums[end]) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				} else {
					if (target >= nums[start] && target < nums[mid]) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}	
				}
			}
		}
		return nums[start] == target ? start : -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
