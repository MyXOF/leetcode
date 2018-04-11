package cn.edu.myxof.solution1;

import java.util.Arrays;

public class Solution179 {
    public String largestNumber(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return null;
    	}
    	int len = nums.length;
        StringBuilder builder = new StringBuilder();
        String[] newNums = new String[len];
        for(int i = 0; i < len;i++){
        	newNums[i] = nums[i]+"";
        }
        Arrays.sort(newNums, (s1,s2)->{
        	String v1 = s1+s2;
            String v2 = s2+s1;
            return v2.compareTo(v1);
        });
        if(newNums[0].equals("0")){return "0";}
        for(String n : newNums){
            builder.append(n);
        }
        return builder.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3, 30, 34, 5, 9};
		System.out.println(-5/2);
	}

}
