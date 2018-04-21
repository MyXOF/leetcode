package cn.edu.myxof.solution3;

public class Solutio378 {
    public int kthSmallest(int[][] matrix, int k) {
    	int len = matrix.length;
    	int start = matrix[0][0];
    	int end = matrix[len-1][len-1];
    	
    	while(start <= end) {
    		int mid = start + (end - start) / 2;
    		int count = func(matrix, len, mid);
    		if(count < k) {
    			start = mid + 1;
    		} else {
    			end = mid-1;
    		}
    	}
    	return start;
    }
    
    private int func(int[][] matrix, int len ,int val) {
    	int i = len - 1;
    	int j = 0;
    	int count = 0;
    	while(i >= 0 && j < len) {
    		if(matrix[i][j] > val) {
    			i--;
    		} else {
    			count += (i+1);
    			j++;
    		}
    	}
    	return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix = {{1,5,9},{10,11,13},{12,13,25}};
	}

}
