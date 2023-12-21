package Practice.Array;

public class OptimalPartition {
	public static void main(String[] args) {
		String s = "abacaba";
		int count = partitionString(s);
		System.out.println(count);
	}
	
	public static int partitionString(String s) {
        int count = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}
