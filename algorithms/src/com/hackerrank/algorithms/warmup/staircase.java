package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class staircase {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/staircase.txt");
		Scanner sc = new Scanner(stream);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j >= N-1-i) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
