
// Question--> 1 Which add get called();

// class Questions{
//     void add(int a ,int b){       // This method does not take double value it give error "loosy conversion"
//         System.out.println(a+b);

//     }
//     void add(double a ,double b){
//         System.out.println(a+b);   // This method will call because we one value's is "integer" and other one is "double" this method take both values.Int is promoted to doubleis valid 

//     }
//     public static void main(String[] args){
//         Questions obj = new Questions();
//         obj.add(5,6.0);
//     }

// }

// Question-->2 Which is valid overloading.

// class Questions{
//     void display(String name,int age){
//     }
//     void display(int age,String name){
//     }
//     public static void main(String[] args){
//         Questions obj = new Questions();
//         obj.display( );
//     }
// }

// Question-->3 Method overloading

// public class Questions{
//     int add(int a ,int b){
//         return a+b;
//     }
//     int add(int r,int v,int h){                        // Method overloading = parameters ka khel
//         return r+v;
//     }
//     public static void main(String[] args){
//         Questions obj = new Questions();
//         obj.add(12,32);
//     }
// }

// Question-->4 which constructor run.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// class Questions {
//    public static add() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in)),
//         System.out.println("Enter first number:");
//         int a = Integer.parseInt(br.readLine());
//         System.out.println("Enter second number:");
//         int b = Integer.parseInt(br.readLine());
//         int sum = a+b;
//         return sum;
//     }

//     static add(int a, int b) throws IOException {
//         int c = a + b;
//         return c;
//     }

//     public static void main(String[] args);

//     Questions obj = new Questions();
//     obj.add();
// }



