package com.maharshi.nextPermutation;

import java.util.Arrays;

public class Main {

	public static void nextPermutation(int[] nums) {
		// corner case: can nums be null or empty? No
		// base case: nums only has 1 value
		if (nums.length == 1) {
			return;
		}

		int prev = Integer.MIN_VALUE;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] < prev) {
				int j = nums.length - 1;
				for (; j > i; j--) {
					if (nums[j] > nums[i]) {
						break;
					}
				}

				swap(nums, i, j);
				reverse(nums, i + 1, nums.length - 1);
				System.out.println(Arrays.toString(nums));
				return;
			}

			prev = nums[i];
		}

		reverse(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void reverse(int[] arr, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			swap(arr, i, j);
		}
	}

	public static void main(String[] args) {
		nextPermutation(new int[] { 4, 2, 0, 2, 3, 2, 0 });
		nextPermutation(new int[] { 3, 2, 1 });
	}

}