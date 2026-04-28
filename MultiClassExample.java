import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiClassExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number:");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number:");
            int num2 = sc.nextInt();

            int res = num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero error");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter value in integer form.");
        }
        finally{
            System.out.println("Program done");
        }
    }
}