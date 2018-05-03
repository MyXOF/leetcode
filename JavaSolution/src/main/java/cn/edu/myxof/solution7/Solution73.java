package cn.edu.myxof.solution7;

public class Solution73 {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;
        int row = matrix.length;
        int col = matrix[0].length;
        if(col == 0) return;
        int col0 = -1;
        for(int i = 0; i < row; i++){
        	if(matrix[i][0] == 0) col0 = 0;
        	for(int j = 1; j < col;j++){
        		if(matrix[i][j] == 0){
        			matrix[i][0] = 0;
        			matrix[0][j] = 0;
        		}
        	}
        }
        for(int i = row-1;i >= 0;i--){
        	for(int j = col-1;j > 0; j--){
        		if(matrix[0][j] == 0 || matrix[i][0] == 0){
        			matrix[i][j] = 0;
        		}
        	}
        	matrix[i][0] = col0 == 0 ? 0 : matrix[i][0];
        }
        
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
