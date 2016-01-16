package com.hackerrank.srin_aadc;

import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ThreeInOneDataStructure {

	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("res/3in1datastructure.txt");
		Scanner sc = new Scanner(inputStream);
		
		int N = Integer.parseInt(sc.nextLine());
		int n;
		
		Stack stack = new Stack(100000);
		Queue queue = new Queue(100000);
		MinPQ<Integer> minPQ = new MinPQ<Integer>();
		
		for (int i = 0; i < N; i++) {
			String[] nums = sc.nextLine().split(" ");
			
			if (nums.length == 2) {
				n = Integer.parseInt(nums[1]);
				stack.push(n);
				queue.enqueue(n);
				minPQ.insert(n);
			}
			else if (nums.length == 1) {
				if (nums[0].equals("2")) {
					try {
						stack.pop();
						queue.dequeue();
						minPQ.delMin();
					} catch (NoSuchElementException e) {
						System.out.println("impossible");
					}
				}
				else if (nums[0].equals("3")) {
					try {
						System.out.println(stack.peek()+" "+queue.peek()+" "+minPQ.min());
					} catch (NoSuchElementException e) {
						System.out.println("empty");
					}
				}
			}
		}
		
		sc.close();
	}
}
