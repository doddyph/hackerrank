package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class veryBigSum {
	
	static long doSum(long a, long b) {
		return a + b;
	}

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/verybigsum.txt");
		Scanner sc = new Scanner(stream);
		
		long N = sc.nextInt();
		long n;
		long sum = 0;
		
		for (int i = 0; i < N; i++) {
			n = sc.nextInt();
			sum = doSum(n, sum);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
