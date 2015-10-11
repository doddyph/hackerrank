package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.Scanner;



public class extraLongFactorials {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/factorials.txt");
		Scanner sc = new Scanner(stream);
		
		int N = sc.nextInt();
		BigInteger factorial = BigInteger.valueOf(N);
		
		for (int i = 1; i < N; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(N-i));
		}
		System.out.println(factorial);
		
		sc.close();
	}
}
