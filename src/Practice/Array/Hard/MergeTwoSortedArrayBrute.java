package Practice.Array.Hard;

public class MergeTwoSortedArrayBrute {
	public static void main(String[] args) {
		int arr1[] = {0};
		int arr2[] = {1};
		MergeTwoSortedArrayBrute merge = new MergeTwoSortedArrayBrute();
		merge.merge(arr1,0, arr2,1);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

	public void merge(int[] nums1,int n, int[] nums2,int m) {
		long[] arr3 = new long[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:

        while (left < n && right < m) {
            if (nums1[left] <= nums2[right]) {
                arr3[index] = nums1[left];
                left++;
                index++;
            } else {
                arr3[index] = nums2[right];
                right++;
                index++;
            }
        }

        // If right pointer reaches the end:
        while (left < n) {
            arr3[index++] = nums1[left++];
        }

        // If left pointer reaches the end:
        while (right < m) {
            arr3[index++] = nums2[right++];
        }

        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                nums1[i] = (int) arr3[i];
            } else {
                nums2[i - n] = (int) arr3[i];
            }
        }
	}
}
