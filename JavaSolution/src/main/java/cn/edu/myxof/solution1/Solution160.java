package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.ListNode;

public class Solution160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null && headB == null)
			return null;
		if (headA == null || headB == null)
			return null;

		ListNode currA = headA;
		ListNode currB = headB;
		while (currA.next != null && currB.next != null) {
			currA = currA.next;
			currB = currB.next;
		}
		int leap = 0;
		if (currA.next == null) {
			while (currB != currA && currB != null) {
				leap++;
				currB = currB.next;
			}
			if (currB == null)
				return null;
			return getIntersectionNode(headB, headA, leap);
		} else {
			while (currB != currA && currA != null) {
				leap++;
				currA = currA.next;
			}
			if (currA == null)
				return null;
			return getIntersectionNode(headA, headB, leap);
		}

	}

	private ListNode getIntersectionNode(ListNode headA, ListNode headB, int leap) {
		for (int i = 0; i < leap; i++) {
			headA = headA.next;
		}
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
