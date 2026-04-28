// 1-->  This is an infinite loop 

// public class WhileLoop {
//     public static void main(String[] args){
//         int i= 1;
//         while(true){
//             System.out.println("Rhythm " + i);
//             i++;
//         }
//     }
// }

// 2--> Here i(loop) start from 1 and terminate where condition satisfied.

// public class WhileLoop{
//     public static void main(String[] args){
//         int i = 1;
//         while(i <= 5){
//             System.out.println("Rhythm " + i);
//             i++;
//         }
//         System.out.println("End " + i);
//     }
// }

// 3--> Nested WhileLoop

// public class WhileLoop{
//     public static void main(String[] args){
//         int i = 1;
//         while(i<=5){
//             System.out.println("Rhythm " + i);
//             int j = 1;
//             while(i<=4){
//                 System.out.println("The OG");
//                 j++;
//             }
//         i++;
//         }
//     }
// }


// Qn-4 Problem: Write a program that prints the message "Java is fun" exactly 5
// times.

// public class Repeat{
//     public static void main(String[] args) {
//         int i = 1;
//         while(i <= 5){
//             System.out.println("Java is fun");
//             i++;
//         }
//     }
// }


// Qn-5 Write a program that prints the numbers from 1 to 10 on separate lines.

// public class Number{
//     public static void main(String[] args){
//         int i = 1;
//         while(i <= 10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// Qn-6 Print all even numbers between 0 and 20 (inclusive).

// public class Increment{
//     public static void main(String[] args){
//         int i = 0;
//         while(i <= 20 ){
//             System.out.println(i);
//              i += 2;
//         }
//     }
// }
                    //or
// public class Increment{
//     public static void main(String[] args){
//         int i = 0;
//         while( i <= 20){
//             if(i % 2 == 0){
//                 System.out.println(i);
//             }
//             i++;
//         }
//     }
// }

// Qn-7 Create a String variable secretPassword = "1234". Ask the user to input a password. Keep looping while the input does not match the secret password.

// import java.util.Scanner;
// public class Password{
//     public static void main(String[] args){
//         boolean flag = true;
//         while(flag){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the password:");
//             String secretPassword = sc.nextLine();
//             if(secretPassword.equals("1234")){
//                 System.out.println("Right Password");
//                 flag = false;
//             }            
//         }
//     }
// }


// Qn-8 Create a variable sum = 0. Use a while loop to add the numbers 1, 2, 3,4, and 5 to that variable. Print the final sum at the end.

// public class WhileLoop{
//         public static void main(String[] args){
//             int sum = 0;
//             int i = 1;
//             while(i <= 5){
//                 sum = sum +1;
//                 i++;
//             }
//             System.out.println("The sum of the numbers are " + sum);
//         }
// }


// Qn-9 continuously ask the user to enter a word. The loop should keep running until the user types the specific word "stop"

// import java.util.Scanner;
// public class WhileLoop{
//     public static void main(String[] args){
//         // boolean flag = true;
//         while(true){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter a word");
//             String word = sc.nextLine();
//             if(word.equals("stop")){
//                 System.out.println("Correct guess");
//                 // flag = false;
//                 break;
//             }
//         }
//     }
// }


// Qn-10 Write a program to find the factorial of a number entered by the user (e.g., 5! = 5 × 4 × 3 × 2 × 1 = 120)

// import java.util.Scanner;
// public class WhileLoop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num = sc.nextInt();
//         long factorial  = 1;

//         int i = 1;      // Initialize counter;

//         while(i <= num){
//             factorial = factorial*i;        // multiply current i into the total
//             i++;
//         }
//         System.out.println("The factorial of " + num + " is " + factorial);
//     }
// }
                                                // or 
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Factorial {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a number:");
//         int number = Integer.parseInt(br.readLine());

//         long factorial = 1;
//         int count = 1;
//         while (count <= number) {
//             factorial = factorial * count;
//             count++;
//         }
//         System.out.println("The factorial of " + number + " is  " + factorial);
//     }
// }
// Qn-11 Write a program that continuously asks the user to enter integers. Keep adding these integers to a total variable. The loop should terminate when the user enters a negative number or zero.

// import java.util.*;
// public class WhileLoop {
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//             int sum = 0;
//             System.out.println("Enter a number");
//             int num = sc.nextInt();

//             while(num >0){      // run if condition is positive.

//                 sum += num;     // Add valid number to the sum.

//                 System.out.println("Enter next number:");
//                 num = sc.nextInt();
//             }
//             System.out.println("The sum is "+ sum);        // loop break immediately when number is  <= 0
//         }
// }


// Qn-12 Write a program that takes an integer input (e.g., 5892) and counts how many digits it has.

// import java.io.*;
// public class WhileLoop{
//     public static void main(String[] args){
        
//     }
// }

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
