package Practice.Array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {1, 1, 2};
		int res[] = removeDuplicates(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	public static int[] removeDuplicates(int[] arr) {
	    //   TODO
		int[] uniqueArray = new int[arr.length];
		int index =0;
	    for(int i=0;i<arr.length;i++) {
	    	boolean isDuplicate = false;
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			isDuplicate = true;
	    		}
	    	}
	    	if(!isDuplicate) {
	    		uniqueArray[index++]=arr[i];
	    	}
	    }
	    return Arrays.copyOf(uniqueArray, index);
	  }
}

