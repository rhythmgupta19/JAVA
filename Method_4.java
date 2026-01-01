// WITH PARAMETER WITH RETURN VALUE:
// Number of input must be equal to number of parameters.
// Input must be take inside main method().
// Return type must be void.
// Print statement must be inside method body().



// import java.util.Scanner;
// public class Method_4 {
//     static String name(String s){
//         return s;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//             System.out.println("Enter your name:");
//             String s = sc.nextLine();
//             System.out.println(name(s));
//         }
//     }




// EXAMPLE -> 2

import java.io.*;

public class Method_4 {
    static int add(int a,int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int b = Integer.parseInt(br.readLine());

        System.out.println("The sum of the two numbers is" + add(a,b));

    }
}




// EXAMPLE -> 3

// import java.io.*;

// public class Method_4{
//     static int id(int a){
//         return a;
//     }
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your id:");
//         int a = Integer.parseInt(br.readLine());
//         System.out.println(id(a));
//     }
// }