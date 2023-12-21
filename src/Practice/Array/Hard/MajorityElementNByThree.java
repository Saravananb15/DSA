package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNByThree {
	public static void main(String[] args) {
		int num[] = {3,2,3};
		MajorityElementNByThree maj = new  MajorityElementNByThree();
		List<Integer> list = maj.majorityOptimal(num);
		for(int i : list) {
			System.out.println(i);
		}
	}
	public List<Integer> majority(int nums[]){
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int min = (nums.length/3)+1;
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			if(map.get(nums[i])==min) {
				list.add(nums[i]);
			}
			if(list.size()==2) break;
		}
		return list;
	}
	public List<Integer> majorityOptimal(int nums[]){
		List<Integer> list = new ArrayList<>();
		int n = nums.length;
		int min = (n/3)+1;
		int cnt1=0,cnt2=0;
		int el1 =Integer.MAX_VALUE,el2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(cnt1==0 && nums[i]!=el2) {
				cnt1++;
				el1=nums[i];
			}else if(cnt2==0 && nums[i]!=el1) {
				cnt2++;
				el2=nums[i];
			}else if(nums[i] == el1) {cnt1++;}
			else if(nums[i] == el2) {cnt2++;}
			else {cnt1--;cnt2--;}
		}
		cnt1=0;cnt2=0;
		for(int i=0;i<n;i++) {
			if(el1==nums[i])cnt1++;
			if(el2==nums[i])cnt2++;
		}
		if(cnt1>=min)list.add(el1);
		if(cnt2>=min)list.add(el2);
		Collections.sort(list);
		return list;
	}
}
