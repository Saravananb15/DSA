package Practice.Array;

import java.util.LinkedList;
import java.util.List;

public class TwoSum2 {
	public static void main(String[] args) {
//		int[] num = {0,0,11,15};
//		int target = 0;
//		int[] sol = twoSum(num, target);
//		for(int i:sol) {
//			System.out.println(i);
//		}
		
		int[] numbers = {2,5,6,7,8,0,1};
		List<Integer> li = insert(numbers);
		for(int i : li) {
			System.out.println(i);
		}
	}
	 public static int[] twoSum(int[] numbers, int target) {
		 int low = 0 , high = numbers.length-1;

         while (low < high)
         {
             int complement = numbers[low] + numbers[high];
             if (complement == target)
             {
                 return new int[]{low+1 , high+1};
             }else if (complement > target){
                 high--;
             }else {
                 low++;
             }
         }
         
     return new int[] {-1 , -1};
	    }
	 
	 
	 public static List<Integer> insert(int[] numbers) {
		 List<Integer> list = new LinkedList<>();
		 list.add(0);
		 for(int i=0;i<numbers.length;i++) {
			 int index = list.size();
			 while(index <= 0) {
				 if(list.get(index)<numbers[i]) {
					 list.add(i, numbers[i]);
					 index--;
				 }
			 }
				 
		 }
		 return list;
	 }
}
