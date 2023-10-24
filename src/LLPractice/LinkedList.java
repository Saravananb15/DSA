package LLPractice;

public class LinkedList {

	private Node head;
	private Node tail;

	public void insertAtFirst(int val) {
		Node temp = new Node(val);
		temp.next = head;
		head = temp;
		if (tail == null) {
			tail = head;
		}
	}

	public void insertLast(int val) {

		Node temp = new Node(val);
		if (head == null) {
			head = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
		if (tail == null) {
			tail = head;
		}

	}

	public void insertAfterIndex(int val, int index) {
		if (head == null) {
			insertAtFirst(val);
		} else {
			Node pointer = head;
			for (int i = 0; i < index; i++) {
				pointer = pointer.next;
			}
			Node temp = new Node(val, pointer.next);
			pointer.next = temp;
		}
		if (tail == null) {
			tail = head;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	private class Node {
		private int val;
		private Node next;

		public Node(int val, Node next) {
			super();
			this.val = val;
			this.next = next;
		}

		public Node(int val) {
			super();
			this.val = val;
		}

	}
}