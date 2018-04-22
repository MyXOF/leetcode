package cn.edu.myxof.solution3;

import java.util.HashSet;
import java.util.Set;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i< 9; i++){
        	if(!checkRow(board, i)){
        		System.out.println(1);
        		return false;
        	}
        	if(!checkCol(board, i)){
        		System.out.println(2);
        		return false;
        	}
        }
        for(int i = 0; i < 9;i+=3){
        	for(int j = 0; j < 9;j+=3){
        		if(!checkSquare(board, i, j)){
        			System.out.println(3);
            		return false;
            	}
        	}
        }
        return true;
    }
    
    private boolean checkSquare(char[][] board, int r, int c){
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = r; i < r+3;i++){
        	for(int j = c; j < c+3;j++){
        		if(board[i][j] != '.'){
        			set.add(board[i][j]);
        			count++;
        		}
        	}
        }
        return count == set.size();
    }
    
    private boolean checkRow(char[][] board, int r){
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < 9;i++){
    		if(board[r][i] != '.'){
    			set.add(board[r][i]);
    			count++;
    		}
        }
        return count == set.size();
    }
    
    private boolean checkCol(char[][] board, int c){
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < 9;i++){
    		if(board[i][c] != '.'){
    			set.add(board[i][c]);
    			count++;
    		}
        }
        return count == set.size();
    }    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
