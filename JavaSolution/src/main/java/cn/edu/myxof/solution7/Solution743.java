package cn.edu.myxof.solution7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution743 {
    public static int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] t : times){
        	if(!graph.containsKey(t[0])){
        		graph.put(t[0], new ArrayList<>());
        	}
        	graph.get(t[0]).add(new int[]{t[1],t[2]});
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((i1, i2) -> i1[0]-i2[0]);
        Map<Integer, Integer> dist = new HashMap<>();
        queue.add(new int[]{0,K});
        while(!queue.isEmpty()){
        	int[] info = queue.poll();
        	if(dist.containsKey(info[1])) continue;
        	dist.put(info[1], info[0]);
        	if(graph.containsKey(info[1])){
        		for(int[] edges : graph.get(info[1])){
        			if(!dist.containsKey(edges[0])){
        				queue.offer(new int[]{edges[1]+info[0],edges[0]});
        			}
        		}
        	}
        }             
        if(dist.size() != N) return -1;
        int res = 0;
        for(int v: dist.values()){
        	res = Math.max(res, v);
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
		System.out.println(networkDelayTime(times, 4, 2));
	}

}
