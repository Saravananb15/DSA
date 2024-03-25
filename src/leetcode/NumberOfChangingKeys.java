package leetcode;

public class NumberOfChangingKeys {
	public static void main(String[] args) {
		String s ="aAbBcC";
		NumberOfChangingKeys key = new NumberOfChangingKeys();
		System.out.println(key.countKeyChanges(s));
		
	}
	public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length-1;i++) {
        	if(ch[i]!=ch[i+1]) {
        		count++;
        	}
        }
        return count;
        
    }
}
