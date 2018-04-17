package cn.edu.myxof.solution5;

import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int len = nums.length / 2;
        for(int i = 0; i < len; i++){
            result += nums[2*i];
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
