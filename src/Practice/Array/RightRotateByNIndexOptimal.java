package Practice.Array;

public class RightRotateByNIndexOptimal {
	public static void main(String[] args) {
		int arr[] = {-1,-100,3,99};
		RightRotateByNIndexOptimal right = new RightRotateByNIndexOptimal();
		right.rotate(arr, 2);
		for(int i : arr) {
			System.out.print(i+" ");
		}
 	}
	
	 public void rotate(int[] nums, int k) {
		 k %= nums.length;
	        int n = nums.length;
	        swap(nums,0,n-1);
	        swap(nums,0,k-1);
	        swap(nums,k,n-1);
	    }

	    public void swap(int arr[],int initial,int end){
	        while(initial<=end){
	            int temp = arr[initial];
	            arr[initial] = arr[end];
	            arr[end]= temp;
	            initial++;
	            end--;
	        }
	    }
//	public void rotateRight(int arr[],int n) {
//		int size = arr.length;
//		n = n%size;
//		swap(arr, size-n, size-1);
//		swap(arr, 0, size-n-1);
//		swap(arr,0,size-1);
//		
//	}
//	
//	public void swap(int arr[],int initial,int end) {
//		if(initial>=end)return ;
//		int temp = arr[initial];
//		arr[initial]=arr[end];
//		arr[end]= temp;
//		swap(arr, initial+1, end-1);
//	}
}
