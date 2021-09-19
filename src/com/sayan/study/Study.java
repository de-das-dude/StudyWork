package com.sayan.study;

import java.util.Scanner;

public class Study {

	public static void main(String args[]) {
//		StringBuffer sBuf = new StringBuffer("sayan");
//		System.out.println(sBuf + " das");
//		StringBuilder sBul = new StringBuilder("Sayan");
//		System.out.println(sBuf.append(sBul));
		
		Parent parent = new Child("disco", "good");
		
		System.out.println(parent.a);
		
		Child child = (Child) parent;
		
		System.out.println(child.a);
		System.out.println(child.b);

		

	}

	/**
	 * print floyd's triangle
	 */
	public void printFloydTriangle() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows = inputScanner.nextInt();
		inputScanner.close();
		int no = 1;
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(no + " ");
				no++;
			}
			System.out.println();
		}
	}
}