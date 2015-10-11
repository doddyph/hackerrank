package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class simpleArraySum {
	
	static int doSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/simplearraysum.txt");
		Scanner sc = new Scanner(stream);
		
		int N = sc.nextInt();
		int n;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			n = sc.nextInt();
			sum = doSum(n, sum);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
