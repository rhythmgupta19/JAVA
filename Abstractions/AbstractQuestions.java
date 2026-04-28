// class and methods can be "abstract".
// An abstract methods must be inside a abstract class [Strictly compulsory].
// An abstract class can hold both abstract and non-abstract methods.
// We cannot create the object of an abstract class.


// Example-->1 In this case both methods inside parent class are abstract methods for which child classes are providing implementation.
// In this example we are also demonstrating the constructor call order in case of multilevel inheritance with abstract classes.

// abstract class Parent{                  // Constructor for Parent class
//     public Parent(){
//         System.out.println("Parent constructor called");
//     }
    
//     abstract void m1();
//     abstract void m2();
// }

// abstract class Child1 extends Parent{                // In this case m1() method is implemented and m2() method is still abstract.
//     public Child1(){                   // Constructor for Child1 class
//         System.out.println("Child1 constructor called");
//     }
//     void m1(){
//         System.out.println("m1method implemented in child class");
//     }
// }
// class Child2 extends Child1{           // because in child1 class m2() method is still abstract so child2 class is providing implementation of m2() method.
//     public Child2(){                   // Constructor for Child2 class
//         System.out.println("Child2 constructor called");
//     }
//     void m2(){
//         System.out.println("m2 method implemented in child class");
//     }
// }

// public class AbstractQuestions{
//     public static void main(String[] args){
//         Child2 c2 = new Child2();
//         c2.m1();
//         c2.m2();
//     }
// }


// Example-->2  In this example we are demonstrating abstract class with non-abstract methods.
// abstract class Animal{
//     abstract void sound();
//     void sleep(){
//         System.out.println("Animal is sleeping.");
//     }
// }

// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks.");
//     }
// }

// class Cat extends Animal{
//     void sound(){
//         System.out.println("Cat meows.");
//     }
// }

// class main{
//     public static void main(String[] args){
//         Dog dog = new Dog();
//         dog.sound();
//         dog.sleep();

//         Cat cat = new Cat();
//         cat.sound();
//         cat.sleep();
//     }
// }

// Example-->3  In this example we are demonstrating that we cannot create the object of an abstract class.
// abstract class Shape{
//     abstract void draw();
// }   
// class Circle extends Shape{
//     void draw(){
//         System.out.println("Drawing a circle.");
//     }
// }
// class main{
//     public static void main(String[] args){
        // Shape shape = new Shape();           // This line would cause a compilation error because we cannot instantiate an abstract class.
//         Circle circle = new Circle();
//         circle.draw();
//     }
// }


// Example-->4  
// abstract class Vehicle{
//     abstract void start();
//     abstract void stop();
// }

// class Car extends Vehicle{
//     void start(){
//         System.out.println("Car Started.");
//     }
//     void stop(){
//         System.out.println("Car Stopped.");
//     }
// }
// class Bike extends Vehicle{
//     void start(){
//         System.out.println("Bike Started.");
//     }
//     void stop(){
//         System.out.println("Bike Stopped.");
//     }
// }
// class Abstract{
//     public static void main(String[] args){
//         Car car = new Car();
//         car.start();
//         car.stop();
//         Bike bike = new Bike();
//         bike.start();
//         bike.stop();
//     }
// }

// Qn-->1 A parent class has an instance variable x. The child class also declares an instance variable with the same name x. Both classes have
// constructors that print the value of x. An object of the child class is created using a parent class reference. What values will be printed during
// object creation and when x is accessed later, and why does method overriding  not apply to instance variables in this scenario?

// class Code{
//         int x = 10;
//         public Code(){
//                 System.out.println("Abstract class constructor called");
//                 System.out.println(this.x);
//         }

//         static class child extends Code{
//                 int x = 20;
//                 public child(){
//                         super();
//                         System.out.println("Child class Constructor called");
//                         System.out.println(this.x);
//                 }
//         }
//         public static void main(String[] args){
//                 System.out.println("Creating child class object with the help of parent class reference.");
//                 Code obj = new child();
//                 System.out.println("Accessing x using parent class reference: " + obj.x);
//                 System.out.println("Accessing x using child class reference: " + ((child)obj).x);
//                 System.out.println("Accessing x using super keyword in child class: " + new child().x);
//         }
// }

// Why these values are printed during object creation -->
// Object
// creation in  Java happens top-down:
// Memory for Child object is allocated (it contains both Parent and Child parts) Parent constructor runs first It prints Parent’s x → 10
// Child constructor runs next  It prints Child’s x → 20  Each constructor accesses its own class’s variable, not the other one.



// Qn-->2. A parent class contains a static variable that is incremented inside its constructor. 
// A child class extends it and has its own constructor without modifying the static variable. If multiple child objects are created,
//  how many times will the static variable be incremented and which constructors are responsible for modifying it.

// public class Parent{
//         static int count = 0;
//         public Parent(){
//                 count ++;
//                 System.out.println("Parent class constructor called. Count: " + count);
//         }
//         static class Child extends Parent{
//                 public Child(){
//                         System.out.println("Child class constructor called.");
//                 }
//         }
//         public static void main(String[] args){
//                 System.out.println("Creating first child class object.");
//                 Child c1 = new Child();
//                 System.out.println("Creating second child class object.");
//                 Child c2 = new Child();
//                 System.out.println("Creating third child class object.");
//                 Child c3 = new Child();
//                 System.out.println("Creating fourth child class object.");
//                 Child c4 = new Child();
//                 System.out.println("Final count value: " + Parent.count); // we can access static variable using class name also.
//                 System.out.println("Final count value using child class: " + Child.count); // we can access static variable using child class also.
        // }
