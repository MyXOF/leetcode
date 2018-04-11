package cn.edu.myxof.solution4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1,p2)->{
        	if(p1[0] == p2[0]){
        		return p1[1]-p2[1];
        	}else{
        		return p2[0]-p1[0];
        	}
        });
        
        List<int[]> res = new LinkedList<>();
        for(int[] p : people){
        	res.add(p[1], p);
        }
        return res.toArray(new int[people.length][]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
	}

}
