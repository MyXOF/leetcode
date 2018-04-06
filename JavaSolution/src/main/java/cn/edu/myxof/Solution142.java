package cn.edu.myxof;

import cn.edu.myxof.utils.ListNode;

public class Solution142 {
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		boolean flag = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				flag = true;
				break;
			}
		}
		if (!flag)
			return null;
		ListNode curr = head;
		while (curr != fast) {
			curr = curr.next;
			fast = fast.next;
		}
		return curr;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
