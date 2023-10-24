package LinkedList.singlyLinkedList;

public class DLList {
	public static void main(String[] args) {
		DLLNode dllnode = new DLLNode();
		dllnode.insertFirst(100);
//		dllnode.insertFirst(99);
		dllnode.insertFirst(98);
		dllnode.insertFirst(97);
		dllnode.insertFirst(96);
		dllnode.insertAtLast(101);
		dllnode.insertAtLast(102);
		dllnode.display();
//		dllnode.displayPrevTail();
//		dllnode.displayRev();
//		
		dllnode.insertAfterVal(98, 99);
//		dllnode.display();
//		
		
//		dllnode.displayPrev(100);
		
		
		dllnode.delete(100);
		
		dllnode.display();
	}
}
