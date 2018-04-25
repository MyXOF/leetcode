package cn.edu.myxof.solution5;

public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r1 = nums.length;
        int c1 = nums[0].length;
        if(r1*c1 != r*c) return nums;
        int[][] res = new int[r][c];
        int count = r*c;
        for(int i = 0; i < count;i++){
            res[i / c][i % c] = nums[i / c1][i % c1];
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] nums = {{1,2},{3,4}};
//		int r = 1, c = 4;
	}

}
