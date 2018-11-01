package cn.edu.myxof.solution4;

import java.util.HashSet;
import java.util.Set;

public class Solution421 {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int i = 31;i >= 0;i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int n : nums){
                set.add(n & mask);
            }
            int tmp = max | (1 << i);
            for(Integer pre : set){
                if(set.contains(pre ^ tmp)){
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
