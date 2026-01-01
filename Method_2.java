// WITHOUT PARAMETER WITH RETURN TYPE:
// a-> Number of parameter must be zero.
// b-> Return type must be same as respective datatype.
// c-> Input method must br created inside method body.
// d-> Print method must be in main() method.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// public class Method_2 {
//     int add() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter first number;");
//         int a = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number:");
//         int b = Integer.parseInt(br.readLine());

//         int sum =  a + b;
//         return sum; // 
       
//     }
//     public static void main(String[] args) throws IOException{
//         Method_2 obj = new Method_2();
//         obj.add();
//     }    
// }

                     // Example 2: 

// public class Method_2{
//     String greet() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your message to greet");
//         String message = br.readLine();
//         return message;

//     }
//     public static void main(String[] args) throws IOException{
//         Method_2 obj = new Method_2();
//         obj.greet();
//     }
// }
      

// Example 3:

// public class Method_2{
//     String Details() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your name:");
//         String name = br.readLine();
//         System.out.println("Enter your age:");
//         int age = Integer.parseInt(br.readLine());
//         System.out.println("Enter your city:");
//         String city = br.readLine();
//         System.out.println("Enter your college name:");
//         String college = br.readLine();

//         String details = "Name: " + name + ", Age: " + age + ", City: " + city + ", College: " + college;
//         return details;
//     }
//     public static void main(String[] args) throws IOException{
//         Method_2 obj = new Method_2();
//         obj.Details();
//     }
// }

// EXAMPLE 4-->

// class Method_1{
//      Integer Division()throws IOException{
//         BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter first number:");
//         int r = Integer.parseInt(rs.readLine());

//         System.out.println("Enter second number:");
//         int s = Integer.parseInt(rs.readLine());

//         int div = r/s;
//         return div;

//     }
//     public static void main(String[] args)throws IOException{
//         Method_1 obj = new Method_1();
//         obj.Division();
//     }
// }

class Method_2{
    Integer Multiplication()throws  IOException{
        BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        int a = Integer.parseInt(sr.readLine());

        System.out.println("Enter second number:");
        int b = Integer.parseInt(sr.readLine());

        int mul = a*b;
        return mul;
    }
    public static void main(String[] args)throws IOException{
        Method_2 obj = new Method_2();
        obj.Multiplication();
    }
}