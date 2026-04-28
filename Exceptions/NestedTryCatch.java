import java.util.Scanner;
import java.util.InputMismatchException;

public class NestedTryCatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number");
            int fnum = sc.nextInt();

            System.out.println("Enter the second number:");
            int snum = sc.nextInt();

            try{
                int res = fnum/snum;
            }
            catch(ArithmeticException e){
                System.out.println("Tried to divide by zero");
            }

        }
        catch(InputMismatchException e){
            System.out.println("The input must be given in integer only!!");
        }
    }
}
