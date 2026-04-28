// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Number {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a number:");
//         int a = Integer.parseInt(br.readLine());
//         if (a >= 0) {
//             System.out.println("Positive");
//         } else {
//             System.out.println("Negative");
//         }
//     }
// }


// import java.util.Scanner;
// public class Statement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number:");
//         int num = sc.nextInt();

//         if(num % 2 == 0){
//             System.out.println("Even Number");
//         }
//         else{
//             System.out.println("Odd Number");
//         }
//     }
// }


// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Check{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a number:");
//         int num = Integer.parseInt(br.readLine());

//         if(num % 5 == 0){
//             System.out.println("The number is divisible by 5");
//         }
//         else{
//             System.out.println("The number is not divisible by 5");
//         }
//     }
// }


// import java.util.Scanner;
// public class Year{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year");
//         int year = sc.nextInt();

//         if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//                 System.out.println(year + " " + "Leap year");
//         }
//         else{
//             System.out.println(year + " " + "Not a leap year");
//         }
//     }
// }


// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Largest{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter first number");
//         int num1 = Integer.parseInt(br.readLine());

//         System.out.println("Enter second number:");
//         int num2 = Integer.parseInt(br.readLine());

//         if(num1>num2){
//             System.out.println("First number is greater.");
//         }
//         else if(num2>num1){
//             System.out.println("Second number is greater.");
//         }
//         else{
//             System.out.println("Both numbers are equal");
//         }
//     }
// }


// import java.util.Scanner;
// public class Largest{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int num1 = sc.nextInt();
//         System.out.println("Enter second number:");
//         int num2 = sc.nextInt();
//         System.out.println("Enter third number:");
//         int num3 = sc.nextInt();

//         if(num1>num2 && num1 > num3){
//             System.out.println("First number is greater");
//         }
//         else if(num2 > num1 & num2 > num3){
//             System.out.println("Second number is greater:");
//         }
//         else if(num3>num1 & num3 > num2){
//             System.out.println("Third number is greater");
//         }
//         else{
//             System.out.println("Numbers are equal:");
//         }
//     }
// }


// import java.util.Scanner;
// public class Alphabet{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character");
//         char ch = sc.next().charAt(0);

//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
//         'A' || ch == 'E' || ch == 'I'
//         || ch == 'O' || ch == 'U') {
//             System.out.println("It is an vowel");
//          }
//          else{
//             System.out.println("It is a constant");
//          }
//     }
// }


// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// public class Div{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a number:");
//         int num = Integer.parseInt(br.readLine());

//         if(num % 5 == 0 & num % 7 == 0){
//             System.out.println("The number is divisible by both 7 and 5");
//         }
//         else{
//             System.out.println("Not divide by 7 & 5");
//         }
//     }
// }


// import java.util.Scanner;
// public class Practice5{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();

//         if(num > 0 & num < 50 ){
//             System.out.println("Number is btw 0 & 50");
//         }
//         else{
//             System.out.println("Number is not lies btw 0 & 50");
//         }
//     }
// }


// abstract class Animal{
//     abstract void sound();
//     void sleep(){
//         System.out.println("Animal is sleeping");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal{
//     void sound(){
//         System.out.println("Cat meows");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Dog d = new Dog();
//         d.sound();
//         d.sleep();

//         Cat c = new Cat();
//         c.sound();
//         c.sleep();
//     }
// }


// abstract class Parent{
//     public Parent(){
//         System.out.println("Parent class Constructor");
//     }
//     abstract void m1();
//     abstract void m2();
// }
// abstract class Child extends Parent{
//     public Child(){
//         System.out.println("Child Class Constructor");
//     }
//     void m1(){
//         System.out.println("m1 method implemented.");
//     }
//     void m2(){
//         System.out.println("m2 method implemented");
//     }
// }

// class Child2 extends Child{
//     public Child2(){
//         System.out.println("Child2 constructor called.");
//     }
//     void m2(){
//         System.err.println("m2 method implemented.");
//     }
// }

// public class Abstract{
//     public static void main(String[] args){
//         Child2 ch = new Child2();
//         ch.m1();
//         ch.m2();
//     }
// }


// abstract class Vehicle{
//     abstract void start();
//     abstract void stop();
// }
// class Car extends Vehicle{
//     void start(){
//         System.err.println("Car started");
//     }
//     void stop(){
//         System.err.println("Car stopped");
//     }
// }
// class Bike extends Vehicle{
//     void start() {
//         System.err.println("Bike started");
//     }

//     void stop() {
//         System.err.println("Bike stopped");
//     }
// }
// class Abstract{
//     public static void main(String[] args){
//         Car c = new Car();
//         c.start();
//         c.stop();

//         Bike b = new Bike();
//         b.start();
//         b.stop();
//     }
// }


// Qn-->1 A parent class has an instance variable x. The child class also declares an instance variable with the same name x. Both classes have
// constructors that print the value of x. An object of the child class is created using a parent class reference. What values will be printed during
// object creation and when x is accessed later, and why does method overriding  not apply to instance variables in this scenario?

// class Parent{
//     int x = 10;
//     public Parent(){
//         System.out.println("The value of x is:" + x);
//     }
// }
// class Child extends Parent{
//     int x = 20;
//     public Child(){
//         super(); 
//         System.err.println("The value of x is:"+x);
//     }
// }
// public class Abstract{
//     public static void main(String[] args){
//         Parent p = new Child();
//         System.out.println("Accessing x using parent class reference:" + p.x);
//         System.out.println("Accessing x using child class reference:"+((Child)p).x);
//         System.out.println("Accessing x using super keyword in child class:"+ new Child().x);
//     } 
// }


// Qn-->2. A parent class contains a static variable that is incremented inside its constructor.A child class extends it and has its own constructor without modifying the
// static variable. If multiple child objects are created,how many times will the static variable be incremented and which constructors are responsible for modifying it.

// public class Abstract{
//     static int count = 0;
//     public Abstract(){
//         count ++;
//         System.err.println("Parent class Constructor called"+ count);
//     }
//     static class Child extends Abstract{
//         public Child(){
//         System.out.println("Child class Constructor called"+ count);
//         }
//     }
//     public static void main(String[] args){
//         System.out.println("Creating first child object");
//         Child c1 = new Child();
//         System.out.println("Creating second child object");
//         Child c2 = new Child();
//         System.out.println("Creating third child object");
//         Child c3 = new Child();
//         System.out.println("Creating fourth child object");
//         Child c4 = new Child();
//         System.out.println("Creating fifth child object");
//         Child c5 = new Child();
//         System.out.println("Creating sixth child object");
//         Child c6 = new Child();

//         System.out.println("FInal count value:" + Abstract.count);
//         System.out.println("Final count value:" + Child.count);
//     }
// }

// Qn--> 3. An abstract class has instance variables, a constructor, one abstract method, and one concrete method.
// You create an array of references of this abstract class and store objects of different child classes in it.
// When and how many times is the abstract class constructor called,and can it initialize variables that are later used by overridden methods in
// child classes?

 abstract class Parent{
    int x = 10;
    public Parent(){
        System.out.println("Parent class Constructor");
    }
    public void Rhtyhm(){
        System.out.println("Rhythm class");
    }
    abstract child(
}