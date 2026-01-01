
// In Java, a parameterized constructor is a constructor that takes values (parameters) when you create an object and uses those values to initialize variables.
// parameterized constructor is a constructor that accepts parameters to initialize instance variables at the time of object creation.

// For creating a constructor-->
// It has no return type.
// name must be same as class name.
// Default and parameterized.


// Qn-->1  WAP to create a class Student having name,age,college name,cgpa and collegeID with all details.


// public class Details {

    // Instance variable
//     String name;
//     String proffasion;
//     String city;
//     int age;
//     String college;
//     double cgpa;

    // Sabse pahle class bananke (instance) variable declare karo then constructor banao usko
    // values assign karo then ak method banao display karane ke liye then method ke
    // andar class ka object bana ke object me hi details or value dedo then call
    // the methods and print it.

    // Constructor
//     public Details(String name, String profession, String city, int age, String college, double cgpa) {
//         this.name = name;
//         this.profession = profession;
//         this.city = city;
//         this.age = age;
//         this.college = college;
//         this.cgpa = cgpa;
//     }

    // Method to diaplay
//     void displayDetails() {
//         System.out.println("name" + " " + name);
//         System.out.println("Age" + " " + age);
//         System.out.println("Profession" + " " + profession);
//         System.out.println("City" + " " + city);
//         System.out.println("College" + " " + college);
//         System.out.println("CGPA" + " " + cgpa);
//     }

//     public static void main(String[] args) {

        // Assign values in object
//         Details details1 = new Details("Rhythm", "Student", "Rewa", 19, "OGI", 7.56);
//         Details details2 = new Details("Saranshi", "Student", "Rewa", 19, "OGI", 7.86);
//         Details details3 = new Details("Shivansh", "Student", "Rewa", 19, "OGI", 6.56);
//         Details details4 = new Details("Raunak", "Student", "Rewa", 19, "OGI", 6.56);
//         Details details5 = new Details("Ravi", "Student", "Rewa", 19, "OGI", 7.86);

        // display object
//         System.out.println("=========Details========");
//         details1.displayDetails();
//         System.out.println("------------------");
//         details2.displayDetails();
//         System.out.println("------------------");
//         details3.displayDetails();
//         System.out.println("------------------");
//         details4.displayDetails();
//         System.out.println("------------------");
//         details5.displayDetails();
//     }
// }


// Qn-->2  Design a class Employee that automatically assigns id, name,and salary where an object is created.

// public class Employee{
//     String name;
//     int id;
//     int salary;

//     // Parameterized constructor
//     public Employee(String name,int id,int salary){
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }
//     // Method to Display
//     void DisplayDetails(){
//         System.out.println("Name" + " " + name);
//         System.out.println("ID" +" "+ id);
//         System.out.println("Salary"+" " + salary);
//     }
//     // Main Method
//     public static void main(String[] args){
//         Employee e1 = new Employee("Rhythm",213,2700000);
//         e1.DisplayDetails();
//         System.out.println("!------------------!");

//         Employee e2 = new Employee( "Saranshi", 239,1400000);
//         e2.DisplayDetails();
//         System.out.println("!------------------!");

//         Employee e3 = new Employee("Shivansh",247,1600000);
//         e3.DisplayDetails();
//         System.out.println("!------------------!");
//     }
// }


// Qn-->3  Write a program where a Rectangle object already knows its length and breadth when created, and it can calculate its area.

// public class Rectangle{
//     int length;
//     int breadth;
//     int area;

        //   Parameterized Constructor

//     public Rectangle(int length,int breadth){
//         this.length = length;
//         this.breadth = breadth;
//         this.area = length*breadth;
//     }
        // Method to display
//     void DisplayArea(){
//         System.out.println("Length" +" "+ length);
//         System.out.println("Breadth"+" "+ breadth);
//         System.out.println("Area"+" "+ area);
//     }
//     public static void main(String[] args){
//         Rectangle r1 = new Rectangle(14,23);
//         r1.DisplayArea();
//         System.out.println("!<<<<<<<<>>>>>>>>>!");

//         Rectangle r2 = new Rectangle(34,54 );
//         r2.DisplayArea();
//     }
// }


// Qn-->4  Create a class Car in which when you make a new car object, it should immediately have its brand and model assigned. Also, make another car object
// with the same details of the first one.

// public class Car{
//         String brand;
//         String model;
//         int price;

//         public Car(String brand,String model, int price){
//                 this.brand = brand;
//                 this.model = model;
//                 this.price = price;
//         }
//         void CarDetails(){
//                 System.out.println("Brand:"+ " " + brand);
//                 System.out.println("Model:"+ " " + model);
//                 System.out.println("Price:"+ " " + price);
//         }
//         public static void main(String[] args){
//                 Car c1 = new Car("Maruti", "Swift", 500000);
//                 c1.CarDetails();
//                 System.out.println("!=================!");

