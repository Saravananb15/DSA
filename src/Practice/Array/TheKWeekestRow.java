package Practice.Array;

import java.util.Arrays;

public class TheKWeekestRow {
	public static void main(String[] args) {
		int[][] mat = {{1,1,0,0,0},
			 {1,1,1,1,0},
			 {1,0,0,0,0},
			 {1,1,0,0,0},
			 {1,1,1,1,1}};
		int[] arr = kWeakestRows(mat, 3);
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
	
	public static int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[k];
        int[][] temp = new int[mat.length][2];
        
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            temp[i][0] = count;
            temp[i][1] = i;
        }
        
        Arrays.sort(temp,(a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        for(int i=0;i<k;i++) {
        	arr[i]=temp[i][1];
        }
		return arr;
       
    }
}
