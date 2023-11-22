package Practice.Array;

public class NextPermutation {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,1,0,0};
		NextPermutation next = new NextPermutation();
		next.nextPermutation(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}

	public void nextPermutation(int[] nums) {
		int n = nums.length;
		int index = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			swap(nums, 0, n - 1);
			return;
		}
		for (int i = n - 1; i > index; i--) {
			if (nums[i] > nums[index]) {
				int tmp = nums[i];
				nums[i] = nums[index];
				nums[index] = tmp;
				break;
			}
		}
		swap(nums, index + 1, n-1);
	}

	public void swap(int arr[], int i, int j) {
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
