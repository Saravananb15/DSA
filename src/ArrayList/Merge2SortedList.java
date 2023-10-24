//package ArrayList;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Merge2SortedList {
//	public static void main(String[] args) {
//		List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
//		List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));
//		List<Integer> list = merge(list1, list2);
//		for (int i : list) {
//			System.out.println(i);
//		}
//	}
//
//	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		list1.addAll(list2);
//		Collections.sort(list1);
//		return list1;
//	}
//
//	public class ListNode {
//		int val;
//		ListNode next;
//
//		ListNode() {
//		}
//
//		ListNode(int val) {
//			this.val = val;
//		}
//
//		ListNode(int val, ListNode next) {
//			this.val = val;
//			this.next = next;
//		}
//	}
//}
