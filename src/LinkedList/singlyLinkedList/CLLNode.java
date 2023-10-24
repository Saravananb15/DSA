package LinkedList.singlyLinkedList;

public class CLLNode {
	public static void main(String[] args) {
		CLList cl = new CLList();
		
		cl.insert(1);
		cl.insert(2);
		cl.insert(3);
		
		cl.display();
		cl.display(2);
		
		cl.delete(2);
		cl.display();
	}
}
