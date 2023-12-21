package Strings;

public class Regex {
	public static void main(String[] args) {
		String[] str = {"code","coders"};
		String[] str2 = {"co*d","co*ers"};
		Regex reg = new Regex();
		boolean[][] res = reg.regex(str, str2);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.println(res[i][j]);
			}
		}
		
	}
	public boolean[][] regex(String[] inputs, String[] regex) {
		boolean[][] result = new boolean[inputs.length][regex.length];
		for(int i=0;i<inputs.length;i++) {
			for(int j=0;j<regex.length;j++) {
				result[i][j] = inputs[i].endsWith(regex[j]) && inputs[i].startsWith(regex[j]);					
			}
		}
		return result;
	}
	
	
}
