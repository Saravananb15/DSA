package leetcode;

public class SetDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4};
		SetDuplicates sd = new SetDuplicates();
		int sol[] = sd.setDupli(arr);
		for(int res : sol) {
			System.out.println(res);
		}
	}
	public int[] setDupli(int[] nums) {
		int x[] = new int[nums.length+1];
		for(int i : nums) {
			x[i]++;
		}
		int dup=0,miss=0;
		for(int i=1;i<x.length;i++) {
			if(x[i]>1) {
				dup=i;
			}else if(x[i]<1){
				miss=i;
			}
		}
		return new int[] {dup,miss};
	}
}
