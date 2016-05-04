package src;
import java.util.Scanner;

public class DriverFinalProject {
	public static void main(String[] args) {
<<<<<<< HEAD

		int counter = 1;
		
=======
		int menuChoice;
>>>>>>> 0d9b057bd78b7c5493b4d57e32c1ddb872655367
		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println("1 - Create Course");
		System.out.println("2 - Create Teacher");
		System.out.println("3 - Create Student");
<<<<<<< HEAD
		System.out.println(" ");
		System.out.println("4 - Add Student to Course");
		System.out.println("5 - Drop Student from Course");
		System.out.println("6 - List Course Details");
		System.out.println("7 - List Teacher Details");
		System.out.println("8 - List Student Details");

		input.close();
		
		while (counter == 1) {
=======
		menuChoice = input.nextInt();
		input.close();
		if (menuChoice == 1){
			
			System.out.println("What is the name of this class?");
>>>>>>> 0d9b057bd78b7c5493b4d57e32c1ddb872655367
			
		}
	}
}
