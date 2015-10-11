package com.hackerrank.java.introduction;

import java.io.FileInputStream;
import java.util.Scanner;

public class javaOutputFormatting {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/javaoutputformatting.txt");
		Scanner sc = new Scanner(stream);
		
		System.out.println("================================");
		String s1;
		int x;
		for (int i = 0; i < 3; i++) {
			s1 = sc.next();
			x = sc.nextInt();
			System.out.printf("%-15s%03d", new Object[]{s1, new Integer(x)});
			System.out.println();
		}
		System.out.println("================================");
		
		sc.close();
	}
}
