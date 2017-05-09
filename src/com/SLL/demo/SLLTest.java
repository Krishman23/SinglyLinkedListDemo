/**
 * 
 */
package com.SLL.demo;

/**
 * @author Krishman
 *
 */
public class SLLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL sll = new SLL();
		sll.append(1);
		sll.append(10);
		sll.append(11);
		sll.append(13);
		sll.append(21);
		sll.append(51);
		sll.append(21);
		sll.append(71);
		sll.append(91);
		sll.append(41);
		sll.dispalySLL();
		sll.removeTail();
		sll.dispalySLL();
		sll.removeGreaterThan(41);
		sll.dispalySLL();

	}

}
