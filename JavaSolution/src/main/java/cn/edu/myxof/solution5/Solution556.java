package cn.edu.myxof.solution5;

import java.util.Arrays;

public class Solution556 {
    public int nextGreaterElement(int n) {
    	char[] nums = (n+"").toCharArray();
    	int len = nums.length;
    	int i;
    	for(i = len-1;i > 0;i--){
    		if(nums[i-1] < nums[i]) break;
    	}
    	if(i == 0) return -1;
    	int changeDigit = nums[i-1], smallIndex = i;
    	for(int j = i+1;j < len;j++){
    		if(nums[j] < nums[smallIndex] && nums[j] > changeDigit){
    			smallIndex = j;
    		}
    	}
    	char tmp = nums[i-1];
    	nums[i-1] = nums[smallIndex];
    	nums[smallIndex] = tmp;
    	Arrays.sort(nums, i, len);    	
    	long res = Long.parseLong(new String(nums));
    	return res > Integer.MAX_VALUE ? -1 : (int) res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
