package Strings;

public class ReverseAString {
	public static void main(String[] args) {
		String str = "The sky is blue";
		ReverseAString rev = new ReverseAString();
		String res = rev.reverse(str);
		System.out.println(res);
	}

	public String reverse(String s) {
		String[] res = s.trim().split("\\s+");
		int left = 0;
		int right = res.length-1;
		while (left <= right) {
			String temp = res[left];
			res[left] = res[right];
			res[right] = temp;
			left++;
			right--;
		}
		s = "";
		for(int i=0;i<res.length-1;i++) {
			s = s+res[i]+" ";
		}
		return s+res[res.length-1];
	}
}
