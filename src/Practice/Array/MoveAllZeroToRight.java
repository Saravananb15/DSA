package Practice.Array;

public class MoveAllZeroToRight {
	public static void main(String[] args) {
		int arr[] = {1,0,2,3,2,0,0,4,5,1};
		MoveAllZeroToRight move = new MoveAllZeroToRight();
		move.moveZeroToEnd(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
	
//	public void moveZeroToEnd(int arr[]) {
//		for(int j=0;j<arr.length;j++) {
//			if(arr[j] == 0) {
//				for(int i=j+1;i<arr.length;i++) {
//					if(arr[i]!=0) {
//						swap(arr,i,j);
//					}
//				}
//			}
//		}
//	}
	
	public void moveZeroToEnd(int nums[]) {
//		for(int j=0;j<nums.length;j++) {
//			if(nums[j]!=0) {continue;};
//			for(int i=j+1;i<nums.length;i++) {
//				if(nums[i]!=0) {
//					swap(nums, i, j);
//					break;
//				}
//			}
//		}
		
		int j =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
            break;
            }
        }   
        if(j == -1) return;


        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,j,i);
                j++;
            }
        } 
	}
	
	public void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
