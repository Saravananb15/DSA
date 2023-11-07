package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 3,4,1,2,3};
		InsertionSort is = new InsertionSort();
		is.insertion(arr,arr.length);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public void insertion(int arr[],int size) {
			if(size == 1) return;
			for(int j=0;j<=size-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			insertion(arr, size-1);
		}
}
