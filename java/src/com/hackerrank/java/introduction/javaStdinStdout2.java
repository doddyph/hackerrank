package com.hackerrank.java.introduction;

import java.io.FileInputStream;
import java.util.Scanner;

public class javaStdinStdout2 {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/javastdinstdout2.txt");
		Scanner sc = new Scanner(stream);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		String s = sc.nextLine();
		s += sc.nextLine();
		
		System.out.println("String: "+s);
		System.out.println("Double: "+y);
		System.out.println("int: "+x);
		
		sc.close();
	}
}
