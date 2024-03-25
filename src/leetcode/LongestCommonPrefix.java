package leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
//		String strs[] = {"flower","flow","flight"};
		String strs[] = {"ab","a"};
		LongestCommonPrefix pre = new LongestCommonPrefix();
		System.out.println(pre.commonPrefix(strs));
	}
	public String commonPrefix(String[] strs) {
		if(strs[0].length()==0)return "";
		if(strs.length==1)return strs[0];
		boolean isCommon = false;
		int count =0;
		String str = "";
		for(int i=0;i<strs.length;i++) {
			char ch = strs[i].charAt(i);
			for(int j=0;j<strs.length;j++) {
				if(i!=j && strs[j].charAt(i)== ch) {
					isCommon = true;
				}else {
					isCommon = false;
				}
			}
			if(isCommon) {
				count++;
				
			}else {
				break;
			}
		}
		for(int index=0;index<count;index++) {
			str = str+strs[0].charAt(index);
		}
		return str;
	}
}
