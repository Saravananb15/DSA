package Array;

public class RightRotateByNIndexOptimal {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		RightRotateByNIndexOptimal right = new RightRotateByNIndexOptimal();
		right.rotateRight(arr, 3);
		for(int i : arr) {
			System.out.print(i+" ");
		}
 	}
	public void rotateRight(int arr[],int n) {
		int size = arr.length;
		n = n%size;
		swap(arr, size-n, size-1);
		swap(arr, 0, size-n-1);
		swap(arr,0,size-1);
		
	}
	
	public void swap(int arr[],int initial,int end) {
		if(initial>=end)return ;
		int temp = arr[initial];
		arr[initial]=arr[end];
		arr[end]= temp;
		swap(arr, initial+1, end-1);
	}
}
