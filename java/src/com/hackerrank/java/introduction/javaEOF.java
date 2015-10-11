package com.hackerrank.java.introduction;

import java.io.FileInputStream;
import java.util.Scanner;

public class javaEOF {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/javaeof.txt");
		Scanner sc = new Scanner(stream);
		
		int i = 0;
		while (sc.hasNext()) {
			i++;
			System.out.println(i + " " + sc.nextLine());
		}
		
		sc.close();
	}
}
