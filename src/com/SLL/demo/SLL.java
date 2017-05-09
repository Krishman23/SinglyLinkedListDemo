/**
 * 
 */
package com.SLL.demo;

/**
 * @author Krishman
 *
 */
public class SLL {
	public SLLNode head;
	public SLLNode temp;

	public SLL() {
		head = null;
		temp = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// 1. Append an element into the linkedlist
	public void append(int element) {
		if (isEmpty()) {
			head = new SLLNode(element);
			temp = head;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new SLLNode(element);
		}
	}

	// 2. Remove the tail element from a linkedlist
	public void removeTail() {
		if (!isEmpty()) {
			if (head.next == null) {
				head = null;
			} else {
				temp = head;

				while (temp.next.next != null) {
					temp = temp.next;
					// System.out.println(temp.info);
				}
				temp.next = null;
			}
		}
	}

	// 3. Remove all element in the linkedlist that is great than a target value
	public void removeGreaterThan(int target) {

		SLLNode prev = new SLLNode(0);
		prev.next = head;
		SLLNode currNode = prev;

		while (currNode.next != null) {

			if (currNode.next.info > target) {
				SLLNode nextNode = currNode.next;
				currNode.next = nextNode.next;
			} else {
				currNode = currNode.next;
			}
		}

		head = prev.next;
	}

	public void dispalySLL() {
		if (!isEmpty()) {
			temp = head;
			System.out.print("Head:");
			while (temp != null) {
				System.out.print(temp.info + "-> ");
				temp = temp.next;
			}
			System.out.println("\\");

		} else {
			System.out.println("SinglyLinkedList Empty");
		}
	}
}
