
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
import java.util.Scanner;
public class Main{
    void Week(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days number(1-7");
        int days = sc.nextInt();

        switch(days){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Its a week day");
            break;
            case 6:
            case 7:
                System.out.println("Its a weekend");
            break;
            default:
                System.out.println("Please enter valid day number");
        }
    }
        public static void main(String[] args){
            Main obj = new Main();
            obj.Week();
        }
    }
