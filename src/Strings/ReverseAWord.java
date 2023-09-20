package Strings;

public class ReverseAWord {
	public static void main(String[] args) {
		String str = "hello world";
		String res = Reverse(str);
		System.out.println(res);			
	}
	public static String Reverse(String str) {
		String[] res = str.trim().split("\\s+");
		String output = new String();
		for(int i=res.length-1;i>0;i--) {
			output = output + res[i]+" ";
		}
		
		return output+res[0];
		
	}
}
