package thursday_assignments;
import java.util.Scanner;
import java.util.UUID;

public class Login_type extends LoginSystem
{
    public void accept()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select User Type:");
        System.out.println("1. Teacher");
        System.out.println("2. Student");

        int choice = getUserChoice(scanner);

        switch (choice) 
        {
            case 1:
                System.out.println("You selected Teacher");
              
                LoginSystem ls=new LoginSystem();
        		ls.check();
        		
        		System.out.println("Create your own classroom...");
        		
        		classroom cs=new classroom();
        		cs.createid();
                
        		CourseEnrollment ce=new CourseEnrollment();
        		ce.accept();
        		
        		
        		
        		break;
                
                
                
                
            case 2:
                System.out.println("You selected Student");
                
                LoginSystem ls1=new LoginSystem();
        		ls1.check();
        		
        		break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

    private static int getUserChoice(Scanner scanner) 
    {
        int choice = 0;
        boolean isValid = false;

        do {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) 
            {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) 
                {
                    isValid = true;
                } else
                {
                    System.out.println("Invalid choice. Please select 1 or 2.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
            }
        } while (!isValid);

        return choice;
    }
}


class classroom
{
	public static String generateUniqueId()
	{
		        // Use UUID for creating a unique identifier
		        UUID uniqueId = UUID.randomUUID();
		        
		        // Extract the unique ID as a string
		        String uniqueIdString = uniqueId.toString().replace("-", "");

		        return uniqueIdString;
	}

		   public void createid()
		    {
		        // Generate and print a unique classroom ID
		        String classroomId = generateUniqueId();
		        System.out.println("Unique Classroom ID: " + classroomId);
		    }
		
}


class CourseEnrollment 
{
    private static final int MAX_COURSES = 10;
    private static final int MAX_STUDENTS_PER_COURSE = 20;

    private static String[] courses = new String[MAX_COURSES];
    private static String[][] enrolledStudents = new String[MAX_COURSES][MAX_STUDENTS_PER_COURSE];
    private static int[] studentsCount = new int[MAX_COURSES];

    public void accept()
    {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Create Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Display Enrolled Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    createCourse(scanner);
                    break;
                case 2:
                    enrollStudent(scanner);
                    break;
                case 3:
                    displayEnrolledStudents(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void createCourse(Scanner scanner) 
    {
        System.out.print("Enter the course name: ");
        String courseName = scanner.next();

        for (int i = 0; i < courses.length; i++) 
        {
            if (courses[i] == null) {
                courses[i] = courseName;
                System.out.println("Course created successfully: " + courseName);
                return;
            }
        }

        System.out.println("Maximum number of courses reached. Cannot create a new course.");
    }

    private static void enrollStudent(Scanner scanner) {
        System.out.print("Enter the course name: ");
        String courseName = scanner.next();

        int courseIndex = findCourseIndex(courseName);
        if (courseIndex == -1) {
            System.out.println("Course not found.");
            return;
        }

        System.out.print("Enter student name: ");
        String studentName = scanner.next();

        int studentsEnrolled = studentsCount[courseIndex];
        if (studentsEnrolled < MAX_STUDENTS_PER_COURSE) {
            enrolledStudents[courseIndex][studentsEnrolled] = studentName;
            studentsCount[courseIndex]++;
            System.out.println("Student enrolled successfully: " + studentName);
        } else {
            System.out.println("Maximum students enrolled in the course. Cannot enroll more students.");
        }
    }

    private static void displayEnrolledStudents(Scanner scanner) {
        System.out.print("Enter the course name: ");
        String courseName = scanner.next();

        int courseIndex = findCourseIndex(courseName);
        if (courseIndex == -1) {
            System.out.println("Course not found.");
            return;
        }

        System.out.println("Enrolled students in " + courseName + ":");
        for (int i = 0; i < studentsCount[courseIndex]; i++) {
            System.out.println(enrolledStudents[courseIndex][i]);
        }
    }

    private static int findCourseIndex(String courseName) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].equalsIgnoreCase(courseName)) {
                return i;
            }
        }
        return -1;
    }
}

