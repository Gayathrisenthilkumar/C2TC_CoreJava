package EntityClassAssignment1;

public class StudentDemo {
    public static void main(String[] args) {
        // Creating 3 student objects
        Student s1 = new Student(1, "Alice", 20);
        Student s2 = new Student(2, "Bob", 22);
        Student s3 = new Student(3, "Charlie", 21);

        // Display student details
        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();
    }
}