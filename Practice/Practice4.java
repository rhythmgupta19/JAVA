// EXAMPLE-->1

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4 {
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number:");
//         double x = Double.parseDouble(br.readLine());

//         System.out.println("Enter second number");
//         double y = Double.parseDouble(br.readLine());

//         Double sum = x + y;
//         Double sub = x - y;
//         Double multiply = x * y;
//         Double divide = x / y;
//         System.out.println("Addition: " + sum);
//         System.out.println("Subtraction: " + sub);
//         System.out.println("Multiplication: " + multiply);
//         System.out.println("Division: " + divide);
//     }  
// }



// // EXAMPLE-->2   Area of circle and circumference of circle

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter radius of circle:");
//         double r = Double.parseDouble(br.readLine());

//         double area = 3.14 * r *r;
//         double circumference = 2 *3.14 * r;

//         System.out.println("Area of circle: " + area);
//         System.out.println("Circumference of circle: " + circumference);
//     }
// }



// EXAMPLE-->3  Using functions for arithmetic operations

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

// public class Practice4 {
//     static double add(double a,double b){
//         double c = a+b;
//         return c;
//     }
//     static double subtract(double a,double b){
//         double c = a-b;
//         return c;
//     }
//     static double multiply(double a,double b){
//         double c = a*b;
//         return c;
//     }
//     static double divide(double a,double b){
//         double c = a/b;
//         return c;
//     }
//     public static void main(String[] args)throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     System.out.println("Enter first number");
//     double a = Double.parseDouble(br.readLine());

//     System.out.println("Enter second number");
//     double b = Double.parseDouble(br.readLine());

//     System.out.println("The sum of two numbers is:" + add(a,b));
//     System.out.println("The difference of two numbers is:" + subtract(a,b));
//     System.out.println("The product of two numbers is:" + multiply(a,b));
//     System.out.println("The division of two numbers is:" + divide(a,b));
//     }
// }



// EXAMPLE-->4 By using Scanner class take user input to add,sub,multiply and divide two numbers.

// public class Practice4 {
//     static double add(double a, double b) {
//         double c = a + b;
//         return c;
//     }

//     static double subtract(double a, double b) {
//         double c = a - b;
//         return c;
//     }

//     static double multiply(double a, double b) {
//         double c = a * b;
//         return c;
//     }

//     static double divide(double a, double b) {
//         double c = a / b;
//         return c;
//     }

//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter first number");
//     double a = sc.nextDouble();
//     System.out.println("Enter second number");
//     double b = sc.nextDouble();
//     System.out.println("The sum of two numbers is:" + add(a,b));
//     System.out.println("The difference of two numbers is:" + subtract(a,b));
//     System.out.println("The product of two numbers is:" + multiply(a,b));
//     System.out.println("The division of two numbers is:" + divide(a,b));
//     }
// }



// EXAMPLE-->5 

// import java.util.Scanner;
// public class Practice4 {
//     static double add(double a, double b) {
//         double c = a + b;
//         return c;
//     }

//     static double subtract(double a, double b) {
//         double c = a - b;
//         return c;
//     }

//     static double multiply(double a, double b) {
//         double c = a * b;
//         return c;
//     }

//     static double divide(double a, double b) {
//         double c = a / b;
//         return c;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         double a = sc.nextDouble();
//         System.out.println("Enter second number");
//         double b = sc.nextDouble();
//         System.out.println("The sum of two numbers is:" + add(a,b));
//         System.out.println("The difference of two numbers is:" + subtract(a,b));
//         System.out.println("The product of two numbers is:" + multiply(a,b));
//         System.out.println("The division of two numbers is:" + divide(a,b));
//     }
// }

// EXAMPLE-->5

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
// void Details()throws IOException{ // without parameters without return type
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// System.out.println("Enter your name:");
// String name = br.readLine();

// System.out.println("Enter your age:");
// int age = Integer.parseInt(br.readLine());

// System.out.println("Enter your address:");
// String address = br.readLine();
// }
// public static void main(String[] args)throws IOException{
// Practice4 obj = new Practice4();
// obj.Details();
// }
// Float multiply() throws IOException {
// BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));

// System.out.println("Enter first number:");
// float a = Float.parseFloat(rs.readLine());

// System.out.println("Enter second number:");
// float b = Float.parseFloat(rs.readLine());
// float product = a * b;
// return product;
// }
// public static void main1(String[] args) throws IOException {
// Practice4 obj = new Practice4();
// Float result = obj.multiply();
// System.out.println("The product of two numbers is: " + result);
// }
// }

// Write a Java program to check whether a given number is *positive* using if

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
// public static void main(String[] args)throws IOException{
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// System.out.println("Enter a number to check:");
// int num = Integer.parseInt(br.readLine());

// if (num > 0){
// System.out.println("The number is positive.");
// }
// else{
// System.out.println("The number is negative.");
// }
// }
// }

// Write a Java program to check whether a given number is *even or odd*

// import java.util.Scanner;

// public class Practice4{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter a number:");
// int num = sc.nextInt();

// if(num % 2 == 0){
// System.out.println("The number is even.");
// }
// else{
// System.out.println("The number is odd.");
// }
// }
// }

// Write a Java program to check whether a given number is *divisible by 5*.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
// public static void main(String[] args) throws IOException{
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// System.out.println("Enter a number:");
// float num = Float.parseFloat(br.readLine());

// if (num % 5 == 0){
// System.out.println("The given number is divisible by 5.");
// }
// else{
// System.out.println("The given number is not divisible by 5");
// }
// }
// }

// Write a Java program to check whether a given year is a *leap year
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
// public static void main(String[] args) throws IOException{
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// System.out.println("Enter the year:");
// int year = Integer.parseInt(br.readLine());

// if((year % 4 == 0 & year % 400 == 0) || (year % 100 != 0)){
// System.out.println("year is leap year");
// }
// else{
// System.out.println("Year is not a leap year");
// }
// }
// }

// Write a Java program to find the *largest of three numbers* using if-else-if.
// import java.util.Scanner;

// public class Practice4{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter first number:");
// int num1 = sc.nextInt();
// System.out.println("Enter second number:");
// int num2 = sc.nextInt();
// System.out.println("Enter third number:");
// int num3 = sc.nextInt();

// if(num1>num2 & num1>num3 & num1!=num2 & num1!=num3){
// System.out.println("First number is greater.");
// }
// else if( num2>num1 & num2>num3 & num2!=num1 & num2!=num3){
// System.out.println("Second number is greater.");
// }
// else if(num3>num1 & num3>num2 & num3!=num1 & num3!=num2){
// System.out.println("Third number is greater.");
// }
// else{
// System.out.println("The numbers are equal");
// }
// }
// }

// 9. Write a Java program to check whether a given number is *a multiple of
// both 3 and 7*
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
// public static void main(String[] args)throws IOException{
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// System.out.println("Enter a number:");
// int num = Integer.parseInt(br.readLine());

// if(num % 3 == 0 & num % 7 == 0){
// System.out.println("The number is a multiple pof 3 & 7");
// }
// else{
// System.out.println("The number is not a multiple of 3 & 7");
// }
// }
// }


// Write a Java program to check whether a given number lies *between 10 and 50*
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the number:");
//         int num = Integer.parseInt(br.readLine());

//         if(num <= 50 & num >= 10){
//             System.out.println("The number is lies between 10 & 50");
//         }
//         else{
//             System.out.println("The number is not lies btw 10 & 50");
//         }
//     }
// }

// Write a Java program to check whether a student is *pass or fail* based on marks.
// import java.util.Scanner;
// public class Practice4{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your marks here");
//         int marks = sc.nextInt();

//         if(marks >= 33){
//             System.out.println("You are passed.");
//         }
//         else{
//             System.out.println("You are fail");
//         }
//     }
// }


// 12. Write a Java program to display the *grade of a student* based on marks using if-else-if.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your marks here:");
//         int marks = Integer.parseInt(br.readLine());

//         if(marks >= 90){
//             System.out.println("A++");
//         }
//         else if(marks >= 80 & marks <= 90){
//             System.out.println("A+");
//         }
//         else if(marks <= 80 & marks >= 70){
//             System.out.println("A");
//         }
//         else if(marks <= 70 & marks >= 60){
//             System.out.println("B");
//         }
//         else if(marks <= 60 & marks >= 50){
//             System.out.println("C");
//         }
//         else if(marks <= 50 & marks >= 40){
//             System.out.println("D");
//         }
//         else{
//             System.out.println("Try next time to score good");
//         }
//     }
// }


// Write a Java program to check whether a given number is *a single-digit, double-digit, or more than two-digit number*.
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException; 

// public class Practice4{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter the number:");
//         int num = Integer.parseInt(br.readLine());

//         if(num >= 0 & num < 10){
//             System.out.println("Single digit number.");
//         }
//         else if(num >= 10 & num <100){
//             System.out.println("Double digit number.");
//         }
//         else{
//             System.out.println("More than two digit number");
//         }
//     }
// }

// Write a Java program to calculate *electricity bill* based on unit slabs using if-else-if.
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int units = Integer.parseInt(br.readLine());

//         if (units > 20 & units <100){
//             System.out.println("per unit 1.75 rupee");
//             System.out.println(units * 1.75);
//         }
//         else if(units > 100 & units <= 200){
//             System.out.println("Per unit 2 rupee");
//             System.out.println((100*1.75) + (units-100)*2);
//         }
//         else if(units > 200 & units < 300){
//             System.out.println("Per i=unit 4 rupee");
//             System.out.println((100*1.75) + (100*2) + (units-200)*4);
//         }
//         else{
//             System.out.println("Per unit 5 rupee");
//             System.out.println((100*1.75) + (100*2) + (100*4) + (units-300)*5);
//         }
//     }
// }


// Write a Java program to check whether a given character is *uppercase or lowercase*
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice4{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a alphabet");
//         char ch = br.readLine().charAt(0);
        
//         if(ch >= 'A' && ch <= 'Z'){
//             System.out.println("The character is uppercase.");
//         }
//         else if(ch >= 'a' && ch <= 'z'){
//             System.out.println("The character is lowercase.");
//         }
//         else{
//             System.out.println("Not an alphabet.");
//         }
//     }
// }

// 18. Write a Java program to check whether a given number is *zero, positive, or negative*.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;