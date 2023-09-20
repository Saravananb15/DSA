package Array;

public class FindIndex {
public static void main(String[] args) {
	int[] arr = {1};
	int target = 1;
	FindIndex fi = new FindIndex();
	int res = fi.searchInsert(arr, target);
	System.out.println(res);
}

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        
       while(start <= end){
        int mid = (start+end)/2;
        if(nums[mid]== target){
            return mid;
        }
        if(nums[mid]> target){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
        }
        
        return -1;
    }
}
