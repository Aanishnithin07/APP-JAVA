package tutorial1;

import java.util.Scanner;

public class DivisibilityBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();

		if (number % 3 == 0) {
			System.out.println("The number is divisible by 3");
		} else {
			System.out.println("The number is not divisible by 3");
		}
		input.close();

	}

}
