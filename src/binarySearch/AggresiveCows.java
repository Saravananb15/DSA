package binarySearch;

import java.util.Arrays;

public class AggresiveCows {
	public static void main(String[] args) {
		int arr[] = {0, 3, 4, 7, 10, 9};
		AggresiveCows agcow = new AggresiveCows();
		System.out.println(agcow.aggresiveCows(arr, 4));
	}
	
	public int aggresiveCows(int[] stalls, int cows) {
		Arrays.sort(stalls);
			int low =1;
			int high = stalls[stalls.length-1]-stalls[0];
			while(low<=high) {
				int mid = (low+high)/2;
				if(canWePlace(stalls, mid, cows)== true) {
					low=mid+1;
				}else {
					high = mid-1;
				}
			}
		
		return high;
	}
	
	public boolean canWePlace(int arr[],int mid, int cows) {
		int last = arr[0];
		int count =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-last >= mid) {
				count++;
				last = arr[i];
			}
			
			if(count>=cows)return true;
		}
		
		return false;
	}
}
