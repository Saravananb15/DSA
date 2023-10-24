package LLPractice;

public class LLMain {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertLast(4);
		ll.insertLast(5);
		ll.insertAtFirst(1);
		ll.insertAtFirst(2);
		ll.insertAtFirst(3);
		ll.insertAfterIndex(99, 3);
		ll.display();
	}
}
