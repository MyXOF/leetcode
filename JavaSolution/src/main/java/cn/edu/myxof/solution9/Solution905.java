package cn.edu.myxof.solution9;

public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int start = 0, end = len -1;
        while(start < end){
        	if(A[start] % 2 == 0){
        		start++;
        	} else{
        		while(A[end] % 2 != 0 && start < end){
        			end--;
        		}
        		if(start >= end){
        			break;
        		} else{
        			int tmp = A[start];
        			A[start] = A[end];
        			A[end] = tmp;
        			start++;
        			end--;
        		}
        	}
        }
        return A;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
