package cn.edu.myxof.solution6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution690 {
    private Map<Integer, Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
    	for(Employee employee: employees) {
    		map.put(employee.id, employee);
    	}
        return getOne(id);
    }
    
    private int getOne(int id){
        int val = map.get(id).importance;
        if(map.get(id).subordinates != null) {
            for(Integer i : map.get(id).subordinates){
                val += getOne(i);
            }
        }

        return val;
    }
    
    // Employee info
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
