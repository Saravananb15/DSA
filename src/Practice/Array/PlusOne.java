package Practice.Array;

public class PlusOne {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		PlusOne po = new PlusOne();
		int[] sol = po.plusO1ne(arr);
		for(int i : sol) {
			System.out.println(i);
		}
	}

	public int[] plusO1ne(int[] digits) {
		 for(int i= digits.length-1;i>=0;i--){
	           if(digits[i] < 9){
	               digits[i]++;
	               return digits;
	           }
	           digits[i] = 0;
	       }
	       digits = new int[digits.length+1];
	       digits[0]=1;
	       return digits;
	}
}
