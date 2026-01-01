// WITHOUT PARAMETERS WITHOUT RETURN TYPE:
// a-> Number of parameter must br zero.
// b-> Return type must be void.
//c_> Input must be a valid Java method with no parameters and void return type.

                                                // EXAMPLE -->
// EXAMPLE 1-->

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Method_1{
    public void add() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter second number:");
        int b = Integer.parseInt(br.readLine());

        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) throws IOException {
        Method_1 obj = new Method_1();
        obj.add();
    }
}


// EXAMPLE 2-->

// class Method_1{
//     public void greet()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter message to greet:");
//         String message = br.readLine();
//         System.out.println("Greet:" + message);
//     }
//     public static void main(String[] args)throws IOException{
//         Method_1 obj = new Method_1();
//         obj.greet();
//     }    
// }
// In the above example, the method 'greet' does not take any parameters and has a void return type. It reads a message from the user and prints a greeting message.


// EXAMPLE 3-->

// class Method_1{
//     public void Details() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your name:");
//         String name = br.readLine();
//         System.out.println("Enter your age:");
//         int age = Integer.parseInt(br.readLine());
//         System.out.println("Enter your city:");
//         String city = br.readLine();
//         System.out.println("Enter your college name:");
//         String college = br.readLine();
//         System.out.println("Enter your identification number:");
//         String id = br.readLine();
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("City: " + city);
//         System.out.println("College: " + college);
//         System.out.println("ID: " + id);

//     }
//     public static void main(String[] args)throws IOException{
//         Method_1 obj = new Method_1();
//         obj.Details();
//     }
// }

// EXAMPLE 4-->

// class Method_1{
//     public void Division() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter first number:");
//         int r = Integer .parseInt(br.readLine());

//         System.out.println("Enter second number:");
//         int s = Integer.parseInt(br.readLine());

//         int div = r/s;
//         System.out.println("Division" + div);
    
//     }
//     public static void main(String[] args) throws IOException{
//         Method_1 obj = new Method_1();
//         obj.Division();
//     }
// }









