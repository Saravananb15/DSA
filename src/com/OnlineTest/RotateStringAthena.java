package com.OnlineTest;

// given a string and left and right rotate 
// left = 1 "abcd" expected ="bcda"
// right = 2 "abcde" expected = "deabc"
public class RotateStringAthena {
	public static void main(String[] args) {
		int left =2;
		int right = 4;
		String str = "abcd";
		RotateStringAthena rotate = new  RotateStringAthena();
		System.out.println(rotate.rotate(str, left, right));
	}
	public String rotate(String s, int leftrotate,int rightrotate) {
		if(rightrotate > leftrotate) {
			rightrotate = rightrotate-leftrotate;
			leftrotate=0;
		}else {
			leftrotate=leftrotate-rightrotate;
			rightrotate=0;
		}
		char[] ch = s.toCharArray();
		if(leftrotate!=0) {
			int size = s.length();
			leftrotate = leftrotate%size;
	        swap(ch, 0,size-leftrotate-1);
	        swap(ch,size-leftrotate,size-1);
	        swap(ch,0,size-1);
		}else {
			int size = s.length();
			rightrotate = rightrotate%size;
	        swap(ch, size-rightrotate,size-1);
	        swap(ch,0,size-rightrotate-1);
	        swap(ch,0,size-1);
		}
		String res = "";
		for(int i=0;i<ch.length;i++) {
			res += ch[i];
		}
		return res;
	}
		
	public void swap(char[] ch,int left,int right) {
		while(left<=right) {
			char temp = ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	}
	
	
}
