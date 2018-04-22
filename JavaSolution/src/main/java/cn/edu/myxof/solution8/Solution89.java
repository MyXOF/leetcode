package cn.edu.myxof.solution8;

import java.util.LinkedList;
import java.util.List;

public class Solution89 {
	public List<Integer> grayCode(int n) {
		List<Integer> res = new LinkedList<>();
		for (int i = 0; i < (1 << n); i++) {
			res.add(i ^ (i >> 1));
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0 ^ (0 >> 1));
	}

}
