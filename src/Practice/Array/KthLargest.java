package Practice.Array;

import java.util.PriorityQueue;

public class KthLargest {
	public static void main(String[] args) {
		int nums[] = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		KthLargest lar = new KthLargest();
		System.out.println(lar.findKthLargest(nums, k));
	}

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		for (int i = 0; i < k - 1; i++) {
			pq.remove();
		}
		return pq.peek();
	}
}
