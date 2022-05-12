package com.maharshi.rotateMatrix;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		rotate(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
	}

	public static void rotate(int[][] matrix) {
		String str = "";
		int[][] B = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				B[j][matrix.length - i - 1] = matrix[i][j];
			}
		}
		str += "[";
		for (int i = 0; i < B.length; i++) {
			str += Arrays.toString(B[i]);
			if (i != matrix.length - 1)
				str += ",";
		}
		str += "]";
		str = str.replace(" ", "");
		System.out.print(str);
	}

}
