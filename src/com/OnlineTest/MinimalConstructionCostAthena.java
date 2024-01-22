package com.OnlineTest;

import java.util.Arrays;
import java.util.List;

//three product requried for construction is provided and given the cost of product which cost for exisiting 
// constructed neibour house find the minimal cost {{1,1,2}{2,2,3}{3,3,2}} 
// first product 1 , 2 ,3 in that 1 is minimal , second product 1,2,3 in that 1 is minimal
// third product 2,3,2 in that 2 is minimal so output is 1+1+2 = 4
public class MinimalConstructionCostAthena {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,1,2);
		List<Integer> list2 = Arrays.asList(2,2,3);
		List<Integer> list3 = Arrays.asList(3,3,2);
		List<List<Integer>> min = Arrays.asList(list1,list2,list3);
		MinimalConstructionCostAthena minimal = new MinimalConstructionCostAthena();
		System.out.println(minimal.minimalCost(min));
	}
	public int minimalCost(List<List<Integer>> cost) {
		int min[] = new int[cost.size()];
		for(int i=0;i<cost.size();i++) {
			for(int j=0;j<cost.get(i).size();j++) {
				int curr = cost.get(i).get(j);
				if(curr < min[j] || min[j]==0) {
					min[j]=cost.get(i).get(j);
				}
			}
		}
		int result = 0;
		for(int i=0;i<min.length;i++) {
			result += min[i];
		}
		return result;
	}
}
