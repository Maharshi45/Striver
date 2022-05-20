package com.maharshi.kadane;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, -1, 4, -10 };
		System.out.println(max(a));
	}

	private static int max(int[] a) {
		int maxsum = Integer.MIN_VALUE;
		int cur = 0;
		for (int i = 0; i < a.length; i++) {
			cur += a[i];
			if (cur > maxsum)
				maxsum = cur;
			if (cur < 0)
				cur = 0;
		}
		return maxsum;
	}
}
