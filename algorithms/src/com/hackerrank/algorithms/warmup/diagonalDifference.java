package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class diagonalDifference {
	
	static int difference(int a, int b) {
		return Math.abs((a - b));
	}
	
	static int sumOf(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/diagonaldifference.txt");
		Scanner sc = new Scanner(stream);
		
		int N = sc.nextInt();
		int[][] matrix = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int a = 0;
		for (int i = 0; i < N; i++) {
			a = sumOf(a, matrix[i][i]);
		}
		
		int b = 0;
		int j = 0;
		for (int i = N-1; i >= 0; i--) {
			j = N-1-i;
			b = sumOf(matrix[i][j], b);
		}
		
		int difference = difference(a, b);
		System.out.println(difference);
		sc.close();
	}
}
