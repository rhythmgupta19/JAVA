// "Super" is a keyword in java which is used inside a child class to access parent class members-variable,method and constructor.


// Example 1: Accessing parent class variable using super keyword
// class Parent{
//     void disp1(){
//         System.out.println("p1");
//     }
//     void disp2(){
//         System.out.println("p2");
//     }
//     void disp3(){
//         System.out.println("p3");
//     }
//     void disp4(){
//         System.out.println("p4");
//     }
// }
//     class child extends Parent{
//         void show(){
//             super.disp1();
//             super.disp2();
//             super.disp3();
//             super.disp4();
//         }
//     }
//     public class SuperClass{
//         public static void main(String[] args){
//             child c = new child();
//             c.show();
//         }
//     }


// Example 2: Accessing parent class constructor using super keyword
// abstract class Parent{
//     String name;
//     String address;

//     Parent(String name,String address){
//         this.name = name;
//         this.address = address;    // local = Instance
//     }
// }

// class child extends Parent{
//     int rollNo;
//     child(String name,String address,int rollNo){
//         super(name,address);
//         this.rollNo = rollNo;
//     }
// }

// public class Sample{
//     public static void main(String[] args){
//         child c = new child("Rhythm","Bhopal",213);
//         System.out.println("Name:"+ c.name);
//         System.out.println("Address:"+ c.address);
//         System.out.println("Roll No:"+ c.rollNo);
//     }
// }


// Example 3: Accessing parent class method using super keyword

// abstract class College{
//     String teacher;
//     String student;

//     College(String teacher, String student){
//         this.teacher = teacher;
//         this.student = student;
//     }

//     void display(){
//         System.out.println("Teachers: " + teacher);
//         System.out.println("Students: " + student);
//     }
// }

// class Department extends College{
//     String DepartmentName;

//     Department(String teacher, String student, String DepartmentName){
//         super(teacher, student);
//         this.DepartmentName = DepartmentName;
//     }
// }
// public class Sample{
//     public static void main(String[] args){
//         Department d = new Department("Rhythm", "Saranshi", "Computer Science");
//         d.display();
//     }
// }


// Example 4: Accessing parent class variable using super keyword
// class Parent{
//     int x = 10;
// }
// class child extends Parent{
//     int x = 20;
//     void Show(){
//         System.out.println("Value of x in child class: " + x);
//         System.out.println("Value of x in parent class: " + super.x);
//     }
// }
// public class Sample{
//     public static void main(String[] args){
//         child c = new child();
//         c.Show();
//     }
// }


// Example 5: Accessing parent class method using super keyword
// class parent{
//     void greet(){
//         System.out.println("Hello from parent class");
//     }
// }
// class child extends parent{
//     void greet(){
//         System.out.println("Hello from child class");
//     }
//     void CallParent(){
//         super.greet();
//     }
// }
// public class Sample{
//     public static void main(String[] args){
//         child c = new child();
//         c.CallParent();
//     }
// }


// Example 6: Using super to resolve naming conflicts between parent and child class
// class parent{
//     int num = 100;
// }
// class child extends parent{
//     int num = 200;
//     void show(){
//         System.out.println("Value of num in child class: " + num);
//         System.out.println("Value of num in parent class: " + super.num);
//     }
// }
// public class Sample{
//      public static void main(String[] args){
//         child c = new child();  
//         c.show();
//      }
// }