package com.maharshi.nextPermutation;

import java.util.Arrays;

public class Main {

	public static void nextPermutation(int[] nums) {
		int mark = -1;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				mark = i - 1;
				break;
			}
		}

		if (mark == -1) {
			reverse(nums, 0, nums.length - 1);
			System.out.println(Arrays.toString(nums));
			return;
		}

		for (int i = nums.length - 1; i >= mark + 1; i--) {
			if (nums[i] > nums[mark]) {
				swap(nums, mark, i);
				break;
			}
		}

		reverse(nums, mark + 1, nums.length - 1);

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
	}

}