package EntityClassAssignment1;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
