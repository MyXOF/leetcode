package cn.edu.myxof.solution7;

public class Solution799 {
    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[]  res = new double[101];
        res[0] = poured;
        for(int row = 1;row <= query_row;row++){
            for(int col = row-1; col >= 0; col--){    
                res[col] = Math.max(0.0, (res[col]-1)/2);
                res[col+1] += res[col];            
            }
        }
        return Math.min(res[query_glass],1.0);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(champagneTower(2, 1, 1));
	}

}
