package Array;

import java.util.ArrayList;
import java.util.List;

public class countSymmetric {
	public static void main(String[] args) {
		countSymmetric cs = new countSymmetric();
		int res = cs.countSymmetricIntegers(100, 1782);
		System.out.println(res);
	}
	
	public int countSymmetricIntegers(int low, int high) {
		int count = 0;
		for (int i = low; i <= high; i++) {
			if (helper(i)) {
				count++;
			}
		}
		return count;
	}
    public boolean helper(int num){
    	
        List<Integer> list = new ArrayList<>();
        int store = num;
        int temp =0;
        int count=0;
        while(store>0) {
        	temp = store % 10;
        	store /= 10;
        	list.add(temp);
        	count++;
        }
        if(count%2!=0) {
    		return false;
    	}
        int left =0;
        int right = 0;
        int startindex = list.size()-1;
        int i =0;
        while(startindex >= list.size()/2) {
        	right += list.get(startindex);
        	left += list.get(i);
        	i++;
        	startindex--;
        }
        return (left==right);
    }
}
