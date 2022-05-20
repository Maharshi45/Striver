package com.maharshi.mergeSortedArray;

import java.util.Arrays;

public class Main {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 || j >= 0) {
			if (i < 0) {
				nums1[k--] = nums2[j--];
				continue;
			}
			if (j < 0) {
//				nums1[k--] = nums1[i--];
				k--;
				i--;
				continue;
			}
			if (nums1[i] >= nums2[j])
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
		System.out.print(Arrays.toString(nums1));

	}

	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };

		merge(nums1, 3, nums2, 3);

	}

}
