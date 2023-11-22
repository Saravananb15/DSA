package Practice.Array;


public class MergeSortedArrays {
	public static void main(String[] args) {
		int m = 3,n=3;
		int nums1[] = new int[m+n];
		int nums3[] = { 1, 2, 3, 0, 0, 0 };
		for(int i=0;i<m;i++) {
			nums1[i]=nums3[i];
		}
		int nums2[] = { 2, 5, 6 };
		MergeSortedArrays merge = new MergeSortedArrays();
		merge.merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.println(i);
		}
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
	}

}
