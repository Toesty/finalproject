package src;
import java.util.Scanner;
public class DriverFinalProject {
	public static void main(String[] args) {
		int menuChoice;
		Scanner input = new Scanner(System.in);
	
	
		System.out.println("What would you like to do?");
		System.out.println("1 - Create Course");
		System.out.println("2 - Create Teacher");
		System.out.println("3 - Create Student");
		menuChoice = input.nextInt();
		input.close();
		if (menuChoice == 1){
			
			System.out.println("What is the name of this class?");
			
		}
	}
}
