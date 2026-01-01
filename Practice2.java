               //Hello world

// public class Practice2 {
//     public static void main(String[] args){
//         System.out.println("Hello World");
//     }
    
// }


              // Two sum

// public class Practice2{
//     public static void main(String[] args){
//         int a = 12;
//         int b = 23;
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }


                // Three Multiply/sum 

// public class Practice2{
//     public static void main(String[] args){
//         float a = 23.54f;
//         float b = 34.98f;
//         float c = 45.87f;

//         float multiply = a*b*c;
//         int add a+b+c;
//         System.out.println(multiply);
//         System,out,println(add);

//     }
// }


//               Double divide

// public class Practice2{
//     public static void main(String[] args){
//         double r = 34.45543;
//         double s = 333.399302;

//         double v = s/r;
//         System.out.println(v);
//     }
// }


                //    String

// public class Practice2{
//     public static void main(String[] args){
//         System.out.println(23*76+23-98/7);
//         System.out.println("Work hard today for your parents and yourself if you work hard today so you can live your next 50 years ");
//     }
// }


//                        Scanner class input

// import java.util.Scanner;
// public class Practice2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a = sc.nextInt();

//         System.out.println("Enter second number:");
//         int b = sc.nextInt();
        
//         System.out.println("Enter third number:");
//         int c = sc.nextInt();

//         int sum = a+b+c;
//         int multiply = a*b*c;
//         int divide = b/c;

//         System.out.println(sum);
//         System.out.println(multiply);
//         System.out.println(divide);
//     }
// }


//                    Scanner class input

// import java.util.Scanner;
// public class Practice2{
//     public static void main(String[] args){
//         Scanner rs = new Scanner(System.in);
//         System.out.println("enter message:");
//         String message  = rs.nextLine();

//         System.out.println("Enter floating point number:");
//         float r = rs.nextFloat();

//         System.out.println("Enter double number:");
//         double s = rs.nextDouble();

//         System.out.println(s);
//         System.out.println(r);
//         System.out.println(message);
//     }    
// }


//                  BufferedReader Input

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice2{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first integer number:");
//         int  x = Integer.parseInt(br.readLine());

//         System.out.println("Enter second integer number:");
//         int y = Integer.parseInt(br.readLine());

//         int sum  = x+y;
//         int sub = x-y;
//         int multiply = x*y;
//         int divide = x/y;

//         System.out.println(sum);
//         System.out.println(sub);
//         System.out.println(multiply);
//         System.out.println(divide);

//         System.out.println("Enter floating point number:");
//         float r =Float.parseFloat(br.readLine());

//         System.out.println("Enter second floating point number:");
//         float v = Float.parseFloat(br.readLine());

//         float add = r + v;
//         float diff = r - v;       
//         float product = r * v;
//         float div = r / v;

//         System.out.println(add);
//         System.out.println(diff);
//         System.out.println(product);
//         System.out.println(div);

//         System.out.println("Enter your message");
//         String message = (br.readLine());
//         System.out.println(message);

//     }
// }


                // WITHOUT PARAMETER WITHOUT RETURN VALUE
// EXAMPLE--> 1
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice2{
//     void add() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number");
//         double r = Double.parseDouble(br.readLine());

//         System.out.println("Enter second number:");
//         double v = Double.parseDouble(br.readLine());

//         double sum = r+v;
//         System.out.println(sum);
//     }
//     public static void main(String[] args)throws IOException {
//         Practice2 obj = new Practice2();
//         obj.add();

//     }
// }


// EXAMPLE-->2
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice2{
//     void Details() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter your name:");
//         String name = br.readLine();

//         System.out.println("Enter your age:");
//         int age = Integer.parseInt(br.readLine());
        
//         System.out.println("Enter tour address:");
//         String address = br.readLine();

//         System.out.println("Enter your college name:");
//         String college = br.readLine();

//         System.out.println("Enter which graduation you have done:");
//         String Graduation = br.readLine();

//         System.out.println("Enter your college id");
//         int id = Integer.parseInt(br.readLine());
//     }
//     public static void main(String[] args)throws IOException{
//         Practice2 obj = new Practice2();
//         obj.Details();
//     }
// }


                    // WITHOUT PARAMETER WITH RETURN VALUE

// EXAMPLE-->1

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice2{
//      int Add() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number:");
//         int a = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number:");
//         int  b = Integer.parseInt(br.readLine());

//         int sum = a+b;
//         return sum;
//     }
//         public static void main(String[] args)throws IOException{
//             Practice2 obj = new Practice2();
//             obj.Add();
//         }

// }


// EXAMPLE-->2

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Practice2{
//     String Details() throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     System.out.println("enter your name:");
//     String name = br.readLine();

//     System.out.println("Enter your address");
//     String add = br.readLine();

//     System.out.println("Enter your thought:");
//     String thought = br.readLine();

//     return name;                               // Ak baar me ak hi value return kra sakte hai either name,add or thought.
//     }
//     public static void main(String[] args)throws IOException{
//         Practice2 obj = new Practice2();
//         obj.Details();
//     }
// }


                    // WITH PARAMETER WITHOUT RETURN VALUE

// public class Practice2{
//     static void Details(String name ,int age , char grade){
//         System.out.println("name" + name);
//         System.out.println("age" + age);
//         System.out.println("Grade" + grade);
//     }
// public static void main(String[] args){
//     String name = "rhythm";
//     int age = 19;
//     char grade = 'A';

//     Details(name,age,grade);
//     }
// }

// EXAMPLE-->2
public class Practice2{
    static void multiply(int a , int b){
        int multiply = a*b;
        System.out.println("multiply:" + multiply);
    }
    public static void main(String[] args){
        int a = 12;
        int b = 23;
        multiply(a,b);
    }
}