package Practice.Array;

public class SumAndProduct {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] ans = sumAndProduct(arr);
		for(int i: ans) {
			System.out.println(i);
		}
	}
	
	public static int[] sumAndProduct(int[] num) {
		int[] res= new int[2]; 
		int sum = 0;
		int product = 1;
		for(int i=0;i<num.length;i++) {
			sum += num[i];
			product *= num[i];
		}
		res[0]= sum;
		res[1]=product;
		return res;
		
	}
}