// Qn-->5 WAP to take two number as input and perform all arithmetic operator.

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Practice5 {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// System.out.print("Enter first number: ");
// double num1 = Double.parseDouble(br.readLine());

// System.out.print("Enter second number: ");
// double num2 = Double.parseDouble(br.readLine());

// double sum = num1 + num2;
// double difference = num1 - num2;
// double product = num1 * num2;
// double quotient = num1 / num2;
// double remainder = num1 % num2;

// System.out.println("Addition: " + sum);
// System.out.println("Subtraction: " + difference);
// System.out.println("Multiplication: " + product);
// System.out.println("Division: " + quotient);
// System.out.println("Modulus: " + remainder);
// }
// }



// qn-->6 WAP to take two number as input and check whether number is
// greater,smaller or equal.

// import java.util.Scanner;

// public class Practice5 {
// public static void main(String[] args){

// Scanner sc = new Scanner(System.in);

// float num1 = 344.45f;
// float num2 = 234.56f;

// System.out.print("Enter first number: ");
// float num1 = sc.nextFloat();

// System.out.println("Enter second number:");
// float num2 = sc.nextFloat();

// System.out.println(num1 > num2 );
// System.out.println(num1 < num2 );
// System.out.println(num1 == num2 );
// }
// }



// Qn--> 7 Create a class named Car with variable brand,model,price and write a
// method.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Car {
// public void Details() throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// System.out.println("Enter brand name:");
// String brand = br.readLine();

// System.out.println("Enter model:");
// String model = br.readLine();

// System.out.println("Enter price:");
// int price = Integer.parseInt(br.readLine());
// }

// public static void main(String[] args) throws IOException {
// Car obj = new Car();
// obj.Details();
// }
// }



// Qn--> 7 Create a class Laptop create two object with different values and
// display the details.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// class Laptop {
// String brand;
// String model;
// int price;

// public void Details() throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// System.out.println("Enter brand name:");
// brand = br.readLine();

// System.out.println("Enter model:");
// model = br.readLine();

// System.out.println("Enter price:");
// price = Integer.parseInt(br.readLine());
// }

// public void displayDetails() {
// System.out.println("Brand: " + brand);
// System.out.println("Model: " + model);
// System.out.println("Price: " + price);
// }

// public static void main(String[] args) throws IOException {
// Laptop laptop1 = new Laptop();
// System.out.println("Enter details for Laptop 1:");
// laptop1.Details();

// Laptop laptop2 = new Laptop();
// System.out.println("Enter details for Laptop 2:");
// laptop2.Details();

// System.out.println("\nDetails of Laptop 1:");
// laptop1.displayDetails();

// System.out.println("\nDetails of Laptop 2:");
// laptop2.displayDetails();
// }
// }



// Qn-->8 A class has an instance variable int x = 20; and a method contains a
// local variable int x = 10;. How will you print both values?
// class Practice5{
// int x = 20; // instance variable

// public void display() {
// int x = 10; // local variable
// System.out.println("Local variable x: " + x);
// System.out.println("Instance variable x: " + this.x);
// }

// public static void main(String[] args) {
// Practice5 obj = new Practice5();
// obj.display();
// }
// }


// Qn--> 9 Create a class Employee with a static variable companyName and a non-static variable employeeName. How will you access each one.

// public class Employee{
//     static String CompanyName = "Juspay";
//     String EmployeeName;

//     public static void main(String[]args){

        // Accessing static variable directly with the help of class name 
//         System.out.println(Employee.CompanyName);

        // Accessing non-static variable with the help of object
//         Employee emp = new Employee();
//         emp.EmployeeName = "Rhythm";
//         System.out.println(emp.EmployeeName);
//     }
// }


 // Qn--> 10 Store a person's name, age, height, and employment status using the correct data types.

// public class Person{
//         String name;
//         int age;
//         float height;
//         boolean isEmployed;

//         public static void main(String[] args){

//                 Person guy = new Person();
//                 guy.name = "Rhythm";
//                 guy.age = 21;
//                 guy.height = 5.7f;
//                 guy.isEmployed = true;

//                 System.out.println("Name: " + guy.name);
//                 System.out.println("Age:" + guy.age);
//                 System.out.println("Height: " + guy.height);
//                 System.out.println("Employed: " + guy.isEmployed);
//         }
// }


// Qn-->11 Convert a double value 45.89 to int and write what the converted value will be

// public class Conversion{
//         public static void main(String[] args) {
//                 double doubleValue = 45.89;
//                 int intValue = (int) doubleValue; // Type Casting from double to int
//                 System.out.println("Converted int value:" + intValue);
//         }
// }


// Qn--> 12 Read two numbers using Scanner and print their sum using arithmetic operators

// import java.util.Scanner;
// public class Addition{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Enter first number:");
//                 int num1 = sc.nextInt();

//                 System.out.println("Enter second number:");
//                 int num2 = sc.nextInt();

//                 int sum = num1+num2;
//                 System.out.println("Sum of two number are:"+ sum);
//         }
// }



// Qn-->13 Take two numbers as input and print the remainder using the % operator

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Remainder{
//         public static void main(String[] args) throws IOException{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//                 System.out.println("Enter first number:");
//                 double num1 = Double.parseDouble(br.readLine());

//                 System.out.println("Enter second number:");
//                 double num2 = Double.parseDouble(br.readLine());

//                 double remainder = num1 % num2;
//                 System.out.println(remainder);
//         }
// }



// Qn-->14 Create a method greet(String name) that prints a message using the given name.

// public class Welcome{
//         void greet(String name){
//                 System.out.println("Hello"+ " " + name + " " + "welcome to Dubai")
//         }
//         public static void main(String[] args){
//                 Welcome obj = new Welcome();

//                 obj.greet("Rhythm");
//         }
// }


// Qn--> 15 Create a method add(double a, double b) that returns their sum and demonstrate calling it in main()

// public class Addition{
//         double add(double a, double b){
//                 double sum = a+b;
//                 return sum;
//         }
//         public static void main(String...args){
//                 Addition obj = new Addition();
//                 double Sum = obj.add(45.67, 32.45);
//                 System.out.println("Sum is: " + Sum);
//         }
// }

 
// Qn-->16 Read a full line of text from the user using Scanner and print it.

// public class ReadLine{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Enter a line of text:");
//                 String line = sc.nextLine();

//                 System.out.println("You entered: " + line);
//         }
// }

//Qn-->17  Take input for a person’s age (int), salary (double), and name (String) using Scanner, and print all values.

// import java.util.Scanner;
// public class PersonInfo{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Enter your name:");
//                 String name = sc.nextLine();

//                 System.out.println("Enter your age:");
//                 int age = sc.nextInt();

//                 System.out.println("Enter your salary:");
//                 double salary = sc.nextDouble();

//                 System.out.println("Name: " + name);
//                 System.out.println("Age: " + age);
//                 System.out.println("Salary: " + salary);
//         }
// }

// Qn-->18  Read a name from the user using BufferedReader and print a message containing that name.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// public class PersonInfo{
//         public static void main(String[] args) throws IOException{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//                 System.out.println("Enter your name:");
//                 String name = br.readLine();

//                 System.out.println("Hello " + name + ", welcome!");
//         }
// }


 
// Qn-->19 Read a numeric input using BufferedReader, convert it into an integer using Integer.parseInt(), and print it
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// public class CodeWave{
//         public static void main(String[] args) throws IOException{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//                 System.out.println("Enter a number:");
//                 String input = br.readLine();     
//                 int number = Integer.parseInt(input);

//                 System.out.println("You entered the number: " + number);
//         }
// }


// Qn--> 20 Create a class Product with variables id, name, and price. Take values from the user and write a method to print all details.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Product{
    int id;
    String name;
    double price;

    public void inputDetails() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter product id:");
        id = Integer.parseInt(br.readLine());

        System.out.println("Enter product name:");
        name = br.readLine();

        System.out.println("Enter product price:");
        price = Double.parseDouble(br.readLine());
    }

    public void displayDetails(){
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) throws IOException{
        Product prod = new Product();
        prod.inputDetails();
        prod.displayDetails();
    }
}