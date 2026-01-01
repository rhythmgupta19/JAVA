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

import java.util.Scanner;

// EXAMPLE-->4 By using Scanner class take user input to add,sub,multiply and divide two numbers.

public class Practice4 {
    static double add(double a, double b) {
        double c = a + b;
        return c;
    }

    static double subtract(double a, double b) {
        double c = a - b;
        return c;
    }

    static double multiply(double a, double b) {
        double c = a * b;
        return c;
    }

    static double divide(double a, double b) {
        double c = a / b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("The sum of two numbers is:" + add(a,b));
        System.out.println("The difference of two numbers is:" + subtract(a,b));
        System.out.println("The product of two numbers is:" + multiply(a,b));
        System.out.println("The division of two numbers is:" + divide(a,b));
    }
}


