package cn.edu.myxof.solution2;

import cn.edu.myxof.utils.ListNode;

public class Solution24 {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = head.next;
		head.next = swapPairs(p.next);
		p.next = head;
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
