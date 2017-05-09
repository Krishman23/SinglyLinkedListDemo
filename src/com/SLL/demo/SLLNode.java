/**
 * 
 */
package com.SLL.demo;

/**
 * @author Krishman
 *
 */
public class SLLNode {

	public int info;
	public SLLNode next;

	public SLLNode() {
		next = null;
	}

	public SLLNode(int element) {
		info = element;
		next = null;
	}

	public SLLNode(int element, SLLNode nextElement) {
		info = element;
		next = nextElement;
	}

}
