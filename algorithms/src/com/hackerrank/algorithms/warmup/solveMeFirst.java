package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class solveMeFirst {
	
	static int doSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/solvemefirst.txt");
		Scanner sc = new Scanner(stream);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = doSum(a, b);
		System.out.println(sum);
		sc.close();
	}
}
