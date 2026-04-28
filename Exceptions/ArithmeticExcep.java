// Happens when we try to divide a number by zero (both in int only)

public class ArithmeticExcep {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // try -> it raises the exception
        try {
            int c = a / b;
<<<<<<< Updated upstream
        } catch (ArithmeticException e) {
=======
        } 
        catch (ArithmeticException e) {
>>>>>>> Stashed changes
            System.out.println("Tried to divide by zero, enter a valid number!!");
        }
        System.out.println(a / (b + 2));
    }
}
