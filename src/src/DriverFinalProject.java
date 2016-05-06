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
			Scanner menu1 = new Scanner(System.in);
			System.out.println("What is the name of this class?");
			Course c1 = new Course("course");
			c1.changeName(menu1.nextLine());
			System.out.println("What is the location of this class?");
			c1.changeLocation(menu1.nextLine());
			System.out.println("What is the time of this class?");
			c1.changeTime(menu1.nextInt());
			System.out.println("Who is the instructor of this class?");
			c1.changeInstructor(menu1.nextLine());
			System.out.println(c1.name + " will take place at "+c1.location + " at " + c1.time);
			
		}
	}

}
