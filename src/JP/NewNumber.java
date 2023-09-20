package JP;

public class NewNumber {
public static void main(String[] args) {
	String str = "ac";
	int res = newNumber(str);
	System.out.println(res);
}

public static int newNumber(String str) {
	int val = 0;
	for(int i=0;i<str.length();i++) {
		if(i==0) {
			int ch = str.charAt(i)-96;
			val = val+ ch;
		}else {
			val = val+1;
			int ch = str.charAt(i)-96;
			val = val*10+ch;
			
		}
		
	}
	return val;
	
}
}
