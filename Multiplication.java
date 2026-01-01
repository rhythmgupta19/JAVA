//                                    // Program to multiply three numbers and display the result.

// public class Multiplication {
//     public static void main(String[] args){
//         int a = 23;
//         int c = 56;
//         float b = 23.56f;
//         float result = a * b * c;
//         System.out.println("The multiplication of the numbers are:" + result);
//     }
// }


//                program to multiply three numbers and display the result using user input.

import java.util.Scanner;
class Multiplication{
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        float b = sc.nextFloat();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        float result = a*b*c;
        System.out.println("The multiplication of the numbers are:" + result);
    }
}

// This program takes three numbers as input from the user, multiplies them, and displays the result.