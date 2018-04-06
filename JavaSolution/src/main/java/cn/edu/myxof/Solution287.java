package cn.edu.myxof;

public class Solution287 {
	public int findDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int fast = nums[0];
		int slow = nums[0];
		while (true) {
			fast = nums[nums[fast]];
			slow = nums[slow];
			if (fast == slow) {
				break;
			}
		}
		int curr = nums[0];
		while (curr != fast) {
			fast = nums[fast];
			curr = nums[curr];
		}
		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
