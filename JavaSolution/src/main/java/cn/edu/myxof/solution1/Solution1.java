package cn.edu.myxof.solution1;

import java.util.HashMap;

import java.util.Map;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}
	
    public static int countDigitOne(int n) {
        if(n <= 0) return 0;
        long tmp = n;
        long count = 0;
        long hight = 0;
        long low = 0;
        long curr = 0;
        long factor =  1;
        while(tmp / factor != 0){
            hight = (tmp / factor) / 10;;
            curr = (tmp / factor) % 10;
            low = tmp % factor;
            if(curr == 0){
            	System.out.println(String.format("0-%d,%d", hight, factor));
                count += hight * factor;
            } else if (curr == 1){
            	System.out.println(String.format("1-%d,%d,%d", hight, factor, low));
                count += hight * factor + low + 1;
            } else{
            	System.out.println(String.format("2-%d,%d", hight, factor));
                count += (hight + 1) * factor;
            }
            factor *= 10;
        }
        return (int)count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigitOne(12113));
	}

}
