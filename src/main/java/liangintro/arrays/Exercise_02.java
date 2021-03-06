package liangintro.arrays;

import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that reads ten integers and
displays them in the reverse of the order in which they were read.
 */
public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int tempNumber;
		
		System.out.println("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + numbers[i]);
		}
		
		for (int i = 0; i < (numbers.length/2); i++) {
			tempNumber = numbers[i];
			numbers[i] = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] = tempNumber;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + numbers[i]);
		}
		
	}
}
