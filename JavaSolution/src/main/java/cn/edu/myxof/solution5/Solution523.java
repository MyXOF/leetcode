package cn.edu.myxof.solution5;

import java.util.HashMap;
import java.util.Map;

public class Solution523 {
	public static boolean checkSubarraySum(int[] nums, int k) {
    	Map<Integer, Integer> map = new HashMap<>();
    	map.put(0, -1);
    	int sum = 0;
    	int len = nums.length;
    	for(int i = 0; i < len; i++){
    		if(k == 0){
    			sum += nums[i];
    		} else{
    			int tmp = nums[i] % k;
    			sum = (sum + tmp) % k;
    		}
    		int n = map.getOrDefault(sum, -2);
    		if(n != -2 ){
    			if(i - n > 1) return true;
    		}
    		else map.put(sum, i);
    	}
    	return false;    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkSubarraySum(new int[]{0,0}, 0));
	}

}
