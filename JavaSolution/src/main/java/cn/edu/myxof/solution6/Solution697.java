package cn.edu.myxof.solution6;

import java.util.HashMap;
import java.util.Map;

public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int len = nums.length;
        int maxCount = 1;
        int minLen = 1;
        int[] first = {0,0,1};
        map.put(nums[0], first);
        for(int i = 1; i < len;i++){
        	if(map.containsKey(nums[i])){
        		int[] arr = map.get(nums[i]);
        		arr[1] = i;
        		arr[2]++;
        		if(arr[2] > maxCount){
        			maxCount = arr[2];
        			minLen = arr[1] - arr[0] + 1;
        		} else if(arr[2] == maxCount && (arr[1] - arr[0] + 1) < minLen){
        			minLen = arr[1] - arr[0] + 1;
        		}
        	} else{
        		int[] arr = {i,i,1};
        		map.put(nums[i], arr);
        	}
        }
        return minLen;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
