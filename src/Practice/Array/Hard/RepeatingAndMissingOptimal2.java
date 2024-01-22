package Practice.Array.Hard;

public class RepeatingAndMissingOptimal2 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		RepeatingAndMissingOptimal2 repeating = new RepeatingAndMissingOptimal2();
		int sol[] = repeating.repeatingAndMissing(arr);
		for (int i = 0; i < sol.length; i++) {
			System.out.println(sol[i]);
		}
	}

	public int[] repeatingAndMissing(int[] arr) {
		int n = arr.length; // size of the array
        int xr = 0;

        //Step 1: Find XOR of all elements:
        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            xr = xr ^ (i + 1);
        }

        //Step 2: Find the differentiating bit number:
        int number = (xr & ~(xr - 1));

        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group:
            if ((arr[i] & number) != 0) {
                one = one ^ arr[i];
            }
            //part of 0 group:
            else {
                zero = zero ^ arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }

        // Last step: Identify the numbers:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == zero) cnt++;
        }

        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
	}
}
