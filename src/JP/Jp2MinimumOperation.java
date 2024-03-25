package JP;

public class Jp2MinimumOperation {
    public static int minCostToSameElement(int[] arr) {
        // Find the most frequent element in the array.
        int mostFrequent = Integer.MIN_VALUE;
        int count = 0;
        for (int num : arr) {
            int numCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    numCount++;
                }
            }
            if (numCount > count) {
                mostFrequent = num;
                count = numCount;
            }
        }

        // Calculate the cost of changing each element to the most frequent element.
        int cost = 0;
        for (int num : arr) {
            cost += Math.abs(num - mostFrequent);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 5};
        int[] arr2 = {0, 1, 1, 5};
        int[] arr3 = {4, 5, 5, 5};
        
        // x = -1 len =2 {0,1,1,5}
        // x= 4 len =3 {4,5,5,5}
        // x=1 len =1 {5,5,5,5}

        System.out.println(minCostToSameElement(arr1)); // Output: 6
        System.out.println(minCostToSameElement(arr2)); // Output: 5
        System.out.println(minCostToSameElement(arr3)); // Output: 0
    }
}
