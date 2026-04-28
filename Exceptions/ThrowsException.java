import java.util.*;
public class ThrowsException {
public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num < 0) {
            throw new ArithmeticException("Negative number not allowed");
        }

        System.out.println("Number is valid");
    }
}

   
