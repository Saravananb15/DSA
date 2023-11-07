package Sorting;

public class QuickSortDesc {
	public static void main(String[] args) {
		int[] arr = {4,6,2,5,7,9,1,3};
		QuickSortDesc qsd = new QuickSortDesc();
		qsd.quickSortDesc(arr, 0, arr.length-1);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public void quickSortDesc(int arr[],int low,int high) {
		if(low < high) {
			int pivot = descFunction(arr,low,high);
			quickSortDesc(arr, low, pivot-1);
			quickSortDesc(arr, pivot+1, high);
		}
	}
	
	public int descFunction(int arr[],int low,int high) {
		int pivot = arr[low];
		int i=low;
		int j = high;
		while(i<j) {
			while(arr[i]>=pivot && i<=high ) {
				i++;
			}
			while(arr[j]<pivot && j>=low) {
				j--;
			}
			if(i<j) {
				swap(arr,i,j);
			}
		}
		swap(arr,low,j);
		return j;
		
	}
	
	public void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
