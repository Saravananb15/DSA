package Practice.Array;

public class LeftRotateByN {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = 3;
		LeftRotateByN left = new LeftRotateByN();
//		left.leftRotate(arr, n);
		left.rotate(arr, n);
		for(int val : arr) {
			System.out.println(val);
		}
//		printReverse(100,110);
	}
	
	
	
//	public static void printReverse(int n,int size) {
//		if(n==size)return;
//		printReverse(n+1,size);
//		System.out.println(n);
//	}
//	public void leftRotate(int arr[],int n) {
//		int length = n%arr.length;
//		
//		for(int i=0;i<length;i++) {
//			int temp = arr[0];
//			for(int j=1;j<arr.length;j++) {
//				arr[j-1] = arr[j];
//			}
//			arr[arr.length-1]=temp;
//		}
//	}
	
	
	public void rotate(int[] nums, int k) {
		int size = nums.length;
		k = k%size;
        swap(nums, 0,size-k-1);
        swap(nums,size-k,size-1);
        swap(nums,0,size-1);
    }

    public void swap(int arr[],int i,int j){
    	while(i<=j) {
    		int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
    	}
        
    }
}

