package com.my.leetcode.old;

/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	public static void main(String args[]) {
		AddTwoNumbers atn = new AddTwoNumbers();
		int[] list1 = { 9, 9, 9, 9, 9, 9, 9 };
		int[] list2 = { 9, 9, 9, 9 };
		ListNode l1 = new ListNode(list1[0]);
		ListNode l2 = new ListNode(list2[0]);
		ListNode p = l1, q = l2;
		for (int i = 1; i < list1.length; i++) {
			ListNode nextNode = new ListNode(list1[i]);
			l1.next = nextNode;
			l1 = l1.next;
		}
		for (int i = 1; i < list2.length; i++) {
			ListNode nextNode = new ListNode(list2[i]);
			l2.next = nextNode;
			l2 = l2.next;
		}
		ListNode ln = atn.addTwoNumbers(p, q);
		ListNode head = ln;
		while (ln != null) {
			System.out.print((ln == head) ? "[" + ln.val : ln.val);
			System.out.print((ln.next != null) ? "," : "]");
			ln = ln.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
