package Strings;

public class IsSubsequence {
	public static void main(String[] args) {
		String s = "axc";
		String t = "baabahbgdc";
		boolean sol =isSubsequence(s, t);
		System.out.println(sol);
	}
	public static boolean isSubsequence(String s, String t) {
		int size = 0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(size)==s.charAt(i) && i!= size) {
				return false;
			}
		}
		if(s.indexOf(t)!=-1) {
			return true;
		}
        int count = 0;
        int currentIndex = 0;
        int previousIndex= 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++) {
            	if(s.charAt(i)==t.charAt(j)) {
            		count++;
            		currentIndex = j;
            	}
            }
            if(previousIndex>currentIndex) {
            	return false;
            }
            previousIndex = currentIndex;
            if(count == i) {
            	return false;
            }
        }
        return (count == s.length())? true : false;
    }
}
