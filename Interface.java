// An "Interface" is a blueprint of behavior. It tells a class what methods it must have.
// Variable in interface are public static final.
// methods are public abstract by default.
// Cannot create object of an interface.
// A class uses implements instead of extends.

// Example-->1
// interface Calculator{
//     double add (double a, double b);
//     double sub(double a, double b);
//     double mul(double a, double b);
//     double div(double a, double b);
// }

// class TestCalculator implements Calculator{
//     public double add(double a, double b){
//         return a+b;
//     }
    
//     public double sub(double a, double b){
//         return a-b;
//     }
//     public double mul(double a, double b){
//         return a*b;
//     }
//     public double div(double a, double b){
//         if(b==0){
//             try{
//                 System.out.println(a/b);
//             }
//         catch( ArithmeticException e){
//             System.err.println("The value of b is zero!!");
//             }
//         }
//         return a/b;
//     }
// }

// public class Interface{
//     public static void main(String[] args){
//         TestCalculator tc = new TestCalculator();
//     }
// }

                                         // Name Clash
// Case-->1  Two interface have same method name,implementation for a single method is valid for both.

// interface Demo1{
//     void m1();
// }
// interface Demo2{
//     void m1();
// }
// class Test implements Demo1,Demo2{          // Multiple inheritance is supported in java with the help of interface not by java.
//     public void m1(){
//         System.out.println("Hi,I am method 1.");
//     }
// }
// public class Interface{
//     public static void main(String[] args){
//         Test t1 = new Test();
//         t1.m1();
//     }
// }


// Case-->2 "This code demonstrates a class successfully implementing multiple interfaces by overloading a method name with different parameter signatures,
//  showcasing how Java resolves method naming conflicts through signature differentiation."

// interface Demo1{
//     void m1();
// }
// interface Demo2{
//     int m1(int x);
// }
// class Test implements Demo1,Demo2{
//     public void m1(){
//         System.out.println("Hi I'm Demo1");
//     }
//     public int m1(int x){
//         System.out.println("Hi,I'm Demo2");
//         return 10;
//     }
// }
// public class Interface{
//     public static void main(String[] args){
//         Test t1 = new Test();
//         t1.m1();
//         t1.m1(10);
//     }
// }


// Case-->3 "This code illustrates that while multiple inheritance of interfaces can lead to variable name collisions, 
// Java resolves this ambiguity by requiring explicit static access via the interface name, while also demonstrating the use of implicit
//  'public static final' modifiers for interface members."

// interface Demo1{
//     int x = 19;   // Implicit Modifiers: In Java, every variable declared in an interface is
                 // automatically "Public Static Final". They aren't just variables; they are
                // constants.
// }
// interface Demo2{
//     int x = 01;
// }
// class Test implements Demo1,Demo2{
// }
// public class Interface{
//     public static void main(String[] args) {
//         Test t = new Test();
//         System.out.println(Demo1.x);
//         System.out.println(Demo2.x);
//     }
// }