//                 Car c2  = new Car("Audi", "AL220",7000000);
//                 c2.CarDetails();
//                 System.out.println("!<<<<<<<<<<<<>>>>>>>>>>>!");
//         }
// }


// Qn--> 5 Define a class Book where you can create a book object either with no details or by giving its title and price at the time of
// creation.

// public class Book{
//         String title;
//         int price;

//         public Book(String title,int price){
//                 this.title = title;
//                 this.price = price;
//         }
//         void BookDetails(){
//                 System.out.println("Title" + " " + title);
//                 System.out.println("Price" + " " + price);
//         }
//         public static void main(String[] args){
//                 Book b1 = new Book("ShreeMadBhagvatGeeta",5500 );
//                 b1.BookDetails();
//                 System.out.println("!===============!");

//                 Book b2 = new Book("Ramayan",6000);
//                 b2.BookDetails();
//         }  
// }


// Qn-->6 Create a class BankAccount where each new account must start with an account number and an opening balance.

// public class BankAccount{
//         String accountNumber;
//         int balance;

//         public BankAccount(String accountNumber,int balance){
//                 this.accountNumber = accountNumber;
//                 this.balance = balance;
//         }
//         void BankBalance(){
//                 System.out.println("AccountNumber"+ " " + accountNumber);
//                 System.out.println("BankBalance" + " "+ balance);
//         }
//         public static void main(String[] args){
//                 BankAccount b1 = new BankAccount("648202XXXXXX",56789);
//                 b1.BankBalance();
//                 System.out.println("!===============!");

//                 BankAccount b2 = new BankAccount("3947021XXXX",45678);
//                 b2.BankBalance();
//         }
// }


// Qn--> 7 Write a program where a Circle object is created with a radius provided at the time of object creation and can calculate its area.

// public class Circle{
//         double radius;
//         double area;

//         public Circle(double radius){
//                 this.radius = radius;
//                 this.area = 2*3.14*radius;
//         }
//         void ShowArea(){
//                 System.out.println("Radius:"+" " + radius);
//                 System.out.println("Area"+ " " + area);
//         }
//         public static void main(String[]args){
//                 Circle c1 = new Circle(23.43);   
//                 c1.ShowArea();
//                 System.out.println("!=================!");

//                 Circle c2 = new Circle(45.87);
//                 c2.ShowArea();
//         }
// }


// Qn-->8 Create a class Mobile in which you can create one object by simply copying the details of another existing mobile object.

// public class Mobile{
//         String brand;
//         int price;

//         public Mobile(String brand,int price){
//                 this.brand = brand;
//                 this.price = price;
//         }
        
        // Copy Constructor - to copy details from another Mobile object
//         public Mobile(Mobile other){
//                 this.brand = other.brand;
//                 this.price = other.price;
//         }
        
//         void AboutMobile(){
//                 System.out.println("Brand:" + " " + brand);
//                 System.out.println("Price" + " " + price);
//         }
//         public static void main(String[] args){
//                 Mobile m1 = new Mobile("Redmi",17000);
//                 m1.AboutMobile();
//                 System.out.println("!=================!");

//                 Mobile m2 = new Mobile(m1);  // Copying m1's details to m2
//                 m2.AboutMobile();
//         }
// }


// Qn-->9  Define a class Laptop where you can create objects in different ways – with no details, with only a model name, or with both model name and price.

// public class Laptop{
//         String model;
//         int price;

//         //Constructor for both model and price.
//         public Laptop(String model,int price){
//                 this.model = model;
//                 this.price = price;
//         }
//         //Constructor for no Details.
//         public Laptop(){
//                 this.model = "Unknown";
//                 this.price = 0;
//         }
//         // Constructor only for model name.
//         public Laptop(String model){
//                 this.model = model;
//         }
        
//         void DisplayDetails(){
//                 System.out.println("Model:"+" " + model);
//                 System.out.println("Price:"+" " + price);
//         }
//         public static void main(String[] args){
//         Laptop l1 = new Laptop("ASUS",65000);
//         l1.DisplayDetails();
//         System.out.println("!============!");

//         Laptop l2 = new Laptop();
//         l2.DisplayDetails();
//         System.out.println("!============!");

//         Laptop l3 = new Laptop("Dell");
//         l3.DisplayDetails();
//         }
// }
// For different types of object we have to create different-different parameters according to conditions. 


// Qn--10   Write a program where a Movie object should always have a  name and rating when it is created.

// public class Movies{
//         String name;
//         double rating;

//         // Parameterized Constructor.
//         public Movies(String name, double rating){
//                 this.name = name;
//                 this.rating = rating;
//         }
        
//         // Method to display movie details
//         void Show(){
//                 System.out.println("Name: " + name);
//                 System.out.println("Rating: " + rating);
//         }
        
//         public static void main(String[] args){
                // Creating Movie objects - name and rating are MANDATORY
