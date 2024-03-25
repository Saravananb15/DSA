package JP;

import java.util.ArrayList;
import java.util.List;

public class Jp2OwnerOfHackerMall {
	public static void main(String[] args) {
		List<Integer> items1 = new ArrayList<>(List.of(5,4,10,10,6,3));
		Jp2OwnerOfHackerMall mall = new Jp2OwnerOfHackerMall();
        int operations1 = mall.getMinimumOperations(items1);
        System.out.println("Minimum operations for items1: " + operations1);
	}
	
	public int getMinimumOperations(List<Integer> arr) {
		int n = arr.size();
		int count = 0;
		for(int i=0;i<n-1;i++) {
			if(arr.get(i)%2 == arr.get(i+1)%2) {
				while(arr.get(i)%2 == arr.get(i+1)%2) {
					arr.set(i+1, arr.get(i+1)/2);
					count++;
				}
		}
		}
		return count;
		
	}
}
