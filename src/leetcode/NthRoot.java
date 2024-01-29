package leetcode;

public class NthRoot {
	public static void main(String[] args) {
		NthRoot nth = new NthRoot();
		System.out.println(nth.nthRoot(4, 69));
	}
	public int nthRoot(int n,int m) {
		int low=1,high=m;
		while(low<=high) {
			int mid = (low+high)/2;
			int temp =1;
			for(int i=0;i<n;i++) {
				temp *=mid;
			}
			if(temp==m) {
				return mid;
			}
			if(temp>m) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
}
