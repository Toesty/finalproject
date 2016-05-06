/*package src;

import java.util.Scanner;

public class Course {
	String name;
	String location;
	int time;
	String instructor;
	
	
	Course(String name){
		this.name = name;
		this.location = "place";
		this.time = 0;
		this.instructor = "person";
		
		
		System.out.println("What is the name of this course:");
		Scanner input = new Scanner(System.in);
		this.name = input.nextLine();
		System.out.println("Where does this course take place:");
		this.location = input.nextLine();
		System.out.println("What time is this course:");
		this.time = input.nextInt();
		System.out.println(name + " will take place at "+location + " at " + time);
		
	}
	void changeName(String newName) {
		name = newName;
	}
	void changeLocation(String newLocation) {
		location = newLocation;
	}
	void changeTime(int newTime) {
		time = newTime;
	}
	void changeInstructor(String newInstructor) {
		instructor = newInstructor;
	}
}
*/
import java.util.*;

public abstract class Course {
    private Teacher teacher;
    private Student[] students;
    private UUID id;

    protected Course(int maxStudents, Teacher teacher) { //might allow multiple teachers later
        students = new Student[maxStudents];
        this.teacher = teacher;

        id = UUID.randomUUID();
    }

    void addStudent(Student student) {
        for(int i = 0; i < students.length; i++) {
            if(student == students[i])
                continue;

            if(students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }   

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, students.length);
    }

    public boolean isFull() {
        boolean full = true;

        for(Student student : students)
            full = student != null;

        return full;
    }

    public abstract String getName();
}