//                 Movies m1 = new Movies("Inception", 8.8);
//                 m1.Show();
//                 System.out.println("========================");
                
//                 Movies m2 = new Movies("The Dark Knight", 9.0);
//                 m2.Show();
//                 System.out.println("========================");
                
//                 Movies m3 = new Movies("Interstellar", 8.6);
//                 m3.Show();
//                 System.out.println("========================");
                
//                 Movies m4 = new Movies("Avatar", 7.8);
//                 m4.Show();
//                 System.out.println("========================");
                
//                 Movies m5 = new Movies("Titanic", 7.8);
//                 m5.Show();
//         }
// }


// Qn--11 Create a class Triangle where you provide three sides while creating the object, and it should immediately check whether the triangle is valid..

// public class Triangle{
//         int side1;
//         int side2;
//         int side3;
//         String Valid;

//         public Triangle(int side1,int side2,int side3){
//                 this.side1 = side1;
//                 this.side2 = side2;
//                 this.side3 = side3;
//                 if(side1+side2+side3 == 180){
//                         this.Valid = "Valid";
//                 } else {
//                         this.Valid = "Invalid";
//                 }
//         }
//         void ShowSides(){
//                 System.out.println("Side1"+" "+ side1);
//                 System.out.println("Side2" + " " + side2);
//                 System.out.println("Side3" + " " + side3);
//                 System.out.println("Validation"+" "+ Valid);
//         }
//         public static void main(String[] args){
//                 Triangle t1 = new Triangle(55,74,51);
//                 t1.ShowSides();
//                 System.out.println("!=============!");

//                 Triangle t2 = new Triangle(34, 87, 45);
//                 t2.ShowSides();
//         }
// }


// Qn-->12  Define a class Product where every product object is created with an id, name, and quantity.

// public class Product{
//         String ProductName;
//         int id;
//         int Quantity;

//         // Parameterized Constructor - Ensures every Product must have id, name, and quantity
//         public Product(String ProductName, int id, int Quantity){
//                 this.ProductName = ProductName;
//                 this.id = id;
//                 this.Quantity = Quantity;
//         }
        
//         // Method to display product details
//         void Show(){
//                 System.out.println("Product Name: " + ProductName);
//                 System.out.println("ID: " + id);
//                 System.out.println("Quantity: " + Quantity);
//         }
        
//         public static void main(String[] args){
//                 // Creating 5 Product objects with id, name, and quantity
//                 Product p1 = new Product("Laptop", 101, 5);
//                 p1.Show();
//                 System.out.println("========================");
                
//                 Product p2 = new Product("Mobile", 102, 15);
//                 p2.Show();
//                 System.out.println("========================");
                
//                 Product p3 = new Product("Headphones", 103, 25);
//                 p3.Show();
//                 System.out.println("========================");
                
//                 Product p4 = new Product("Keyboard", 104, 10);
//                 p4.Show();
//                 System.out.println("========================");
                
//                 Product p5 = new Product("Mouse", 105, 20);
//                 p5.Show();
//         }
// }


// Qn-->13  Write a program for a Teacher where simply creating a teacher object should print “Teacher object created,” and you can also create an object by giving name and subject.

// public class Teachers{
//         String name;
//         String subject;

//         public Teachers(String name,String subjects){
//                 this.name = name;
//                 this.subject = subject;
//         }
//         void TeachersDetails(){
//                 System.out.println("Name"+" "+name);
//                 System.out.println("Subject"+" "+subject);
//         }
//         public static void main(String[] args){
//                 Teachers t1 = new Teachers("Akash kumaar singh", "maths");
//                 t1.TeachersDetails();
//                 System.out.println("!<<<<<<>>>>>>");

//                 Teachers t2 = new Teachers("Urmila Mahor","DSA");
//                 t2.TeachersDetails();

//         }
// }
/* Not completed yet there is doubt in this question. */


// Qn--> 14 Write a program for a Person where you should be able to create a person in three different ways: with no details, with only
// name, or with both name and age.

// public class Person{
//         String name;
//         int age;

//         //constructor fot both
//         public Person(String name,int age){
//                 this.name = name;
//                 this.age = age;
//         }
//         // constructor with one value
//         public Person(String name){
//                 this.name =  name;
//         }
//         // constrictor with no values
//         public Person(){
//                 this.name = "Unknown";
//                 this.age = 0;
//         }
//         void Display(){
//                 System.out.println("Name"+" "+name);
//                 System.out.println("Age"+" "+age);   
//         }
//         public static void main(String[] args){
//                 Person p1 = new Person("Rhythm",19);
//                 p1.Display();
//                 System.out.println("!==========!");

//                 Person p2 = new Person("Rhtyhm");
//                 p2.Display();
//                 System.out.println("!===========!");

//                 Person p3 = new Person();
//                 p3.Display();

//         }
// }
