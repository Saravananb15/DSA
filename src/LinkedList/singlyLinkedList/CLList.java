package LinkedList.singlyLinkedList;


public class CLList {
	private Node head;
	private Node tail;
	public void insert(int val) {
		Node node = new Node(val);
		if(head == null ) {
			head = node;
			tail = head;
			return;
		}
		tail.next=node;
		tail = node;
		tail.next=head;
		
	}
	public void display() {
		Node node = head;
		do {
			System.out.print(node.val +" -> ");
			node = node.next;
		}while(node != head);
		System.out.println("");
	}
	
	public void display(int val) {
		Node temp = head;
		do {
			if(temp.val == val) {
				System.out.println(temp.val);
			}
			temp = temp.next;
		}while(temp != head);
	}
	public void delete(int val) {
		Node temp = head;
		if(temp == null ) return;
		if(temp.val == val ) {
			head = head.next;
			tail.next= head;
		}
		
		do {
			Node n = temp.next;
			if(n.val == val) {
				temp.next = n.next;
				break;
			}
			temp = temp.next;
		}while(temp != head );
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
