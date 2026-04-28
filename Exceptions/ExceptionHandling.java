import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the value:");
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException e){
            System.out.println("Value acceptable in Integer only");
        }
    }
}
