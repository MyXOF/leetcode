package cn.edu.myxof;

import java.util.Arrays;

public class Solution646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (p1,p2)->p1[1]-p2[1]);
        int len = 0;
        int pre = Integer.MIN_VALUE;
        for(int[] p : pairs){
            if(pre < p[0]){
                len++;
                pre = p[1];
            }
        }
        return len;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
