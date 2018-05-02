package cn.edu.myxof.solution6;

import java.util.List;
import java.util.Stack;

public class Solution636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        int time = 0;
        Stack<Integer> stack = new Stack<>();
        for(String log : logs){
            String[] values = log.split(":");
            int t = Integer.parseInt(values[2]);
            if(!stack.isEmpty()){
                res[stack.peek()] += (t - time);
            }
            time = t;
            if(values[1].charAt(0) == 's'){
                stack.push(Integer.parseInt(values[0]));
            } else{
                res[stack.pop()]++;
                time++;
            }
        }
        return res;        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> logs = new ArrayList<>();
//		logs.add("0:start:0");
//		logs.add("1:start:2");
//		logs.add("1:end:5");
//		logs.add("0:end:6");
//		
//		int[] res = exclusiveTime(2, logs);
//		System.out.println(res[0]+"-"+res[1]);
	}

}
