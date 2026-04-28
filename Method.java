// Without parameters without return type
import java.io.*;
import java.util.*;

//  class Method{
//     public void Add()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number");
//         int num1 = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number");
//         int num2 = Integer.parseInt(br.readLine());

//         int sum = num1+num2;
//         System.out.println(sum);
//     }
//     public static void main(String[] args)throws IOException{
//       Method m1 = new Method();
//       m1.Add();
//     }
//  }

// 2...
// class Method{
//   public void Details()throws IOException{
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     System.out.println("Enter your name");
//     String name = br.readLine();

//     System.out.println("Enter your age:");
//     int age = Integer.parseInt(br.readLine());

//     System.out.println("Enter your address");
//     String add = br.readLine();

//     System.out.println("Enter your college name:");
//     String college = br.readLine();

//     System.out.println("Enter your martial status");
//     String Status = br.readLine();
//     System.out.println(age);
//     System.out.println(name);
//     System.out.println(add);
//     System.out.println(college);
//   }
//   public static void main(String[] args)throws IOException{
//     Method obj = new Method();
//     obj.Details();
//   }
// }

// 3.. 
// class Method{
//     public void greet()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your message:");
//         String message = br.readLine();
//         System.out.println("Greet: "+ message);
//     }
//     public static void main(String[] args)throws IOException{
//         Method m1 = new Method();
//         m1.greet();
//     }
// }

// 4.. 
// class Method{
//     public void Division()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter first number:");
//         int num1 = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number:");
//         int num2 = Integer.parseInt(br.readLine());

//         int div = num1/num2;
//         System.out.println(div);
//     }
//     public static void main(String[] args)throws IOException{
//         Method m1 = new Method();
//         m1.Division();
//     }
// }

// Without parameters with return types.
// class Method{
//     float Add()throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter first number:");
//        int num1 = Integer.parseInt(br.readLine());

//        System.out.println("Enter second number:");
//        int num2 = Integer.parseInt(br.readLine());

//        int sum = num1+num2;
//        System.out.println(sum);

//        return sum;

//     }
//     public static void main(String[] args)throws IOException{
//         Method m1 = new Method();
//         m1.Add();
//     }
// }

// class Method{
//     String Greet()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a message");
//         String message = br.readLine();
//         System.out.println(message);
//         return message;
//     }
//     public static void main(String[] args)throws IOException{
//         Method obj = new Method();
//         obj.Greet();
//     }
// }

// class Method{
//     String Details()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your name:");
//         String name = br.readLine();

//         System.out.println("Enter your age");
//         int age = Integer.parseInt(br.readLine());

//         System.out.println("Enter your college name");
//         String college = br.readLine();

//         System.out.println("Enter your address");
//         String address = br.readLine();

//         String Detail = ("name " + name + ",Address "+ address + ",Age "+age +",College "+college);
//         System.out.println(Detail);
//         return Detail;
//     }
//     public static void main(String args[])throws IOException{
//         Method m = new Method();
//         m.Details();
//     }
// }

// class Method{
//     public double Multi()throws IOException{
//         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter first number:");
//         int a = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number");
//         float b = Float.parseFloat(br.readLine());

//         System.out.println("Enter third number");
//         double c = Double.parseDouble(br.readLine());

//         double mul = a*b*c;
//         System.out.println(mul);
//         return mul;
//     }
//     public static void main(String[] args)throws IOException{
//         Method m = new Method();
//         m.Multi();
//     }
// }

// With parameters without return types

// class Method{
//     static void Details(String name,int age,char grade){
//         System.out.println("Name "+name);
//         System.out.println("Age "+age);
//         System.out.println("Grade "+grade);
//     }
//     public static void main(String[] args){
//         String name = "Rhtyhm";
//         int age = 19;
//         char grade = 'A';
//     }
// }

// class Method{
//     static void Multiplication(int a,float b,double c){
//         double mul = a*b*c*10;
//         System.out.println(mul);
//     }
//     public static void main(String[]args){
//         int a = 18;
//         float b = 345.90f;
//         double c = 456.897;
//     }
// }

// With parameters with return type

// public class Method{
//     static String name(String r){
//         return r;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name");
//         String r = sc.nextLine();
//         System.out.println(name(r));
//     }
// }

public class Method{
    static double Div(float s,float r){
        double div = s/r;
        System.out.println(div);
        return div;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        float s = Float.parseFloat(br.readLine());

        System.out.println("Enter second number:");
        float r = Float.parseFloat(br.readLine());
        
    }
}