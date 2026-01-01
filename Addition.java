                                      // Programme of addition of five number without user input

// public class Addition {
//     public static void main(String[] args){
//         int a = 15;
//         int b = 25;
//         int c,d,e;
//         c = 35;
//         d = 45;
//         e = 65;
//         int sum  = a +b + c + d + e;
//         System.out.println(sum);
//         System.out.println("The addition of the numbers are:" + sum);
        
//     }

// }

                                        // We can take user input with two different way

// First by importing Scanner class and second by using full form of Scanner class.
// For using Scanner class we have to import it first.
// By using full form of Scanner class eg: java.util.Scanner sc = new java.util.Scanner(System.in);
// And in place "sc" we can use any variable name.



                                       // Programme  of Addition of two numbers by taking user input

import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third  number:");
        int c = sc.nextInt();
        System.out.println("Enter fourth number:");
        // we can also use full form of Scanner class to take user input.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int d = scanner.nextInt();
        int sum = a + b + c +d;
        System.out.println("The addition of the numbers are:" + sum);

   }
}