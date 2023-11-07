package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] =  { 2,1,32,43,5,6,757,3,5,15,20};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr,arr.length);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}
	public void bubbleSort(int arr[], int size) {
		if(size == 1) return;
			for(int j=0;j<= size-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		bubbleSort(arr, size-1);
	}
}
