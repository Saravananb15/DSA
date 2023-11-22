package Practice.Array;

public class MaximunConsective {
	public static void main(String[] args) {
		int arr[] = {1,0};
//		int count = 0;
//		int max = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==1) {
//				count+=1;
//				if(count > max) {
//					max = count;
//				}
//			}else {
//				count = 0;
//			}
//		}
//		System.out.println(max);
		
		MaximunConsective max = new MaximunConsective();
		int res = max.findMaxConsecutiveOnes(arr);
		System.out.println(res);
	}
	
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int len =0;
        int maxLen = 0;
		if(nums.length ==1 && nums[0]==0) return 0;
		else if(nums.length == 1 && nums[0]!=0){
			maxLen++;
		}
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && nums[i]>0){
                len++;
            }
            if(len > maxLen) {
            	maxLen = len;
            	len =1;
            }
        }
        return maxLen;
    }
}
