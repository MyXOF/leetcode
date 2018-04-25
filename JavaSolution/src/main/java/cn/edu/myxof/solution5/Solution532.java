package cn.edu.myxof.solution5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution532 {
    public int findPairs(int[] nums, int k) {
    	if (nums == null || nums.length == 0 || k < 0)   return 0;
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int n: nums){
    		map.put(n, map.getOrDefault(n, 0) + 1);
    	}
    	int count = 0;
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		if(k == 0){
    			if(entry.getValue() >= 2){
    				count++;
    			}
    		} else{
    			if(map.containsKey(entry.getKey()+k)){
    				count++;
    			}
    		}
    	}
    	return count;
    }
	
    public int findPairs2(int[] nums, int k) {
    	if (k < 0) {
			return 0;
		}
        Set<Integer> set = new HashSet<>();
        Set<Pair> res = new HashSet<>();
        for(int n: nums){
            if(k != 0){
                if(set.contains(n+k)){
                    res.add(new Pair(n, n+k));
                }
                if(set.contains(n-k)){
                	res.add(new Pair(n, n-k));
                } 
            } else{
                if(set.contains(n)){
                	res.add(new Pair(n, n));
                }
            }
            set.add(n);
        }
        return res.size();
    }
    
    static class Pair{
    	public int left;
    	public int right;
    	
        public Pair(int l, int r) {
            left = l;
            right = r;
        }
    	
        @Override
        public int hashCode() {
            return 31 * (left + right);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;
            if((other.left == left && other.right == right) || (other.left == right && other.right == left))
            	return true;
            return false;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {3,1,4,1,5};
//		int k = 2;
	}

}
