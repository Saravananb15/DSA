package LinkedList.singlyLinkedList;

public class DLLNode {
	private Node head;
	private Node tail;
	int size = 0;

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		if (tail == null) {
			tail = head;
		}
		head = node;
		size++;
	}

	public void insertAtLast(int val) {
		Node node = new Node(val);
		if(head == null) insertFirst(val);
		node.next = null;
		node.prev = tail;
		tail.next = node;
		tail = node;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayRev() {
		Node last = tail;
		while (last != null) {
			System.out.print(last.val + " -> ");
			last = last.prev;
		}
		System.out.println();
	}

	public void displayPrevTail() {
		Node temp = tail;
		System.out.println(temp.prev.val);
	}

	public class Node {
		int val;
		Node next;
		Node prev;

		public Node(int val) {
			super();
			this.val = val;
		}

		public Node(int val, Node next, Node prev) {
			super();
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}

}
