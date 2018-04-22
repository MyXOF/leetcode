package cn.edu.myxof.solution6;

import java.util.Arrays;

public class Solution698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if(sum % k != 0) return false;
        int len = nums.length;
        boolean[] flag = new boolean[len];
        return func(nums, flag, k, 0, 0, sum/k, 0);     
	}

	private boolean func(int[] nums, boolean[] flag, int k, int currSum, int currIndex, int target, int startIndex) {
		if (k == 1)
			return true;
		if (currSum == target && currIndex > 0)
			return func(nums, flag, k - 1, 0, 0, target, 0);
		for (int i = startIndex; i < nums.length; i++) {
			if (!flag[i]) {
				flag[i] = true;
				if (func(nums, flag, k, currSum + nums[i], currIndex + 1, target, i + 1)){
					return true;
				}
				flag[i] = false;
			}
		}
		return false;
	}
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
