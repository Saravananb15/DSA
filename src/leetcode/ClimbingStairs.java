package leetcode;

public class ClimbingStairs {
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		System.out.println(cs.climbingStairs(5));
	}
	public int climbingStairs(int n) {
		if(n<=2)return n;
		int prev1=1,prev2=2,current=0; 
		for(int i=1;i<n-1;i++) {
			current = prev1+prev2;
			prev1=prev2;
			prev2=current;
		}
		return current;
	}
}
