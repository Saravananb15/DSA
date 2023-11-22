package Practice.Array;

public class Permutation {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,1,2,3,4};
		boolean res = permutation(array1, array2);
		System.out.println(res);
	}
	
	public static boolean permutation(int[] array1, int[] array2){
        // TODO
        if(array1.length != array2.length){
            return false;
        }
//        int count = 1;
//        for(int i=0;i<array1.length;i++){
//            for(int j=i+1;j<array2.length;j++){
//                if(array1[i]==array2[j]){
//                    count++;
//                    break;
//                }
//            }
//        }
//        if(array1.length==count){
//            return true;
//        }
        
        int sum1 = 0;
        int sum2 =0;
        int mul1 = 1;
        int mul2 = 1;
        for(int i=0;i<array1.length;i++) {
        	sum1 += array1[i];
        	sum2 += array2[i];
        	mul1 *= array1[i];
        	mul2 *= array2[i];
        }
        if(sum1 == sum2 && mul1 == mul2) {
        	return true;
        }
        return false;
    }
}
