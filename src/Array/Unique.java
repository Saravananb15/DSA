package Array;

public class Unique {
	public static void main(String[] args) {
		int[] arr = {1,2,3,6,5,6};
		boolean unique = isUnique(arr);
		System.out.println(unique);
	}
	
	public static boolean isUnique(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
