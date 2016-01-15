package com.hackerrank.srin_aadc;

import java.io.FileInputStream;
import java.util.Scanner;

public class PanjulsNumbers {
	
	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("res/panjulsnumbers.txt");
		Scanner sc = new Scanner(inputStream);
		
		int T = sc.nextInt();
		int N, K, P;
		int[] removers;
		int smallest = -1;
		String[] bag = null;
				
		for (int i = 1; i < T+1; i++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			P = sc.nextInt();
			
			if (K > 0) {
				removers = new int[K];
				for (int j = 0; j < K; j++) {
					removers[j] = sc.nextInt();
				}
				
				quicksort(removers, 0, removers.length-1);
				bag = cleanBag(N, removers, P);
			}
			else {
				bag = bag(N, P);
			}
			
			smallest = findSmallest(bag, P);
			System.out.println(smallest);
		}
		
		sc.close();
	}
	
	private static void quicksort(int[] numbers, int low, int high) {
		int i = low, j = high;
	    int pivot = numbers[low + (high-low)/2];

	    while (i <= j) {
	      while (numbers[i] < pivot) {
	        i++;
	      }
	      while (numbers[j] > pivot) {
	        j--;
	      }

	      if (i <= j) {
	        exchange(numbers, i, j);
	        i++;
	        j--;
	      }
	    }
	    
	    if (low < j)
	      quicksort(numbers, low, j);
	    if (i < high)
	      quicksort(numbers, i, high);
	}
	
	private static void exchange(int[] numbers, int i, int j) {
		int temp = numbers[i];
	    numbers[i] = numbers[j];
	    numbers[j] = temp;
	}
	
	private static String[] cleanBag(int N, int[] removers, int P) {
		int n = 0;
		int k = 0;
		int jj = 1;
		StringBuilder bagBuilder = new StringBuilder();
		
		for (int j = jj; j < N+1; j++) {
			if (j != removers[k]) {
				if (n < P) {
					bagBuilder.append(j).append(',');
					n++;
				}
				else {
					break;
				}
			}
			else {
				jj = j+1;
				if (k < removers.length-1) {
					k++;
				}
			}
		}
		
		String[] bag = bagBuilder.toString().split(",");
		return bag;
	}
	
	private static String[] bag(int N, int P) {
		int n = 0;
		int jj = 1;
		StringBuilder bagBuilder = new StringBuilder();
		
		for (int j = jj; j < N+1; j++) {
			if (n < P) {
				bagBuilder.append(j).append(',');
				n++;
			}
			else {
				break;
			}
		}
		
		String[] bag = bagBuilder.toString().split(",");
		return bag;
	}
	
	private static int findSmallest(String[] bag, int P) {
		int smallest = -1;
		
		if (P > 0 && P-1 < bag.length) {
			smallest = Integer.parseInt(bag[P-1]);
		}
		return smallest;
	}
}
