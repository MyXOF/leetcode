package cn.edu.myxof.solution5;

public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0) - 'a' >= 0) return false;
        int len = word.length();
        boolean low = false;
        boolean upper = false;
        for(int i = 1; i < len;i++) {
        	if(word.charAt(0) - 'a' >= 0) {
        		low = true;
        	} else {
        		upper = true;
        	}
        	if(low & upper) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('A' - 'a');
		System.out.println('b' - 'a');
		String word = "FlaG";
        int len = word.length();
        boolean low = false;
        boolean upper = false;
        for(int i = 1; i < len;i++) {
        	if(word.charAt(0) - 'a' >= 0) {
        		low = true;
        	} else {
        		upper = true;
        	}
        	if(low & upper) {
        		System.out.println(false);
        		return;
        	}
        }
	}

}
