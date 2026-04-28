import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:5");
        int num = sc.nextInt();
        int sum = 0;
        long fact = 1;

        for(int i = 1; i <= num;i++){
            fact *= i;
            sum += fact;
        }
        System.out.println("Factorial is: " + fact);
        System.out.println("The sum of factorial is "+ sum);
    }
}
