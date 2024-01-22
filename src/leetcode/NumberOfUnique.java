package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfUnique {
	public static void main(String[] args) {
		int arr[] = {16,16,10,12,10,13,-1,-1,10,12,12,-1,12,10,10};
		NumberOfUnique no = new NumberOfUnique();
		System.out.println(no.unique(arr));
	}
	public boolean unique(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int left=0,right=arr.length-1;
		while(left<=right) {
			if(left==right) {
				map.put(arr[left], map.getOrDefault(arr[left], 0)+1);
			}else {
				map.put(arr[left], map.getOrDefault(arr[left], 0)+1);
				map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
			}
			left++;
			right--;
		}
		
		 Map<Integer, Integer> freq = new HashMap<>();
	        for (int x : arr) {
	            freq.put(x, freq.getOrDefault(x, 0) + 1);
	        }
		Set<Integer> set = new HashSet<>(map.values());
		return set.size()==map.size();
	}
}
