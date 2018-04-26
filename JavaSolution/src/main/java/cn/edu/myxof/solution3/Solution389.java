package cn.edu.myxof.solution3;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(Character c:s.toCharArray()){
        	res ^= c;
        }
        for(Character c:t.toCharArray()){
        	res ^= c;
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
