package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;


public class plusMinusFraction {
	
	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/plusminus.txt");
		Scanner sc = new Scanner(stream);
		
		int N = sc.nextInt();
		int n;
		int positiveNumbers = 0;
		int negativeNumbers = 0;
		int zeroNumbers = 0;
		
		for (int i = 0; i < N; i++) {
			n = sc.nextInt();
			
			if (n > 0) {
				positiveNumbers++;
			}
			else if ( n < 0) {
				negativeNumbers++;
			}
			else {
				zeroNumbers++;
			}
		}
		
		double fraction = (double)positiveNumbers / N;
		System.out.println(new DecimalFormat("0.000").format(fraction));
		
		fraction = (double)negativeNumbers / N;
		System.out.println(new DecimalFormat("0.000").format(fraction));
		
		fraction = (double)zeroNumbers / N;
		System.out.println(new DecimalFormat("0.000").format(fraction));
		
		sc.close();
	}
}
