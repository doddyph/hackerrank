package com.hackerrank.java.introduction;

import java.io.FileInputStream;
import java.util.Scanner;

public class javaLoops {
	
	static int sumOf(int b, int i) {
		int sum = 0;
		double power = 0;
		for (int j = 0; j <= i; j++) {
			power = Math.pow(2.0, (double)j);
			sum += power * b;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/javaloops.txt");
		Scanner sc = new Scanner(stream);
		
		int T = sc.nextInt();
		int a, b, n;
		int sum = 0;
		
		for (int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			
			for (int j = 0; j < n; j++) {
				sum = a + sumOf(b, j);
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
