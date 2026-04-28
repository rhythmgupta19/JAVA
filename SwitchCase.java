
// 1-->
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Press 1 for addition:");
//         System.out.println("Press 2 for subtraction:");
//         System.out.println("Press 3 for multiplication:");
//         System.out.println("Press 4 for Division");

//         int choice = sc.nextInt();

//         switch(choice){

//             case 1:
//                  System.out.println("Enter your first number:");
//                  float a1 = sc.nextFloat();

//                  System.out.println("Enter the second number:");
//                  float a2 = sc.nextFloat();

//                  System.out.println(a1 +a2);
//             break;

//             case 2:
//                  System.out.println("Enter your first number:");
//                  float b1 = sc.nextFloat();

//                  System.out.println("Enter the second number:");
//                  float b2 = sc.nextFloat();

//                  System.out.println(b1 - b2);
//             break;


//              case 3:
//                  System.out.println("Enter your first number:");
//                  float c1 = sc.nextFloat();

//                  System.out.println("Enter the second number:");
//                  float c2 = sc.nextFloat();

//                  System.out.println(c1 * c2);
//             break;
//              case 4:
//                  System.out.println("Enter your first number:");
//                  float d1 = sc.nextFloat();

//                  System.out.println("Enter the second number:");
//                  float d2 = sc.nextFloat();

//                  System.out.println(d1 / d2);
//             break;
//             default:
//                 System.out.println("Invalid Input, Please Select the case properly");

//         }
//     }
// }


// 2-->
// import java.util.Scanner;

// public class Main{
//     void Subjects(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter 1 for Chemistry:");
//         System.out.println("Enter 2 for Maths:");
//         System.out.println("Enter 3 for Physics");
//         System.out.println("Enter 4 for Biology");

//         int choice = sc.nextInt();

//         switch(choice){

//             case 1:
//                 System.out.println("Enter your marks");
//                 int marks1 = sc.nextInt();

//                 if(marks1 >= 32){
//                     System.out.println("Very good you are pass.");
//                 }
//                 else{
//                     System.out.println("Oops! you are fail");
//                 }
//             break;


//             case 2:
//                 System.out.println("Enter your marks");
//                 int marks2 = sc.nextInt();

//                 if (marks2 >= 32) {
//                     System.out.println("Very good you are pass.");
//                 } else {
//                     System.out.println("Oops! you are fail");
//                 }
//             break;

//             case 3:
//                 System.out.println("Enter your marks");
//                 int marks3 = sc.nextInt();

//                 if (marks3 >= 32) {
//                     System.out.println("Very good you are pass.");
//                 } else {
//                     System.out.println("Oops! you are fail");
//                 }
//             break;

//             case 4:
//                 System.out.println("Enter your marks");
//                 int marks = sc.nextInt();

//                 if (marks >= 32) {
//                     System.out.println("Very good you are pass.");
//                 } else {
//                     System.out.println("Oops! you are fail");
//                 }
//             break;

//             default:
//                 System.out.println("Enter valid option!");
//         }
//     }
//     public static void main(String[] args){
//         Main obj = new Main();
//         obj.Subjects();
//     }
// }



// Qn3-->
// import java.util.Scanner;
// public class Main{
//     void Week(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the days number(1-7");
//         int days = sc.nextInt();

//         switch(days){
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("Its a week day");
//             break;
//             case 6:
//             case 7:
//                 System.out.println("Its a weekend");
//             break;
//             default:
//                 System.out.println("Please enter valid day number");
//         }
//     }
//         public static void main(String[] args){
//             Main obj = new Main();
//             obj.Week();
//         }
//     }


