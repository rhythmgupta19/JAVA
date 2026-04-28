// Happens when we enter the wrong value.
// In this exception we have to import InputMismatchException from util package.
// We can also raise exception without import InputMismatchException.
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExcep{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value:");
        try{
            int a = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Enter the value in Int only!!");
        }
    }
}
