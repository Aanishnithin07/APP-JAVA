package tutorial1;

import java.util.Scanner;

public class VotingVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Age of the preson: ");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}
		input.close();

	}

}
