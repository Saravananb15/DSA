package binarySearch;

public class AllocateBooks {
	public static void main(String[] args) {
//		int arr[] = {25,46,28,49,24};
		int arr[] = {10,20,30,40};
		AllocateBooks allocate = new AllocateBooks();
//		System.out.println(allocate.allocateBooks(arr, 4));
		System.out.println(allocate.optimalApproach(arr, 2));
	}
	
	public int allocateBooks(int[] arr, int students) {
		if(students > arr.length)return -1;
		int high =0;
		int low =0;
		for(int i=0;i<arr.length;i++) {
			low = Math.max(low, arr[i]);
			high += arr[i];
		}
		for(int pages = low; pages <=high;pages++) {
			if(calStudent(arr, pages) == students) {
				return pages;
			}
		}
		
		return low;
	}
	
	public int calStudent(int[] arr , int curr) {
		int count=1;
		long pagesStudents=0;
		for(int i=0;i<arr.length;i++) {
			if(pagesStudents+arr[i] <= curr) {
				pagesStudents+= arr[i];
			}else {
				count++;
				pagesStudents=arr[i];
			}
		}
		return count;
	}
	
	
	public int optimalApproach(int[] books,int students) {
		if(students > books.length)return -1;
		int high =0;
		int low =0;
		for(int i=0;i<books.length;i++) {
			low = Math.max(low, books[i]);
			high += books[i];
		}
		while(low<=high) {
			int mid = (low+high)/2;
			if(calStudent(books, mid) > students) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return low;
	}
}
