package Array;

public class ArrayOfStrings {
	public static void main(String[] args) {
		String[] arr = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
		int res =words(arr);
		System.out.println(res);
	}
	public static int words(String[] arr) {
		int index =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1].indexOf(arr[i])!=0) {
				index++;
			}
		}
		return index;
	}
}
