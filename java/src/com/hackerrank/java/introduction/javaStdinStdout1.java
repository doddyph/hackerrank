package com.hackerrank.java.introduction;

import java.io.FileInputStream;
import java.util.Scanner;

public class javaStdinStdout1 {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/javastdinstdout1.txt");
		Scanner sc = new Scanner(stream);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}
}
