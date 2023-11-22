package Practice.Array;

public class findANumberInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int target = 6;
		int res =searchInArray(arr, target);
		System.out.println("element found at index "+res);
	}
	public static int searchInArray(int[] intArray, int valueToSearch) {
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==valueToSearch){
                return i;
            }
        }
        throw new IllegalArgumentException("No target found");
    }

}

