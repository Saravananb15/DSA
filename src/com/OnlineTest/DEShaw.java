package com.OnlineTest;

public class DEShaw {
	public static void main(String[] args) {
        int[] arr1 = {3, 5, 6}; // {3} 1 , {3,5} 2,{3,5,6} 3 so output = 1+2+3 =6 
        int[] arr2 = {1, 1, 1, 1}; // 4+4+4+4 = 16
        int[] arr3 = {1, 2, 1}; // {1} 1, {1,2,1} 3,{1} 1 = 1+3+1 = 5

        int output1 = calculateOutput(arr1);
        int output2 = calculateOutput(arr2);
        int output3 = calculateOutput(arr3);

        System.out.println("Output for input1: " + output1);
        System.out.println("Output for input2: " + output2);
        System.out.println("Output for input3: " + output3);
    }

    public static int calculateOutput(int[] arr) {
    	int n = arr.length;
        int result = 0;
        int longestIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[longestIndex]) {
                longestIndex = i;
            }
            result += (longestIndex + 1);
        }

        return result;
    }
}
