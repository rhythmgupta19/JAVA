// WAP to create a class Student having name,age,college name,cgpa and college id and display 5 object with all details
public class Student {
    // Properties
    private String name;
    private int age;
    private String collegeName;
    private double cgpa;
    private int collegeId;
    
    // Constructor
    public Student(String name, int age, String collegeName, double cgpa, int collegeId) {
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
        this.cgpa = cgpa;
        this.collegeId = collegeId;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College Name: " + collegeName);
        System.out.println("CGPA: " + cgpa);
        System.out.println("College ID: " + collegeId);
        System.out.println("----------------------------");
    }
    
    // Main method to create and display 5 student objects
    public static void main(String[] args) {
        // Creating 5 student objects
        Student student1 = new Student("Amit Kumar", 20, "Delhi University", 8.5, 101);
        Student student2 = new Student("Priya Singh", 21, "Mumbai University", 8.9, 102);
        Student student3 = new Student("Rahul Sharma", 19, "Bangalore Institute", 7.8, 103);
        Student student4 = new Student("Neha Gupta", 22, "Pune University", 9.2, 104);
        Student student5 = new Student("Vikram Patel", 20, "Ahmedabad College", 8.1, 105);
        
        // Display all student details
        System.out.println("========== STUDENT DETAILS ==========\n");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();
    }
}