package binarySearch;

public class Sqrt {
	public static void main(String[] args) {
		Sqrt sqrt = new Sqrt();
		System.out.println(sqrt.mySqrt(0));
	}

	public int mySqrt(int x) {
		if(x<0)return -1;
		int low =1,high=x,res=0;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(mid<x/mid) {
				res=mid;
				low=mid+1;
			}else {
				high =mid-1;
			}
		}
		return res;
	}
}

