package TUFLinkedList;

public class linkedlist {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5 };
		Node head =  convertToNode(arr);
		Node temp = head;
		while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
		}
		System.out.println(lengthOfLL(head));
	}

	public static Node convertToNode(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover=temp;
		}
		return head;
	}
	
	public static int lengthOfLL(Node head) {
		int count =0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}

class Node {
	int data;
	Node next;
	Node head;
	Node tail;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(int data) {
		super();
		this.data = data;
	}
}
