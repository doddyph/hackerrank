package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class solveMeSecond {
	
	static int doSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/solvemesecond.txt");
		Scanner sc = new Scanner(stream);
		
		int T = sc.nextInt();
		int a, b, sum;
		
		for (int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = doSum(a, b);
			System.out.println(sum);
		}
		
		sc.close();
	}
}
