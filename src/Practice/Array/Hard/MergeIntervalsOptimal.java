package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalsOptimal {
	public static void main(String[] args) {
		int[][] ans = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
//		int[][] ans = {{1,4},{2,3}};
		MergeIntervalsOptimal mer = new MergeIntervalsOptimal();
		int[][] res = mer.merge(ans);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.println(res[i][j]);
			}
		}
		
//		mer.mergeOverlappingIntervals(ans);
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
		for(int i=0;i<intervals.length;i++) {
			if(index==0 || intervals[i][0]> ans[index-1][1]) {
				ans[index][0]=intervals[i][0];
				ans[index][1]=intervals[i][1];
				index++;
			}else {
				ans[index-1][1]=Math.max(intervals[i][1], ans[index-1][1]);
			}
		}
		ans = Arrays.copyOf(ans, index);
		return ans;
	}
	
	public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }

}
