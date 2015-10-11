package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.util.Scanner;


public class libraryFine {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/libraryfine.txt");
		Scanner sc = new Scanner(stream);
		
		int finePerDay = 15;
		int finePerMonth = 500;
		int finePerYear = 10000;
		
		int actualReturnDay = sc.nextInt();
		int actualReturnMonth = sc.nextInt();
		int actualReturnYear = sc.nextInt();
		int expectedReturnDay = sc.nextInt();
		int expectedReturnMonth = sc.nextInt();
		int expectedReturnYear = sc.nextInt();
		
		int totalFine = 0;
		if (actualReturnYear > expectedReturnYear) {
			totalFine = (actualReturnYear - expectedReturnYear) * finePerYear;
		}
		else if (actualReturnYear == expectedReturnYear) {
			if (actualReturnMonth > expectedReturnMonth) {
				totalFine = (actualReturnMonth - expectedReturnMonth) * finePerMonth;
			}
			else if (actualReturnMonth == expectedReturnMonth) {
				if (actualReturnDay > expectedReturnDay) {
					totalFine = (actualReturnDay - expectedReturnDay) * finePerDay;
				}
			}
		}
		System.out.println(totalFine);
		
		sc.close();
	}
}
