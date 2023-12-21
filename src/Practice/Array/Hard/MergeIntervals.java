package Practice.Array.Hard;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
	public static void main(String[] args) {
		int[][] ans = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		MergeIntervals mer = new MergeIntervals();
		int[][] res = mer.merge(ans);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.println(res[i][j]);
			}
		}
	}

	public int[][] merge(int[][] intervals) {
		int n = intervals.length; // size of the array
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		int[][] ans = new int[n][intervals[0].length];
		int index = 0;
		for (int i = 0; i < n; i++) { // select an interval:
			int start = intervals[i][0];
			int end = intervals[i][1];

			// Skip all the merged intervals:
			if (index > 0 && end <= ans[index - 1][1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (intervals[j][0] <= end) {
					end = Math.max(end, intervals[j][1]);
				} else {
					break;
				}
			}
			ans[index][0] = start;
			ans[index][1] = end;
			index++;
		}
		ans = Arrays.copyOf(ans, index);
		return ans;
	}
	
//	public int[][] merge(int[][] intervals) {
//	if(intervals.length == 0) return intervals;
//	if(intervals.length == 1)return intervals;
//	int[][] ans = new int[intervals.length][intervals[0].length];
//	Arrays.sort(intervals, new Comparator<int[]>() {
//        public int compare(int[] a, int[] b) {
//            return a[0] - b[0];
//        }
//    });
//	int[] sol = new int[2];
//	int index =0;
//	for(int i=0;i<intervals.length-1;i++) {
//		int start = intervals[i][0];
//		int end = intervals[i][1];
//		int nextStart = intervals[i+1][0];
//		int nextEnd = intervals[i+1][1];
//		if(nextStart > sol[1] && sol[1] !=0) {
//			start = nextStart;
//			index++;
//		}
//		if(nextStart < start) {
//			sol[0] = nextStart;
//		}else {
//			sol[0]=start;
//		}
//		if(end > nextEnd) {
//			sol[1] = end;
//		}else {
//			sol[1]=nextEnd;
//		}
//		ans[index][0]=sol[0];
//		ans[index][1]=sol[1];
//	}
//	ans = Arrays.copyOf(ans, index+1);
//	return ans;
//	}
}
