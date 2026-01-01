// Methods having same name but change in implementation.
// rule1-->Inheritance compulsory.
// rule2-->Method signature same with return type.
// rule3-->Scope of parent method should be same or lower.
// rule4--> Access level cannot be more restrictive.
// rule5--> Happens at runtime(Dynamic restrictive).
// rule6--> Co-variant return type-->Parent to child.

// Private method cannot br overridden.
// Public method can be overridden.
// When overriding,you cannot reduce visibility.

// Example--> 1
// class Demo{
//     protected void m1(){
//         System.out.println("Hello Rhythm");
//     }
// }

// class Test extends Demo{
//     public void m1(){
//         System.out.println("Hi Rhythm");
//     }
// }

// public class Example{
//     public static void main(String[] args){

//         Demo d1 = new Demo();
//         d1.m1();

//         Test t1 = new Test();
//         t1.m1();
//         }
// }


// Example-->2  Simple & Classic
// class Animal{
//     void sound(){
//         System.out.println("Animals makes a sound");
//     }
// }

// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }

// public class test{
//     public static void main(String[] args){
        // Animal a1 = new Animal();
        // a1.sound();

        // Dog d1 = new Dog();
        // d1.sound();

//         Animal a = new Dog();
//         a.sound();
//     }
// }


// Example-->3  Vehicle speed
// class Vehicle{
//     void speed(){
//         System.out.println("Vehicle has average speed");
//     }
// }

// class Bike extends Vehicle{
//     void speed(){
//         System.out.println("Bike speed is 80 km/h");
//     }
// }

// public class test{
//     public static void main(String[] args){
//         Vehicle v = new Vehicle();
//         v.speed();

//         Bike b = new Bike();
//         b.speed();
//     }
// }


// Example--> 3 Bank Interest
// class Bank{
//     float getRateOfInterest(){
//         return 5.0f;
//     }
// }

// class SBI extends Bank{
//     float getRateOfInterest(){
//         return 6.5f;
//     }
// }

// class UBI extends SBI{
//     float getRateOfInterest(){
//         return 7.5f;
//     }
// }

// public class test{
//     public static void main(String[] args){
//         Bank b = new SBI();
//         SBI s = new UBI();
//     }
// }


// Example-->4 Shape Area

// class Shape{
//     void draw(){
//         System.out.println("Drawing Shape");
//     }
// }

// class Circle extends Shape{
//     void draw(){
//         System.out.println("Drawing Circle");
//     }
// }

// class Square extends Circle{
//     void draw(){
//         System.out.println("Drawing Square");
//     }
// }

// public class test{
//     public static void main(String[] args){
//         Shape s = new Shape();
//         s.draw();

//         Circle c = new Circle();
//         c.draw();

//         Square r = new Square();
//         r.draw();
//     }
// }

// Example-->5 college

// class College{
//         public void Attendance(){
//                 System.out.println("Attendance mote than 70% is compulsory");
//         }
// }
//  class Faculty extends College{
//         public void Attendance(){
//                 System.out.println("permanent Attendance is also compulsory for faculty ");
//         }
// }
// class Student extends Faculty{
//         public void Attendance(){
//                 System.out.println("Student struggle to much to complete their attendance");
//         }
// }

// public class test{
//         public static void main(String[] args){
//                 Faculty f = new Student();
//                 College c = new Faculty();
//                 c.Attendance();
//                 f.Attendance();
//         }
// }

// Example-->6 Protected --> public (Visibility increased).

class Parent{
        protected void display(){
                System.out.println("Parent Display");
        }
}

class child extends Parent{
        public void display(){
                System.out.println("Child Display");
        }
}

public class test{
        public static void main(String[] args){
                Parent p = new child();
                p.display();
        }
}