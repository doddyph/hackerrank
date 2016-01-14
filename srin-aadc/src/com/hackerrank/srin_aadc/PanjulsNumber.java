package com.hackerrank.srin_aadc;

import java.io.FileInputStream;
import java.util.Scanner;

public class PanjulsNumber {
	
	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("res/panjulsnumber.txt");
		Scanner sc = new Scanner(inputStream);
		
		int T = sc.nextInt();
		int N, K, P;
		int[] bag, removers;
		//int[] bag = null;
		//int[] removers = null;
		int smallest;
				
		for (int i = 1; i < T+1; i++) {
			
			N = sc.nextInt();
			bag = new int[N];
			//System.out.print("bag: ");
			for (int j = 0; j < N; j++) {
				bag[j] = j+1;
				//System.out.print(bag[j]+" ");
			}
			//System.out.println();
			
			K = sc.nextInt();
			P = sc.nextInt();
			
			removers = new int[K];
			//System.out.print("removers: ");
			for (int j = 0; j < K; j++) {
				removers[j] = sc.nextInt();
				//System.out.print(removers[j]+" ");
			}
			//removers = BubbleSort(removers);
			//System.out.println();
			
			int[] cleanBag = cleanBag(bag, removers);
			//System.out.print("clean bag: ");
			for (int j = 0; j < cleanBag.length; j++) {
				//System.out.print(cleanBag[j]+" ");
			}
			//System.out.println();
			
			smallest = findSmallest(cleanBag, P);
			System.out.println(smallest);
		}
		
		sc.close();
	}
	
	/*private static int[] BubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
        return arr;
	}*/
	
	private static int[] cleanBag(int[] bag, int[] removers) {
		int temp;
		
		for (int i = 0; i < removers.length; i++) {
			for (int j = 0; j < bag.length; j++) {
				if (bag[j] == removers[i]) {
					
					for (int k = j+1; k < bag.length; k++) {
						temp = bag[k-1];
						bag[k-1] = bag[k];
						bag[k] = temp;
					}
					bag[bag.length-1] = -1;
					
				}
			}
		}
		
		return bag;
	}
	
	private static int findSmallest(int[] cleanBag, int P) {
		return cleanBag[P-1];
	}
}
