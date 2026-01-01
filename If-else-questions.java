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
// public class Electrici