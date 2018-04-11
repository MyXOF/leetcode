package cn.edu.myxof.solution2;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int left = n-1;
        int right = n;
        int score = 1;
        String str = "(";
        calculate(left, right, score, str,  result);
        return result;
    }
    
    private void calculate(int left, int right, int score, String str, List<String> result){
        if(score < 0){return;}
        if(left == 0){
            String tmp = str;
            for(int i =0;i<right;i++){
                tmp += ")";
            }
            result.add(tmp);
            return;
        }
        calculate(left-1,right,score+1,str+"(", result);
        calculate(left,right-1,score-1,str+")", result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
