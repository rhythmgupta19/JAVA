// public class Subtraction {
//     public static void main(String[] args){
//         float a = 23.05f;
//         float b = 12.55f;
//         float sub = a-b;
//         System.out.println("The subtraction of the numbers are:" + sub);
        
//     }
    
// }


                  // Programme of Subtraction of two numbers by taking user input

import java.util.Scanner;
public class Subtraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a = sc.nextFloat();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        float sub = a - b;
        System.out.println("The subtraction of the numbers are:" + sub);
    }
}