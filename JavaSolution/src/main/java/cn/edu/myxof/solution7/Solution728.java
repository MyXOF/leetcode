package cn.edu.myxof.solution7;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right;i++){
            if(i < 10){result.add(i);}
            else if(isSelfDividing(i)){result.add(i);}
        }
        return result;
    }
    
    private boolean isSelfDividing(int num){
        int tmp = num;
        while(tmp != 0){
            int res = tmp % 10;
            if(res == 0){return false;}
            if(num % res != 0){ return false;}
            tmp /= 10;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
