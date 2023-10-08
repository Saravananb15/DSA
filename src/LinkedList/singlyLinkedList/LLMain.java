package LinkedList.singlyLinkedList;

public class LLMain {
	public static void main(String[] args) {
		LL ll = new LL();
		ll.insertFirst(3);
		ll.insertFirst(2);
		ll.insertFirst(8);
		ll.insertFirst(17);
		ll.insertFirst(6);
		ll.insertFirst(8);
		ll.insertLast(99);
		ll.insertAtIndex(3, 100);
		ll.display();
		ll.deleteTail();
		ll.display();
		ll.deleteHead();
		ll.display();
		System.out.println(ll.deleteAtIndex(3));
		ll.display();
	}
}
