package cn.edu.myxof;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}

		return x == revertedNumber || x == revertedNumber / 10;
	}
	
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> mapping = new HashMap<>();
        int i,j;
        for(i = 0, j = 0; j < s.length();j++){
            if(mapping.containsKey(s.charAt(j))){
                i = Math.max(i,mapping.get(s.charAt(j))+1);
            }
            res = Math.max(res,j-i+1);
            mapping.put(s.charAt(j),j);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
