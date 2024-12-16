package com.example.demo.test4;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false; // No cycle possible
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next; // Move slow pointer by 1 step
			fast = fast.next.next; // Move fast pointer by 2 steps

			if (slow == fast) { // If they meet, there is a cycle
				return true;
			}
		}

		return false; // No cycle
	}

	public static void main(String[] args) {
		// Example 1: Cycle exists
		ListNode head1 = new ListNode(3);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(0);
		head1.next.next.next = new ListNode(-4);
		head1.next.next.next.next = head1.next; // Creates a cycle

		LinkedListCycle solution = new LinkedListCycle();
		System.out.println(solution.hasCycle(head1)); // Output: true

		// Example 2: No cycle
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);

		System.out.println(solution.hasCycle(head2)); // Output: false
	}

}
