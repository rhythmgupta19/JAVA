                                            // this is program to demonstrate division operation

// public class Division {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 2;
        
//         int result = a / b;
//         System.out.println("Result: " + result);
        
//         System.out.println("Error: Division by zero is not allowed.");
        
//     }
// }


// Program to perform division by taking user input

import java.util.Scanner;
class Division{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator = sc.nextInt();
        System.out.println("Enter denominator:");
        int denominator = sc.nextInt();
        int result = numerator / denominator;
        System.out.println("The division of two numbers are:" +" " + result);
    }
}