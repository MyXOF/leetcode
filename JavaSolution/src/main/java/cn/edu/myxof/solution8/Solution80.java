package cn.edu.myxof.solution8;

public class Solution80 {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int len = nums.length;
		if (len <= 2)
			return len;
		int last1 = nums[0];
		int last2 = nums[1];
		int index = 2;
		for (int i = 2; i < len; i++) {
			if (last1 == last2 && last2 < nums[i]) {
				nums[index] = nums[i];
				index++;
				last2 = nums[i];
			} else if (last1 < last2) {
				nums[index] = nums[i];
				index++;
				last1 = last2;
				last2 = nums[i];
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
