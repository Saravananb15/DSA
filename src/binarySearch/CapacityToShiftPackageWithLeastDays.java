package binarySearch;

public class CapacityToShiftPackageWithLeastDays {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int days = 5;
		CapacityToShiftPackageWithLeastDays cap = new CapacityToShiftPackageWithLeastDays();
		System.out.println(cap.minimumCapacity(days, arr));
		
	}
	
	public int minimumCapacity(int days,int weights[]) {
		int low = Integer.MIN_VALUE;
		int high = 0;
		for(int i=0;i<weights.length;i++) {
			low = Math.max(low, weights[i]);
			high += weights[i];
		}
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(days(mid, weights)<= days) {
				high = mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}
	
	
	public int days(int current , int arr[]) {
		int days = 1;
		int load = 0;
		for(int i=0;i<arr.length;i++) {
			if(load+arr[i]> current) {
				days += 1;
				load =arr[i];
			}else {
				load += arr[i];
			}
		}
		return days;
	}
}
