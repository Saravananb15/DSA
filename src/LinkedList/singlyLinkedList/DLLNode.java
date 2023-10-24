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
	
	public void insertAfterVal(int val, int insertVal) {
		Node temp = head;
		while(temp != null) {
			if(temp.val == val) {
				Node node = new Node(insertVal);
				temp.next.prev = node;
				node.next = temp.next;
				temp.next= node;
				node.prev = temp;
			}
			temp= temp.next;
		}
	}

	public void delete(int val) {
		Node temp = head;
		while(temp != null) {
			if(temp.val == val) {
				temp = temp.next;
			}
			temp = temp.next;
		}
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
	public void displayPrev(int val) {
		Node temp = head;
		while(temp != null) {
			if(temp.val == val) {
				System.out.println(temp.prev.val);
			}
			temp= temp.next;
		}
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
