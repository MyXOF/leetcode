package cn.edu.myxof.solution8;

import cn.edu.myxof.utils.ListNode;

public class Solution83 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode curr = head;
		while (true) {
			if (curr.next == null) {
				break;
			}
			if (curr.val == curr.next.val) {
				if (curr.next.next == null) {
					curr.next = null;
				} else {
					curr.next = curr.next.next;
				}
				continue;
			}
			curr = curr.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
