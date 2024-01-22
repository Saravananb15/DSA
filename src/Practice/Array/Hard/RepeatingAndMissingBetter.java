package Practice.Array.Hard;

public class RepeatingAndMissingBetter {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		RepeatingAndMissingBetter repeating = new RepeatingAndMissingBetter();
		int sol[] = repeating.repeatingAndMissing(arr);
		for (int i = 0; i < sol.length; i++) {
			System.out.println(sol[i]);
		}
	}

	public int[] repeatingAndMissing(int[] arr) {
		int[] res = new int[2];
		int n = arr.length;
		int repeating = 0, missing = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}
			}
			if (count == 2 && count == 0) {
				break;
			}
			if (count == 2) {
				repeating = i;
			}
			if (count == 0) {
				missing = i;
			}
			res[0] = missing;
			res[1] = repeating;

		}
		return res;
	}
}
