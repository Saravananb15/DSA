package Practice.Array;

public class SortColors {
	public static void main(String[] args) {
		int arr[] = {2,2,2,1,1,1,0,0,0,1};
		SortColors sc = new SortColors();
		sc.sortColors(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public void sortColors(int nums[]) {
		// better
//		int red =0;
//        int white = 0;
//        int blue =0;
//
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==0) red++;
//            if(nums[i]==1) white++;
//            if(nums[i]==2) blue++;
//        }
//
//        for(int i=0;i<red;i++){
//            nums[i]=0;
//        }
//        for(int i=red;i<red+white;i++){
//            nums[i]=1;
//        }
//        for(int i=red+white;i<red+white+blue;i++){
//            nums[i]=2;
//        }
		
		
		//optimal 
		
//		int low=0,high=nums.length-1,mid=0;
//		while(mid<=high) {
//			if(nums[mid]==1) {
//				mid++;
//			}else {
//				if(nums[mid]==0) {
//					swap(nums, low, mid);
//					low++;
//					mid++;
//					continue;
//				}
//				if(nums[mid]==2) {
//					swap(nums, high, mid);
//					high--;
//				}
//			}
//		}
		int low=0,high=nums.length-1,mid=0;
		while(mid<=high) {
			if(nums[mid]==1) {
				mid++;
			}else if(nums[mid]==0) {
				swap(nums, low, mid);
				low++;
				mid++;
			}else {
				swap(nums, high, mid);
				high--;
			}
		}
		
		
	}
	
	public void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
