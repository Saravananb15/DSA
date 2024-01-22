package Practice.Array.Hard;

public class RepeatingAndMissing {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		RepeatingAndMissing repeating = new RepeatingAndMissing();
		int sol[] = repeating.repeatingAndMissing(arr);
		for (int i = 0; i < sol.length; i++) {
			System.out.println(sol[i]);
		}
	}

	public int[] repeatingAndMissing(int[] arr) {
		int[] res = new int[2];
		int repeating = -1, missing = -1;
		int n = arr.length;
		int[] value = new int[n+1];
		for(int i=0;i<n;i++) {
			value[arr[i]]++;
		}
		for(int i=1;i<=n;i++) {
			if(value[i]==2) {
				repeating=i;
			}
			if(value[i]==0) {
				missing = i;
			}
		}
		res[0]=repeating;
		res[1]=missing;
		return res;
	}
}
