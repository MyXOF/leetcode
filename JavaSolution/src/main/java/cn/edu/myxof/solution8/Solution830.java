package cn.edu.myxof.solution8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution830 {
    public List<List<Integer>> largeGroupPositions(String S) {
    	List<List<Integer>> res = new ArrayList<>();
    	int len = S.length();
    	int i = 0;
    	while(i < len){
    		char ch = S.charAt(i);
    		int j = i+1;
    		for(;j < len && S.charAt(j) == ch ;j++){}
    		if(j-i >= 3){
    			res.add(Arrays.asList(i,j-1));
    		}
    		i = j;
    	}
    	return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S = "abbxxxxzzy";
	}

}
