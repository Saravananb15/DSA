package Practice.Array.Hard;

public class CountInversionBrute {
	public static void main(String[] args) {
		int[] arr = {5,3,2,4,1};
		CountInversionBrute inv = new  CountInversionBrute();
		int res  =inv.inversion(arr);
		System.out.println(res);
	}
	public int inversion(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
