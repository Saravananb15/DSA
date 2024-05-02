package binarySearch;

public class FindMedianOfTwoSortedArray {
	public static void main(String[] args) {
		int[] n1 = { 1,3,4,7,10,12};
		int[] n2 = {2,3,6,15};
		System.out.println(findMedianSortedArrays(n1, n2));
		
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1+n2];
        int i=0,j=0;
        int index =0;
        while(i<n1 && j<n2) {
        	if(nums1[i]<nums2[j]) {
        		nums3[index]=nums1[i];
        		i++;
        	}else {
        		nums3[index]=nums2[j];
        		j++;
        	}
        	index++;
        }
        
        while(i<n1) {
        	nums3[index]=nums1[i++];
        	index++;
        }
        while(j<n2) {
        	nums3[index]=nums2[j++];
        	index++;
        }
        
        int n = (n1+n2);
        
        if(n%2==1) {
        	return nums3[n/2];	
        }
        
        return (double)((double)(nums3[n/2])+(double)(nums3[n/2-1]))/2.0;
    }
}
