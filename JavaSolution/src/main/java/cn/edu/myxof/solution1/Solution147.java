package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.ListNode;

public class Solution147 {
	public ListNode insertionSortList(ListNode head) {
		while (true) {
			ListNode p = head;
			int count = 0;
			while (p != null && p.next != null) {
				if (p.val > p.next.val) {
					int tmp = p.val;
					p.val = p.next.val;
					p.next.val = tmp;
					count++;
				}
				p = p.next;
			}

			if (count == 0) {
				break;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
