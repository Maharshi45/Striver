package com.maharshi.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static int[][] merge(int[][] intervals) {
		if (intervals.length == 1) {
			return intervals;
		}
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		int i = 0;
		while (i < intervals.length - 1) {
			int a = intervals[i][0];
			int b = intervals[i][1];
			List<Integer> tempList = new ArrayList<Integer>();
			while (i < intervals.length - 1 && b >= intervals[i + 1][0]) {
				i++;
				b = Math.max(b, intervals[i][1]);
			}
			tempList.add(a);
			tempList.add(b);
			list.add(tempList);
			i++;
		}
		if (i < intervals.length) {
			List<Integer> list2 = new ArrayList<Integer>();
			list2.add(intervals[i][0]);
			list2.add(intervals[i][1]);
			list.add(list2);
		}

		int[][] result = new int[list.size()][2];

		for (int k = 0; k < list.size(); k++) {
			List<Integer> tempList = list.get(k);
			result[k][0] = tempList.get(0);
			result[k][1] = tempList.get(1);
		}

		return result;
	}

	public static void main(String[] args) {

		int[][] intervals = new int[][] { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 }, { 1, 10 } };

		int[][] result = merge(intervals);

		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}

	}

}
