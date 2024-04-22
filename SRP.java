/**
 *Title: A java programme to demonstrate Single Responsibility Principle
 *Author: Bijoy Kumar Paul, Student ID: 220234 , Discipline: CSE , Khulna University
 * Represents a simple Student with name, age, and enrolled course.
 */
class Student {
    private String name;
    private int age;
    private String course;

    /**
     * Constructs a new Student object with the given attributes.
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
 * Manages the operations related to students, such as printing their details.
 */
class StudentManagementSystem {

    /**
     * Prints the details of a student.
     *
     * @param student The student whose details to print.
     */
    public void printStudentDetails(Student student) {
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
    }
}

/**
 * Demonstrates the usage of Student and StudentManagementSystem classes.
 */
class SchoolDemo {
    /**
     * Main method to demonstrate the usage of Student and StudentManagementSystem classes.
     *
     * @param args Command-line arguments (not used in this demo).
     */
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Bijoy", 21, "Advanced Programming Laboratory");

        // Enroll the student in a course using StudentManagementSystem
        StudentManagementSystem sms = new StudentManagementSystem();

        // Print student details using StudentManagementSystem
        sms.printStudentDetails(student);
    }
}

/**
 * In the above program, the Single Responsibility Principle is demonstrated where the Student class is responsible for storing the attributes of a student, and the StudentManagementSystem class is responsible for managing student-related operations.
 * This separation of concerns allows for easier maintenance and modification of the code.
 */
