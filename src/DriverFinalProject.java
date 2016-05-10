import java.util.ArrayList;

import java.util.Scanner;

public class DriverFinalProject {
	public static void main(String[] args) {

		int menuChoice;

		Scanner input = new Scanner(System.in);
		

		System.out.println("What would you like to do?");
		System.out.println("1 - Create Course");
		System.out.println("2 - Create Teacher");
		System.out.println("3 - Create Student");
		System.out.println(" ");
		System.out.println("4 - Add Student to Course");
		System.out.println("5 - Drop Student from Course");
		System.out.println("6 - List Course Details");
		System.out.println("7 - List Teacher Details");
		System.out.println("8 - List Student Details");

		input.close();
		menuChoice = input.nextInt();
		
		if (menuChoice == 1) {


		switch (input.nextInt()) {
		case 1:
			System.out.println("What would you like to name this course?");
			break;
		case 2:
			System.out.println("What is the name of this teacher?");
			break;
		case 3:
			System.out.println("What is the name of this student?");
			break;
		case 4:
			System.out.println("What course would you like to add a student to?");
			System.out.println("What is the name of the student you would like to add to " + Course.name);
			break;
		case 5:
			System.out.println("What course would you like to remove a student from?");
			System.out.println("What is the name of the student you would like to remove from " + Course.name + "?");
			break;
		case 6:
			System.out.println("What course would you like to list the details of?");
			break;
		case 7:
			System.out.println("What teacher would you like to list the details of?");
			break;
		case 8:
			System.out.println("What student would you like to list the details of?");
			break;
		}
		}
		}

	private static void addCourse() {
		// TODO Auto-generated method stub

	}
}
