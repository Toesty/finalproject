import java.util.*;

public abstract class Course {
    private Teacher teacher;
    private Student[] students;
    private UUID id;
    private String location;
    private int time;
    private String name;
    
    ArrayList Courses = new ArrayList();
	void addCourse(){
	Scanner addCourseScanner = new Scanner(System.in);
	String name1;
	name1 = addCourseScanner.nextLine();
	Courses.add(name1);
}

    protected Course(int maxStudents, Teacher teacher, String location, int time, String name) { //might allow multiple teachers later
        students = new Student[maxStudents];
        this.teacher = teacher;
        this.time = time;
        this.location = location;
        this.name = name;

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

    public String getName(){
    	return name;
    }
    void changeName(String newName) {
		name = newName;
	}
    void changeLocation(String newLocation) {
		location = newLocation;
	}
    void changeTime(int newTime){
    	time = newTime;
    	
    }
}

