package cn.edu.myxof.solution9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        List<Integer> empty = new ArrayList<>();
        res.add(empty);
        int len = nums.length;
        for(int i = 0; i < len;){
        	int count = 1;
        	while(i+count < len && nums[i] == nums[i+count]){
        		count++;
        	}
        	int preNum = res.size();
        	for(int p = 0; p < preNum;p++){
        		List<Integer> tmp = new ArrayList<>(res.get(p));
        		for(int q = 0; q < count;q++){
        			tmp.add(nums[i]);
        			res.add(new ArrayList<>(tmp));
        		}
        	}    	
        	i += count;
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
