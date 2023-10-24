package LinkedList.singlyLinkedList;

public class LL {

	private Node head;
	private Node tail;
	private Node prev;
	private int size;

	public LL() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void insertLast(int val) {
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insertAtIndex(int index, int val) {
		if (index == 0)
			insertFirst(val);
		if (index == size)
			insertLast(val);

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}

	public void deleteTail() {
		tail = get(size-2);
		tail.next = null;
		size--;
	}
	
	public void deleteHead() {
		if(head == null) tail =null;
		head = head.next;
		size--;
	}
	
	public int deleteAtIndex(int index) {
		if(index == 0) deleteHead();
		if(index == (size-1)) deleteTail();
		Node prev = get(index-1);
		int val = prev.next.val;
		prev.next = get(index+1);
		size--;
		return val;
	}
	
	
	public Node get(int index) {
		if(index == 0) return head;
		Node node = head;
		for(int i=0;i<index;i++) {
			node = node.next;
		}
		
		return node;
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("returning size " + size);
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
