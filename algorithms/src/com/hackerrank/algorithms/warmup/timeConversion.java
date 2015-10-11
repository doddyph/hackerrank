package com.hackerrank.algorithms.warmup;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class timeConversion {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("res/timeconversion.txt");
		Scanner sc = new Scanner(stream);
		
		String strDate = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaaa");
		Date date = dateFormat.parse(strDate);
		dateFormat = new SimpleDateFormat("HH:mm:ss");
		strDate = dateFormat.format(date);
		System.out.println(strDate);
		
		sc.close();
	}
}
