package binarySearch;

import java.util.PriorityQueue;


public class MinimizaMaximumDistance {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 6;
		System.out.println(minimizaMax(arr, k));
		System.out.println(miniMaxOptimized(arr, k));
		System.out.println(miniMaxOptimal(arr, k));
	}

	public static double minimizaMax(int[] arr, int k) {
		int n = arr.length;
		int[] howMany = new int[n - 1];
		for (int i = 1; i <= k; i++) {
			long maxValue = -1;
			int maxIndex = -1;
			for (int j = 0; j < n - 1; j++) {
				long diff = (arr[j + 1] - arr[j]);
				long sectionLenght = diff / (howMany[j] + 1);
				if (sectionLenght > maxValue) {
					maxValue = sectionLenght;
					maxIndex = j;
				}
			}
			howMany[maxIndex]++;
		}
		double maxAns = -1;
		for (int i = 0; i < n - 1; i++) {
			double diff = (arr[i + 1] - arr[i]);
			double sectionLength = diff / (howMany[i] + 1);
			maxAns = Math.max(maxAns, sectionLength);
		}
		return maxAns;

	}

	public static double miniMaxOptimized(int[] arr, int k) {
		int n = arr.length;
		int[] howMany = new int[n - 1];
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
		
		for (int i = 0; i < n - 1; i++) {
            pq.add(new Pair(arr[i + 1] - arr[i], i));
        }

        // Pick and place k gas stations:
        for (int gasStations = 1; gasStations <= k; gasStations++) {
            // Find the maximum section
            // and insert the gas station:
            Pair tp = pq.poll();
            int secInd = tp.second;

            // insert the current gas station:
            howMany[secInd]++;

            double inidiff = arr[secInd + 1] - arr[secInd];
            double newSecLen = inidiff / (double) (howMany[secInd] + 1);
            pq.add(new Pair(newSecLen, secInd));
        }

        return pq.peek().first;
	}
	public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }
	
	
	
	public static double miniMaxOptimal(int[] arr, int k) {
		int n=arr.length;
		double low =0;
		double high =0;
		
		for(int i=0;i<n-1;i++) {
			high = Math.max(high, (double)(arr[i+1]-arr[i]));
		}
		
		double diff = 1e-6;
		while(high-low>diff) {
			double mid = (low+high)/(2.0);
			int cnt = numberofGasStationRequired(mid, arr);
			if(cnt > k) {
				low = mid;
			}else {
				high = mid;
			}
		}
		return high;
	}
	
	public static int numberofGasStationRequired(double dist, int[] arr) {
		int n = arr.length;
		int cnt =0;
		for(int i=1;i<n;i++) {
			int numberInBetween = (int)((arr[i]-arr[i-1])/dist);
			if((arr[i]-arr[i-1])==(dist*numberInBetween)) {
				numberInBetween--;
			}
			cnt+= numberInBetween;
		}
		return cnt;
	}
}
