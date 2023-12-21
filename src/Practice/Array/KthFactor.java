package Practice.Array;

import java.util.Arrays;

public class KthFactor {
	public static void main(String[] args) {
		int n=7,k= 2;
		System.out.println(kthFactor(n, k));
	}
//	public static int factor(int n,int k) {
//		if(k<0){
//            return -1;
//        }
//        int[] arr = new int[n];
//        int index =0;
//        for(int i=1;i<=n;i++){
//            if(n%i == 0){
//                arr[index]=i;
//                index++;
//            }
//        }
//        int[] res = Arrays.copyOf(arr, index);
//        if(res.length < k){
//            return -1;
//        }else {
//        	return res[k-1];
//        }
//
//	}
	
	public static int kthFactor(int n, int k) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
				count++;
                if(count ==k){
                    return i;
                }
            }
        }
        return -1;
    }
}
