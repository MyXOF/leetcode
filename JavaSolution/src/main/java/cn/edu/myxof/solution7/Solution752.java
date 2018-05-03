package cn.edu.myxof.solution7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution752 {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();
        String start = "0000";
        if(!dead.contains(start)){
        	dead.add(start);
        	queue.offer(start);
        }
        int step = 0;
        while(!queue.isEmpty()){
        	int size = queue.size();
        	for(int i = 0; i < size;i++){
        		String now = queue.poll();        
        		for(int j = 0; j < 4;j++){
        			char c = now.charAt(j);
        			int n = c - '0';
        			int[] nextN = {(n+1)%10, (n+9)% 10};
        			for(int p : nextN){
        				String nextStr = now.substring(0, j)+p+now.substring(j+1, 4);
        				if(nextStr.equals(target)) return step+1;
        				if(!dead.contains(nextStr)){
        					queue.offer(nextStr);
            				dead.add(nextStr);
        				}
        			}
        		}
        	}
        	step++;
        }
        return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
