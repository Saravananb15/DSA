package LLPractice;

public class removeDuplicates {
	static ListNode head;
	ListNode tail;

	public static void main(String[] args) {
		removeDuplicates rd = new removeDuplicates();

		rd.insertAtFirst(2);
		rd.insertAtFirst(1);
		rd.insertAtFirst(1);
//		rd.insertAtFirst(3);
//		rd.insertAtFirst(3);
		rd.display();
		try {
			deleteDuplicates(head);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		rd.display();
	}

	public void insertAtFirst(int val) {
		ListNode temp = new ListNode(val);
		temp.next = head;
		head = temp;
		if (tail == null) {
			tail = head;
		}
	}

	public void display() {
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode ln = head;
		ListNode lnPointer = ln.next;
		while (lnPointer != null) {
			if (ln.val == lnPointer.val) {
				ln.next = lnPointer.next;
			}
			if (ln.next != null) {
				ln = ln.next;
				lnPointer = ln.next;
			}else {
				break;
			}
		}

		return ln;

	}
}
