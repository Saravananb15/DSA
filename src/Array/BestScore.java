package Array;

public class BestScore {
	public static void main(String[] args) {

		int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		int arr[] = findTopTwoScores(myArray);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] findTopTwoScores(int[] array) {
//		int firstHigh = Integer.MIN_VALUE;
//		int secondHigh = Integer.MIN_VALUE;
//		
//		for(int value : array) {
//			if(value > firstHigh) {
//				secondHigh = firstHigh;
//				firstHigh = value;
//			}else if(value > secondHigh && value < firstHigh) {
//				secondHigh = value;
//			}
//		}
//		return new int[] {firstHigh,secondHigh};
		
		int value = 0;
		int value2 = 0;
		int result[] = new int[2];
		
			for (int i = 0; i < array.length; i++) {
				if(value <  array[i] ) {
						value2 = value;
						value = array[i];
				}else if(value>value2 && value2<array[i]) {
					value2=array[i];
			}
			result[0] = value;
			result[1] = value2;
		}
		return result;
	  }
	}
		