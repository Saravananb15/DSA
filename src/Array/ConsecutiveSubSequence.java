//package Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class ConsecutiveSubSequence {
//	public static void main(String[] args) {
//		int[] nums = {7,-9,3,-6,3,5,3,6,-2,-5,8,6,-4,-6,-4,-4,5,-9,2,7,0,0};
//		int res = longestConsecutive(nums);
//		System.out.println(res);
//	}
//
//	public static int longestConsecutive(int[] nums) {
//		List<E> list = new ArrayList<E>(Arrays.asList(nums));
//		Set<Integer> set = new HashSet<>();
//		set.addAll(list);
////		list.clear();
////		list.addAll(set);
//		int count = 0;
//		List<Integer> size = new ArrayList<>();
//		for(int i=0;i<nums.length-1;i++) {
//			int sum = nums[i]+1;
//			if(set.contains(sum)) {
//				size.add(nums[i]);
//			}else if(){
//				
//			}
//		}
//	}
//}
