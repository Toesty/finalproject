
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

		if (input.nextInt() == 1) {
			System.out.println("What would you like to name this course?");
			}
		if (input.nextInt() == 2) {
			System.out.println("What is the name of this teacher?");
		}
		if (input.nextInt() == 3) {
			System.out.println("What is the name of this student?");
		}
		if (input.nextInt() == 4) {
			System.out.println("What course would you like to add a student to?");
			System.out.println("What is the name of the student you would like to add to " + Course.name);
		}
		if (input.nextInt() == 5) {
			System.out.println("What course would you like to add a student to?");
			System.out.println("What is the name of the student you would like to add to " + Course.name);
		}
	}
}

