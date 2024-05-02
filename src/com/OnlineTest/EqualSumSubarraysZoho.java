package com.OnlineTest;

import java.util.HashSet;

public class EqualSumSubarraysZoho {

	static boolean canSplitArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            // If the total sum is odd, we cannot split it into equal halves
            return false;
        }

        int targetSum = totalSum / 2;
        HashSet<Integer> seenSums = new HashSet<>();
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum == targetSum || seenSums.contains(currentSum - targetSum)) {
                return true;
            }
            seenSums.add(currentSum);
        }

        return false;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,6,10,4,8,5};
		boolean result = canSplitArray(arr);
		System.out.println("Can divide the array into two subarrays with equal sum: " + result);
	}
}
