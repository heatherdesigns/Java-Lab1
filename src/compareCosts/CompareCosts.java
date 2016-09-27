/*
 * Heather Taylor
 * CIS 2212 Tuesdays Fall 2016
 * Lab 01 - Compare Costs
 * Due August 30, 2016
 */

// Create a program that compares the costs of two different packages of food to determine which package is the best value.

package compareCosts;

import java.util.Scanner; // import class

public class CompareCosts {

	public static void main(String[] args) {
		
		// declare variables
		double weightItem1;
		double priceItem1;
		double weightItem2;
		double priceItem2;
		double valueItem1;
		double valueItem2;
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the weight for item 1
		System.out.print("Enter the weight for item 1: ");
		weightItem1 = input.nextDouble();
		
		// Prompt the user to enter the price for item 1
		System.out.print("Enter the price for item 1: ");
		priceItem1 = input.nextDouble();
		
		// Prompt the user to enter the weight for item 2
		System.out.print("\nEnter the weight for item 2: ");
		weightItem2 = input.nextDouble();
		
		// Prompt the user to enter the price for item 2
		System.out.print("Enter the price for item 2: ");
		priceItem2 = input.nextDouble();
		
		// Calculate and display the value of item 1
		valueItem1 = priceItem1 / weightItem1;
		System.out.print("\nItem 1 price per weight: " + valueItem1);
		
		// Calculate and display the value of item 2
		valueItem2 = priceItem2 / weightItem2;
		System.out.print("\nItem 2 price per weight: " + valueItem2);
		
		// Compare items and display the results
		if (valueItem1 < valueItem2) {
			System.out.println("\n\nItem 1 is a better value.");
		}
		else if (valueItem2 < valueItem1) {
			System.out.println("\n\nItem 2 is a better value.");
		}
		else if (valueItem1 == valueItem2) {
			System.out.println("\n\nItem 1 and Item 2 have the same value."); // I added a third case scenario. 
		}
		else {
			System.out.println("\n\nError: Something has gone wrong."); // Exit plan to prevent system from crashing
		} // end if else statements
		
		input.close(); // close the scanner
		
	} // end main

} // end class
