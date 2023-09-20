package Array;

public class RotateImage {
	public static void main(String[] args) {
			int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
			int[][] res = rotate(arr);
			for(int i=0;i<res.length;i++) {
				for(int j=0;j<res.length;j++) {
					System.out.print(res[i][j]+" ");
				}
				System.out.println(" ");
			}
	}
	
	public static int[][] rotate(int[][] matrix){
		int length = matrix.length;
		for(int index=0;index<length/2;index++) {
			int lastIndex = length-1-index;
			for(int i=index;i<lastIndex;i++) {
				int offset = i-index;
				int temp = matrix[index][i];
				matrix[index][i]= matrix[lastIndex-offset][index];
				matrix[lastIndex-offset][index]= matrix[lastIndex][lastIndex-offset];
				matrix[lastIndex][lastIndex-offset]= matrix[i][lastIndex];
				matrix[i][lastIndex]= temp;
				}
		}
		return matrix;
	}
}
