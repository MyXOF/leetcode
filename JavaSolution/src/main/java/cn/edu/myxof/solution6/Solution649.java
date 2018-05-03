package cn.edu.myxof.solution6;

import java.util.LinkedList;
import java.util.Queue;

public class Solution649 {
    public String predictPartyVictory(String senate) {
    	int[] people = new int[]{0,0};
    	int[] ban = new int[]{0,0};
    	Queue<Integer> queue = new LinkedList<Integer>();
    	for(Character character : senate.toCharArray()){
    		int index = character == 'R' ? 0 : 1;
    		people[index]++;
    		queue.add(index);
    	}
    	while(people[0] > 0 && people[1] > 0){
    		int p = queue.poll();
    		if(ban[p] > 0){
    			ban[p]--;
    			people[p]--;
    		} else{
    			ban[p^1]++;
    			queue.add(p);
    		}
    	}
    	return people[0] > 0 ? "Radiant" : "Dire";
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
