package Array;

public class Middle {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Middle mi = new Middle();
		int[] result = mi.middle(arr);
		System.out.print("The elements in middle is : ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

	public static int[] middle(int[] array) {
		int[] arr = new int[array.length - 2];
		for (int i = 1; i < array.length - 1; i++) {
			arr[i - 1] = array[i];
		}
		return arr;
	}
}