// }
// We can see that the static variable 'count' is incremented each time a Child object is created because the Parent constructor is called during the instantiation of each Child object.
//  The final value of 'count' will depend on the total number of Child objects created.



//Qn--> 3. An abstract class has instance variables, a constructor, one abstract method, and one concrete method.
//  You create an array of references of this abstract class and store objects of different child classes in it. 
// When and how many times is the abstract class constructor called, 
// and can it initialize variables that are later used by overridden methods in child classes?

 abstract class Vehicle{
        int speed;                               // instance variable

        Vehicle(){                                                // Constructor
                System.out.println("Vehicle constructor called.");
        }

        abstract void start();                            // Abstract method

        void displaySpeed(){                             // Concrete method
                System.out.println("Speed:" + speed);
        }

        static class Bike extends Vehicle{
                Bike(){                         // Constructor
                        System.out.println("Bike constructor called.");
                }

                void start(){  // Implementing abstract method
                        System.out.println("Bike is running." + speed);
                }
        }

        static class car extends Vehicle{
                car(){     // Constructor
                        System.out.println("Car constructor called.");
                }
                void start(){  // Implementing abstract method
                        System.out.println("Car is running." + speed);
                }       
        }
        public class Test{
                public static void main(String[] args) {
                        Vehicle[] vehicles = new Vehicle[2];

                        vehicles[0] = new Bike();  // constructor chain happen here
                        vehicles[1] = new car();   // constructor chain happen here
// Square brackets [] are used to declare and access arrays, which store multiple 
// references of the same type, enabling indexed access and polymorphism.
// If you see [], think collection of references, not object.

                        for (Vehicle v : vehicles) {A                                                                                                
                                v.start(); 
                                v.displaySpeed();
                        }
                }
        }
}

// ANS--> The abstract class constructor is invoked every time a subclass object
// is created; therefore, it is called as many times as the number of subclass
// objects instantiated. In this case, since we create two objects (one of Bike and one of Car),
// the Vehicle constructor is called twice.


// Qn--> 4 An abstract class declares an abstract method calculate(int x) and also defines an overloaded concrete method calculate(double x). 
// A child class implements only one of these methods. Will the child class be abstract or concrete, 
// and which method will be called when passing an integer value and a decimal value?

// abstract class Calculator{
//         abstract void calculate(int x); // Abstract method
//         void calculate(double x){
//                 System.out.println("Calculating with double:"+x);
//         }
//         static class AdvanceCalculator extends Calculator{       // Abstract method always define inside child class.
//                 void calculate(int x){                    // Implementing abstract method       
//                         System.out.println("Calculating with int:"+x);
//                 }
//         }
//                 public static void main(String[] args) {
//                         AdvanceCalculator c1 = new AdvanceCalculator();  
//                         c1.calculate(10);    
//                         c1.calculate(19.5);
//                 }  
// }

// Qn-->5 A parent class and a child class both define a static method display(int x). The child class additionally overloads it with display(double x). 
// If a parent class reference holds a child object and display(10) is called, which method executes and why is this considered method hiding rather than method overriding?

// class Parent{
//         static void display(int x){
//                 System.out.println("Static method is called" + x);
//         }

//         static class child extends Parent{

//                 static void display(int x){   // This not override - it hides
//                         System.out.println("Child display(int)"+x);
//                 }
//                 static void display(double x){     // Overloaded method
//                         System.out.println("child display double:"+ x);
//                 } 
//         }
//         public class AbstractionQuestions{
//                 public static void main(String[] args){
//                         Parent p = new child(); // Parent class reference holding child class object
//                         // Parent p = new Parent().new child();
//                         // child is an inner class, so we need to create its instance using an instance of the outer class (Parent).
//                         // Alternatively, we could make the child class static to avoid this requirement.

//                         p.display(10); // Which one?
//                         child.display(10); // Direct child call
//                         child.display(10.5); //
//                 }
//         }
// }


// Qn--> 6 10. A parent class has only a parameterized constructor. The child class defines multiple overloaded constructors. 
// What happens if the child constructors do not explicitly call super()? How does Java decide which constructor is executed first during object creation?

// class Parent{
//         Parent(int age){
//                 System.out.println("Parent class parameterized constructor called. Age: " + age);
//         }
//         static class child extends Parent {
//               child(){
//                 super(20); // Explicitly calling parent constructor
//                 System.out.println("Child class default constructor called.");
//               }  
//               child(int y){
//                 super(y); // Explicitly calling parent constructor
//                 System.out.println("Child class parameterized constructor called. Y: " + y);
//               }
//         }
//         public static void main(String[] args){
//                 System.out.println("Creating child class object using default constructor.");
//                 child c1 = new child();
//                 System.out.println("Creating child class object using parameterized constructor.");
//                 child c2 = new child(30);
//         }
// }