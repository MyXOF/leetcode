package cn.edu.myxof;

import java.util.LinkedList;
import java.util.List;

public class Solution17 {
	public List<String> letterCombinations(String digits) {
		LinkedList<String> result = new LinkedList<String>();
		if (digits == null || digits.length() == 0) {
			return result;
		}
		result.add("");
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		for (int i = 0; i < digits.length(); i++) {
			int index = Character.getNumericValue(digits.charAt(i));
			while (result.peek().length() == i) {
				String pre = result.remove();
				for (char c : mapping[index].toCharArray()) {
					result.add(pre + c);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
