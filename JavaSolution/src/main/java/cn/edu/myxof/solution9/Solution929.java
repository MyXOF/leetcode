package cn.edu.myxof.solution9;

import java.util.HashSet;

public class Solution929 {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails){
        	StringBuffer buffer = new StringBuffer();
        	boolean isIngored = false;
        	boolean isDot = false;
        	for(char c: email.toCharArray()){
        		if(c == '.'){
        			if(isDot){
        				buffer.append(c);
        			}
        		} else if (c == '+') {
        			isIngored = true;
				} else if (c == '@'){
					isIngored = false;
					isDot = true;
				} else{
					if(!isIngored){
						buffer.append(c);
					}
				}
        	}
        	set.add(buffer.toString());
        }
        for(String email : set){
        	System.out.println(email);
        }
        return set.size();
    }
    
    public static int numUniqueEmails2(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails){
        	int split = email.indexOf('@');
        	String local = email.substring(0, split);
        	String rest = email.substring(split+1);
        	int plus = local.indexOf('+');
        	if(plus >= 0){
        		local = local.substring(0, plus);
        	}
        	local = local.replaceAll(".", "");
        	set.add(local+rest);
        }
        for(String email : set){
        	System.out.println(email);
        }
        return set.size();
    }
    
	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails2(emails));
	}

}
