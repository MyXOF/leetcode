package cn.edu.myxof.solution7;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> dictionary = new HashSet<>();
        for(int i=0;i < J.length();i++){
            dictionary.add(J.charAt(i));
        }
        for(int i=0;i < S.length();i++){
            if(dictionary.contains(S.charAt(i))){
                result += 1;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
