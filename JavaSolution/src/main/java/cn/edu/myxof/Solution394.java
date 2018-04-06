package cn.edu.myxof;

import java.util.Stack;

public class Solution394 {
	public String decodeString(String s) {
		StringBuilder res = new StringBuilder();
		int len = s.length();
		int i = 0;
		Stack<Integer> countStack = new Stack<Integer>();
		Stack<String> strStack = new Stack<String>();
		while (i < len) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int count = 0;
				while (Character.isDigit(s.charAt(i))) {
					count = count * 10 + (s.charAt(i) - '0');
					i++;
				}
				countStack.push(count);
			} else if (ch == '[') {
				strStack.push(res.toString());
				res.setLength(0);
				i++;
			} else if (ch == ']') {
				String lastStr = strStack.pop();
				StringBuilder tmp = new StringBuilder(lastStr);
				int count = countStack.pop();
				for (int j = 0; j < count; j++) {
					tmp.append(res.toString());
				}
				res = tmp;
				i++;
			} else {
				res.append(s.charAt(i));
				i++;
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
