// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Practice3 {
//     public void add() throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number");
//         int num1 = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number");
//         int num2 = Integer.parseInt(br.readLine());

//         int sum = num1 + num2;
//         System.out.println("Sum of the nums is:" + sum);
//     }

//     public void difference() throws IOException {
//         BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number");
//         int a = Integer.parseInt(sr.readLine());

//         System.out.println("Enter second number");
//         int b = Integer.parseInt(sr.readLine());

//         int sub = a - b;
//         System.out.println("The sub of two nums is:" + sub);
//     }

//     public void product() throws IOException {
//         BufferedReader rv = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number");
//         int x = Integer.parseInt(rv.readLine());

//         System.out.println("Enter second number");
//         int y = Integer.parseInt(rv.readLine());

//         int multiply = x * y;
//         System.out.println("The product of two nums is:" + multiply);
//     }

//     public void division() throws IOException {
//         BufferedReader rv = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number");
//         int x = Integer.parseInt(rv.readLine());

//         System.out.println("Enter second number");
//         int y = Integer.parseInt(rv.readLine());

//         int div = x / y;
//         System.out.println("Division of two nums is:" + div);

//     }

//     public static void main(String[] args) throws IOException {
//         Practice3 obj = new Practice3();
//         obj.add();
//         obj.product();
//         obj.difference();
//         obj.division();
//     }
// }


// Qn-->2 Explain which among the following is the best way of writing
/// import statement.
// a-> import java.util.*;
// b-> import java.util.Date;

// Ans-> The best way to import "Date" is "import java.util.Date" because it
// give more appropriate input and it import only
// what we need no other modules and library.
// Example->
// import java.util.Date;

// public class Practice3{
// public static void main(String[] args) {
// Date today = new Date();
// System.out.println("Current date and time" + today);
// }
// }


// Qn-->3 WAP to return your name as output.

// import java.util.Scanner;
// public class Practice3{
// static String name(String r){
// return r;
// }
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your name:");

// String r = sc.nextLine();
// System.out.println(name(r));
//     }
// }


// Qn-->4 By using scanner class take input for name and age and print them.

// import java.util.Scanner;
// public class Practice3{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = sc.nextLine();

//         System.out.println("Enter your age:");
//         int age = sc.nextInt();
//     }
// }


// Qn-->5 WAP to take radius as input and print the area and circumference of circle. 

import java.util.Scanner;
public class Practice3{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the radius of circle:");
    float r = sc.nextFloat();

    float area = 3.128f * r * r;
    float circumference = 2*3.182f*r;

    System.out.println("Area of circle is:" + area);
    System.out.println("Circumference of circle is:" + circumference);
    }
}



// Qn--> 6 Write a method that takes a user’s name as input and prints a greeting

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Practice3{
//     static void greet(String name) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter your name:");
//         name = br.readLine();

//         System.out.println("Hello, " + name + "! Welcome!");

//     }
//     public static void main(String[] args)throws IOException {
//         greet("name");
//     }
// }

