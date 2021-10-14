package com.algorithmprograms;

import java.util.Scanner;

public class InsertionSort {

	// insertion sort
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	// print array
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] userInput() {
		// take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int n = scan.nextInt();
		int array[] = new int[n];
		System.out.println();
		System.out.println("Enter value for " + n + " numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt(); // taking input from user
		}
		return array;

	}

	public static void main(String args[]) {
		int array[] = userInput();
		InsertionSort ob = new InsertionSort();
		ob.sort(array);
		printArray(array);

	}

}