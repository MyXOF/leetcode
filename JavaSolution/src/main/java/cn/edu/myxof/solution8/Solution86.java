package cn.edu.myxof.solution8;

import cn.edu.myxof.utils.ListNode;

public class Solution86 {
	public ListNode partition(ListNode head, int x) {
		ListNode smallFake = new ListNode(0);
		ListNode smallCurr = smallFake;
		ListNode bigFake = new ListNode(0);
		ListNode bigCurr = bigFake;
		ListNode curr = head;
		while (curr != null) {
			ListNode tmp = new ListNode(curr.val);
			if (curr.val < x) {
				smallCurr.next = tmp;
				smallCurr = smallCurr.next;
			} else {
				bigCurr.next = tmp;
				bigCurr = bigCurr.next;
			}
			curr = curr.next;
		}
		smallCurr.next = bigFake.next;
		return smallFake.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
