package Sorting;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {4,6,2,5,7,9,1,3};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int Pivot = quickFn(arr,low,high);
			quickSort(arr, low, Pivot-1);
			quickSort(arr, Pivot+1, high);
			
		}
	}
	
	public static int quickFn(int arr[],int low,int high) {
		int i = low;
		int j = high;
		int pivot = arr[low];
		while(i<j) {
			while(arr[i]<=pivot && i<= high) {
				i++;
			}
			while(arr[j]>pivot && j>=low) {
				j--;
			}
			if(i<j) {
				swap(arr,i,j);
			}
		}
		swap(arr,low,j);
		return j;
		
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}
}
