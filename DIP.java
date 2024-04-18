/**
 *Title: A java programme to demonstrate Dependency Inversion Principle.
 *Author: Bijoy Kumar Paul, Student ID: 220234 , Discipline: CSE , Khulna University
 * Interface for any class that provides student information.
 */
interface StudentDataProvider {
    /**
     * Retrieves student details.
     *
     * @return Student object containing details.
     */
    Student getStudentDetails();
}

/**
 * Represents a simple Student with basic information.
 */
class Student {
    private String name;
    private int age;
    private String course;

    /**
     * Constructs a new Student object with the given name, age, and course.
     *
     * @param name   The name of the student.
     * @param age    The age of the student.
     * @param course The course the student is enrolled in.
     */
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    /**
     * Retrieves the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age of the student.
     *
     * @return The age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the course the student is enrolled in.
     *
     * @return The course the student is enrolled in.
     */
    public String getCourse() {
        return course;
    }
}

/**
 * Class responsible for providing student information.
 */
class StudentDatabase implements StudentDataProvider {

    /**
     * Retrieves student details from a database.
     *
     * @return Student object containing details.
     */
    @Override
    public Student getStudentDetails() {
        // Simulate fetching student details from a database
        return new Student("Nayon", 21, "Computer Science");
    }
}

/**
 * Class responsible for printing student details.
 */
class StudentPrinter {

    /**
     * Prints the details of a student.
     *
     * @param studentDataProvider Object providing student information.
     */
    public void printStudentDetails(StudentDataProvider studentDataProvider) {
        Student student = studentDataProvider.getStudentDetails();
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
    }
}

/**
 * Demonstrates the usage of StudentPrinter class with dependency inversion.
 */
class SchoolDemo {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a StudentDatabase instance
        StudentDataProvider studentDatabase = new StudentDatabase();

        // Create a StudentPrinter instance
        StudentPrinter printer = new StudentPrinter();

        // Use StudentPrinter to print student details
        printer.printStudentDetails(studentDatabase);
    }
}
/**
*StudentDataProvider is an interface that defines a contract for any class providing student information. This represents the abstraction.
*StudentDatabase is a concrete class implementing StudentDataProvider, responsible for retrieving student details from a database.
*StudentPrinter class depends on StudentDataProvider abstraction rather than directly depending on StudentDatabase. This allows for flexibility as different data sources can be used without modifying StudentPrinter.
*Proper documentation using JavaDoc format and comments is provided for classes, methods, and parameters to enhance code readability and understanding.
*/
