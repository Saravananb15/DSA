package LinearSearch;

//qn arr =[18,12,9,14,77,50]
// find 14 is found in the array or not

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 18, 12, 9, 14, 77, 50 };
		int i = linearSearch(arr, 14);
		System.out.println(i);
	}

	static int linearSearch(int arr[], int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int i : arr) {
			if (i == target) {
				return i;
			}
		}
		return -1;
	}
}
