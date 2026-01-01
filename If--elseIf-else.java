// Qn --1: WAP to check whether a number is positive

// import java.util.Scanner;
// public class ConditionalStatement{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         if(num >0){
//             System.out.println("The number is positive.");
//         } 
//     }
// }
    

// Qn --2: WAP to check whether a number is even or odd.

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         if(num % 2 == 0){
//             System.out.println("The number is even.");
//         } 
//         else{
//             System.out.println("The number is odd.");
//         }
//     }
// }


// Qn-->3 WAP to check a person is eligible to vote or not.

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("nter your age:");
//         int age  =  sc.nextInt();

//         if(age > 18){
//             System.out.println("you are eligible to vote");
//         }
//         if(age<18){
//             System.out.println("you are not eligible to vote");
//         }
//     }
// }


// Qn-->4 WAP to check the grade of a student based on marks 

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your marks:");
//         float marks = sc.nextFloat();

//         if (marks >= 90){
//             System.out.println("Grade A");
//         }
//         else if (marks >= 75){
//             System.out.println("Grade B");
//         }
//         else if (marks >= 50){
//             System.out.println("Grade C");
//         }
//         else{
//             System.out.println("Fail"); 
//         }
//     }
// }


// Qn-->5 WAP to find the largest number from given numbers a,b,c.

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter three numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a >= b && a >= c){
//             System.out.println(a + " is the largest number.");
//         }
//         else if (b >= a && b >= c){
//             System.out.println(b + " is the largest number.");
//         }
//         else{
//             System.out.println(c + " is the largest number.");
//         }
        
//     }
// }


// Qn--> 6 Write a program to check whether a given number is positive or negative 

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num =sc.nextInt();

//         if (num>0){
//             System.out.println("Number is positive");
//         }
//         else{
//             System.out.println("Number is negative");
//         }
//     }
// }


// Qn-->7 WAP to check whether number is divisible by 5 or not

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] rags){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         double num = sc.nextDouble();

//         if (num % 5 == 0){
//             System.out.println("number is divisible by 5:");
//         }
//         else{
//             System.out.println("Not divisible by 5"); 
//         }
//     }
// }


// Qn-->8 WAP to check whether a given year is leep year or not.

// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[]rags){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a year:");
//         int year = sc.nextInt();

//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//             System.out.println(year + " is a leap year.");
//         }
//         else{
//             System.out.println(year + " is not a leap year.");
//         }
//     }
// }


// Q.n-->9 WAP a java program to find the largest of two numbers using if-else.
// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter numbers");
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         if(num1>num2){
//             System.out.println(num1 + "is larger");
//         }
//         else{
//             System.out.println(num2 + "is larger");
//         }
//     }
// }


// Qn--10  Write a Java program to find the *largest of three numbers.
// import java.util.Scanner;

// public class ConditionalStatement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter three numbers:");
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();
//         if (num1>num2 && num1>num3){
//             System.out.println(num1 + "is the largest number.");
//         }
//         else if(num2>num1 && num2>num3){
//             System.out.println(num2 + "is the largest number.");
//         }
//         else{
//             System.out.println(num3 + "is the largest number.");
//         }
//     }
// }


// Qn-->11Write a Java program to check whether a given character is a *vowel or constant.
// import java.util.Scanner;

// public class Alphabet {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character:");
//         char ch = sc.next().charAt(0);

//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//                 || ch == 'O' || ch == 'U') {
//             System.out.println(ch + " " + "is a vowel");
//         } else {
//             System.out.println(ch + " " + "is a constant");
//         }
//     }
// }

// Qn-->12 9. Write a Java program to check whether a given number is *a multiple os 3 or 7 both.

// import java.util.Scanner;

// public class Rhythm {
//     public static void main(String[] args){

//     Scanner sc = new Scanner(System.in);System.out.println("Enter a number:");
//     int num = sc.nextInt();

//     if(num%3==0&&num%7==0)
//     {
//         System.out.println("Number is multiple of 3 or 7.");
//     }else
//     {
//         System.out.println("Number is not a multiple of 3 or 7.");
//         }
//     }
// }

// Qn-->13 Write a Java program to check whether a given number lies *between 10 and 50*.
// import java.util.Scanner;

// public class Variation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         if (num >= 10 && num <= 50) {
//             System.out.println("Entered number is lie btw 10 and 50.");
//         } else {
//             System.out.println("Enter number is not lie btw 10 and 50.");
//         }
//     }
// }



// Qn--14  11. Write a Java program to check whether a student is *pass or fail* based on marks
// import java.util.Scanner;
// public class college{
//     void Student(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your marks:");
//         int marks = sc.nextInt();

//         if(marks>=27 && marks<= 70){
//             System.out.println("You are pass");
//         }
//         else{
//             System.out.println("you are fail");
//         }
//     }
//     public static void main(String[] args){
//         college obj = new college();
//         obj.Student();
//     }
// }



// Qn-->15  12. Write a Java program to display the *grade of a student* based on marks using if-else-if.
// import java.util.Scanner;

// public class college{
//     void Student(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your marks:");
//         int marks = sc.nextInt();

//         if(marks>=90 && marks <100){
//             System.out.println("Grade A");
//         }
//         else if (marks>= 75 && marks<90){
//             System.out.println("Grade B");
//         }
//         else if(marks>=50 && marks<75){
//             System.out.println("Grade C");
//         }
//         else if(marks>=22 && marks<50){
//             System.out.println("Grade D");
//         }
//         else{
//             System.out.println("try again");
//         }
//    }
//    public static void main(String[] args){
//     college obj = new college();
//     obj.Student();
//    }
// }



// Qu--> 16  Write a Java program to check whether a person is *eligible to vote*.
// import java.util.Scanner;

// public class Election{
//     void vote(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your age:");
//         int age = sc.nextInt();

//         if(age>=18){
//             System.out.println("You are eligible to vote.");
//         }
//         else{
//             System.out.println("You are  not eligible to vote.");
//         }
//     }
//     public static void main(String[] args){
//         Election obj = new Election();
//         obj.vote();
//     }
// }


// Qn-->17 Write a Java program to check whether a given number is *a single-digit, double-digit, or more than two-digit number*
// import java.util.Scanner;
// public class Check{
//     void DigitCheck(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         if(num>=0 && num<9){
//             System.out.println("is a single digit number.");
//         }
//         else if(num>=10 && num<99){
//             System.out.println(num + " " + "is a double digit number.");
//         }
//         else{
//             System.out.println("More than two digit number.");
//         }
//     }
//     public static void main(String[] args){
//         Check obj = new Check();
//         obj.DigitCheck();
//     }
// }


// Qn--> 18 Write a Java program to calculate *electricity bill* based on unit slabs using if-else-if.
// import java.util.Scanner;
// public class Electricity{
//     void meter(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of units consumed:");
//         int units = sc.nextInt();
//         double billamount;

//         if(units <= 100){
//             billamount = units * 1.0;
//         }
//         else if(units >= 100 && units <200){
//             billamount = ((100 * 1.0) + (units-100) * 1.50);
//         }
//         else if(units >= 200 && units <300){
//             billamount = ((100 * 1.0) + (100 * 1.50) + (units-200) * 2.0);
//         }
//         else{
//             billamount = ((100 * 1.0) + (100 * 1.50) + (100 * 2.0) + (units-300) * 3.0);
//         }
//         System.out.println("The electricity bill amount is: " + billamount);
//     }
//     public static void main(String[] args){
//         Electricity obj = new Electricity();
//         obj.meter();
//     }
// }

// Qn-->19 WAp to check whether a given number is divisible by 2 and 3 both.
// import java.util.Scanner;

// public class Check{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         if(num%2==0 && num%3==0){
//             System.out.println("The given number is divisiblr by 2 and 3both.");
//             }
//             else{
//                 System.out.println("The given number is not divisible bu 2 and 3 both.");
//             }
//     }
// }
   

// Qn-->20 WAp to check the given character is uppercase or lowercase.
// import java.util.Scanner;
// public class Alphabet{
//     public static void main(String[] rags){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a character:");
//         char ch = sc.next().charAt(0);

//         if(ch>='A' && ch<= 'Z'){
//             System.out.println("The given character is uppercase.");
//         }
//         else if(ch>='a' && ch<='z'){
//             System.out.println("The given character is lowercase.");
//         }
//         else{
//             System.out.println("The given character is not an Alphabet.")
//         }
//     }
// }


// Qn-->21 Write a Java program to check whether a given number is *zero, positive, or negative*.
// import java.util.Scanner;
// public class Integer{
//     void Number(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number to check.");
//         int num = sc.nextInt();

//         if(num >= 0){
//             System.out.println("Positive number");
//         }
//         else if(num <= 0) {
//             System.out.println("Negative number");
//         }
//         else{
//             System.out.println("Number is zero");
//         }
//     }
//     public static void main(String[] args){
//         Integer obj = new Integer();
//         obj.Number();
//     }
// }
 

// Qn-->22 Write a Java program to find the *smallest of three numbers*
// import java.util.Scanner;

// public class Check{
//     void SmallestNumber(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter numbers to check:");
//         float num1 = sc.nextFloat();
//         float num2 = sc.nextFloat();
//         float num3 = sc.nextFloat();

//         if(num1 < num2 && num1 <num3){
//             System.out.println(num1 + " " + "is the smallest number." );
//         }
//         else if(num2 < num1 && num2 < num3){
//             System.out.println(num2 + " " + "is the smallest number.");
//         }
//         else{
//             System.out.println(num3 + " " + "is the smallest number");
//         }
//     }
//     public static void main(String[] args){
//         Check obj = new Check();
//         obj.SmallestNumber();
//     }
// }


// Qn--23 Write a Java program to check whether a triangle is *valid* based on three angles.
// import java.util.Scanner;

// public class Triangle{
//     void Angles(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter angles of triangle");
//         float angle1 = sc.nextFloat();
//         float angle2 = sc.nextFloat();
//         float angle3 = sc.nextFloat();

//         float SumOfAngles = angle1 + angle2 + angle3;

//             if(SumOfAngles == 180){
//                 System.out.println("Triangle is valid.");
//             }
//             else{
//                 System.out.println("Triangle is not valid");
//             }
//         }
//         public static void main(String[] args){
//             Triangle obj = new Triangle();
//             obj.Angles();
//         }
// }
        
    
// Qn-->24 Write a Java program to determine the *type of triangle* (equilateral, isosceles, scalene).
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Triangle{
//     void Types() throws IOException{
//         BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the angles:");
//         float angle1 = Float.parseFloat(br.readLine());
//         float angle2 = Float.parseFloat(br.readLine());
//         float angle3 = Float.parseFloat(br.readLine());

//         if(angle1==angle2 && angle2==angle3){
//             System.out.println("Equilateral Triangle.");
//         }
//         else if(angle1==angle2 && angle2 != angle3){
//             System.out.println("Isosceles Triangle.");
//         }
//         else{
//             System.out.println("Scalene Triangle.");
//         }
//     }
//     public static void main(String[] args)throws IOException{
//         Triangle obj = new Triangle();
//         obj.Types();
//     }
// }


// Qn--25 Write a Java program to check whether a given number is *divisible by 11*
// import java.util.Scanner;

// public class Number{
//     void Check(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number:");
//         int num = sc.nextInt();

//         if(num % 11 == 0){
//             System.out.println("The number is divisible by 11.");
//         }
//         else{
//             System.out.println("The number is not divisible by 11");
//         }
//     }
//     public static void main(String[] args){
//         Number obj = new Number();
//         obj.Check();
//     }
// }


// Qn-->26  Write a Java program to calculate *income tax* based on salary slabs.
// import java.util.Scanner;

// public class IncomeTax{
//     void Tax(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your Salary:");
//         double salary = sc.nextDouble();
//         double tax = 0;

//         if(salary <= 250000){
//             tax = 0;
//         }
//         else if(salary > 250000 && salary <= 500000){
//             tax = (salary - 250000) * 0.05;
//         }
//         else if(salary > 500000 && salary <= 1000000){
//             tax = (250000 * 0.05) + (salary - 500000) * 0.20;
//         }
//         else if(salary > 1000000){
//             tax = (250000 * 0.05) + (500000 * 0.20) + (salary - 1000000) * 0.30;
//         }

//         System.out.println("Total Salary: " + salary);
//         System.out.println("Income Tax: " + tax);
//         System.out.println("Salary after tax: " + (salary - tax));
//     }
//     public static void main(String[] args){
//         IncomeTax obj = new IncomeTax();
//         obj.Tax();
//     }
// }


// Qn-->27 Write a Java program to check whether a given day number (1–7) represents a *weekday or weekend*.
// import java.util.Scanner;
// public class Days{
//     void Week(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter day number (1-7):");
//         int day = sc.nextInt();

//         switch(day){
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("It's a Weekday");
//                 break;
//             case 6:
//             case 7:
//                 System.out.println("It's a Weekend");
//                 break;
//             default:
//                 System.out.println("Invalid day number! Please enter 1-7");
//         }
//     }
//     public static void main(String[] args){
//         Days obj = new Days();
//         obj.Week();
//     }
// }