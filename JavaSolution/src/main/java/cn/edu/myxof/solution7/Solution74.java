package cn.edu.myxof.solution7;

public class Solution74 {
	
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        if(n == 0) return false;
        if(target < matrix[0][0]) return false;
        int row = func1(matrix, target, 0, m-1);
        return matrix[row][0] == target || func2(matrix[row], target, 0, n-1);
    }
    
    private int func1(int[][] matrix, int target, int start, int end){
    	if(start == end) return start;
        if(start+1 == end){
            return target >= matrix[end][0] ? end : start;
        }
        int mid = start + (end-start)/2;
        int n = matrix[mid][0];
        if(n == target) return mid;
        else if(n > target) return func1(matrix, target, start, mid);
        else return func1(matrix, target, mid, end);
    }
    
    private boolean func2(int[] arr, int target, int start, int end){
        if(start > end) return false;
        int mid = start + (end-start)/2;
        int n = arr[mid];
        if(n == target) return true;
        else if(n > target) return func2(arr, target, start, mid-1);
        else return func2(arr, target, mid+1, end);
    }	
	
//	public static boolean searchMatrix2(int[][] matrix, int target) {
//        if(matrix == null || matrix.length == 0) return false;
//        int m = matrix.length;
//        int n = matrix[0].length;
//        if(n == 0) return false;
//        return func2(matrix, target, 0, m*n-1, n);
//	}
//
//	private static boolean func2(int[][] matrix, int target, int start, int end, int col) {
//		if (start > end)
//			return false;
//		int mid = start + (end - start) / 2;
//		int n = matrix[mid / col][mid % col];
//		if (n == target)
//			return true;
//		else if (n > target)
//			return func2(matrix, target, start, mid - 1, col);
//		else
//			return func2(matrix, target, mid + 1, end, col);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//		int target = 13;
//		System.out.println(searchMatrix2(matrix, target));
	}

}
