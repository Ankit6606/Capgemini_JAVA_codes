
package AgeChecker;

import java.util.Scanner;

public class EligibilityChecker {
	public static void ageChecker(int age) {
		if(age >= 21) {
			System.out.println("Eligible to marry");
		}
		else {
			throw new InvalidAge("Are u mad?");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		ageChecker(age);
	}
}
 