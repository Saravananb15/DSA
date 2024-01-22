package Practice.Array.Hard;

public class RepeatingAndMissingOptimal1 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		RepeatingAndMissingOptimal1 repeating = new RepeatingAndMissingOptimal1();
		int sol[] = repeating.repeatingAndMissing(arr);
		for (int i = 0; i < sol.length; i++) {
			System.out.println(sol[i]);
		}
	}

	public int[] repeatingAndMissing(int[] arr) {
		int res[] = new int[2];
		int n = arr.length;
		int s1 = (n*(n+1)/2);
		int s1Count = 0;
		for(int i=0;i<n;i++) {
			s1Count+= arr[i];
		}
		// x-y = s1Count
		s1Count=s1Count-s1;
		
		// x2-y2 calculating
		int s2 = (n*((n+1)*(2*n+1))/n);
		int s2Count =0;
		for(int i=0;i<arr.length;i++) {
			s2Count+= arr[i]*arr[i];
		}
		s2Count= s2Count-s2;
		int xplusy = s2Count/s1Count;
		// x2-y2 is represented as (x+y)(x-y)
		// y gets cancelled 2x = s2Count+s1Count which will further 
		// returned as x = (s2Count+s1Count)/2
		int repeating = (xplusy+s1Count)/2;
		int missing = xplusy-repeating;
		res[0]= repeating;
		res[1]=missing;
		return res;
	}
}
