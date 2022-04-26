package com.maharshi.setMatrixZeroes;

import java.util.Arrays;

public class Main {

	public static void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			System.out.println("[]");
			return;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		char[][] charArr = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0)
					convert(i, j, matrix, charArr);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (charArr[i][j] == 'x') {
					matrix[i][j] = 0;
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < m; i++) {
			System.out.print(Arrays.toString(matrix[i]));
			if (i != m - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public static void convert(int i, int j, int[][] matrix, char[][] charArr) {
		int m = matrix.length;
		int n = matrix[0].length;
		for (int k = 0; k < n; k++) {
			if (matrix[i][k] != 0) {
				charArr[i][k] = 'x';
			}
		}
		for (int l = 0; l < m; l++) {
			if (matrix[l][j] != 0) {
				charArr[l][j] = 'x';
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		setZeroes(matrix);
	}

}