// Qn-->4 By Using BufferedReader class.
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Main{
//     void week() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter the number of days.");
//         int days = Integer.parseInt(br.readLine());

//         switch(days){
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("Its a week days");
//             break;

//             case 6:
//             case 7:
//                 System.out.println("Its a weekend");
//             break;
//             default:
//                 System.out.println("Please enter a valid number.");
//         }
//     }
//     public static void main(String[] args) throws IOException{
//         Main obj = new Main();
//         obj.week();
//     }
// }

// Qn-->5 Input a number (1–5) and print a rating message 1 = Very Bad, 2 = Bad, 3 = Average, 4 = Good, 5 = Excellent.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Service{
//     void rating() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter the number from 1 to 5");
//         int num = Integer.parseInt(br.readLine());

//         switch(num){
//             case 1:
//                 System.out.println("Very Bad Service");
//             case 2:
//                 System.out.println("Bad Service");
//             case 3:
//                 System.out.println("Average Service");
//             case 4:
//                 System.out.println("Good Service");
//             case 5:
//                 System.out.println("Excellent Service");
//         }
//     }
//     public static void main(String[] args) throws IOException{
//         Service ser = new Service();
//         ser.rating();
//     }
// }


// Qn-->6 Input a character (a, e, i, o, u) and check whether it’s a vowel or not,Also handle uppercase letters. 
// import java.util.Scanner;

// public class Alphabet{
//     void vowels(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character");
//         char ch = sc.next().charAt(0);

//         switch(ch){
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
//             case 'A':
//             case 'E':
//             case 'I':
//             case 'O':
//             case 'U':
//                 System.out.println("Its a vowel");
//             break;
//             default:
//                 System.out.println("Its not a vowel");
//         }
//     }
//     public static void main(String[] args){
//         Alphabet r = new Alphabet();
//         r.vowels();
//     }
// }


// Qn-->7 Create a basic calculator,User enters two numbers and an operator (+ - * /),Use switch on the operator to perform the operation.
// Handle division by zero like a responsible adult

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Instrument{
//     void calculator() throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter first number:");
//         double num1 = Double.parseDouble(br.readLine());

//         System.out.println("Enter second number:");
//         double num2 = Double.parseDouble(br.readLine());

//         System.out.println("Enter operator (+,-,*,/):");
//         char operator = br.readLine().charAt(0);

//         double result = 0;
//         boolean validOperation = true;

//         switch(operator){
//             case '+':
//                 result = num1 + num2;
//                 System.out.println("Result:" + result);
//                 break;
            
//             case '-':
//                 result = num1 - num2;
//                 System.out.println("Result:" + result);
//                 break;

//             case '*':
//                 result = num1 * num2;
//                 System.out.println("Result:" + result);
//                 break;

//             case '/':
//                 if(num2 == 0){
//                     System.out.println("Error: Division by zero is not allowed!");
//                     validOperation = false;
//                 }
//                 else{
//                     System.out.println("Result:" + result);
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid Operator! Please use valid Operator.");
//                 validOperation = false;
//         }
//     }
//     public static void main(String[] args)throws IOException{
//         Instrument in = new Instrument();
//         in.calculator();
//     }
// }


// Qn--> 8 Input a month number (1–12) and print how many days it has,February should say “28 or 29 days”,Invalid month → error message

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Year{
//     void months()throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the number of months:");
//         int num = Integer.parseInt(br.readLine());

        // System.out.println("Enter the year");
        // int year = Integer.parseInt(br.readLine());



        // switch(num){
        //     case 1:
        //         System.out.println("January has 31 days.");
        //         break;
        //     case 2:
        //         if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        //             System.out.println("February has 29 days.");
        //         }
        //         else{
        //             System.out.println("February has 28 days."); 
        //         }
        //         break;
        //     case 3:
        //         System.out.println("March has 31 days.");
        //         break;
        //     case 4:
        //         System.out.println("april has 30 days.");
        //         break;
        //     case 5:
        //         System.out.println("May has 31 days.");
        //         break;
        //     case 6:
//                 System.out.println("June has 31 days.");
//                 break;
//             case 7:
//                 System.out.println("July has 31 days.");
//                 break;
//             case 8:
//                 System.out.println("August has 31 days.");
//                 break;
//             case 9:
//                 System.out.println("September has 31 days.");
//                 break;
//             case 10:
//                 System.out.println("October has 31 days.");
//                 break;
//             case 11:
//                 System.out.println("November has 30 days.");
//                 break;
//             case 12:
//                 System.out.println("March has 31 days.");
//                 break;
//         }
//     }
//     public static void main(String[] args)throws IOException{
//         Year y1 = new Year();
//         y1.months();
//     }
// }


// Qn--> 9 Input a number (0-9) and prints its spelling (Zero, One, Two, Anything else --> Not a single digit.

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class Digits{
//         void Number()throws IOException{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 System.out.println("Enter a number from 0-9:");
//                 int num = Integer.parseInt(br.readLine());
        
//                 switch(num){
//                         case 0:
//                         System.out.println("Zero");
//                         break;
//                         case 1:
//                         System.out.println("One");
//                         break;
//                         case 2:
//                         System.out.println("Two");
//                         break;
//                         case 3:
//                         System.out.println("Three");
//                         break;
//                         case 4:
//                         System.out.println("Four");
//                         break;
//                         case 5:
//                         System.out.println("Five");
//                         break;
//                         case 6:
//                         System.out.println("Six");
//                         break;
//                         case 7:
//                         System.out.println("Seven");
//                         break;
//                         case 8:
//                         System.out.println("Eight");
//                         break;
//                         case 9:
//                         System.out.println("Nine");
//                         break;
//                         default:
//                         System.out.println("Not a single digit.");
//                 }
//         }
// }