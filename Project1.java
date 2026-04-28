// Rolling dice guessing game simulation
import java.util.Random;
import java.util.Scanner;
public class Project1 {
    public static void main(String[] args){
        Random rn = new Random();
        int dice = rn.nextInt(6)+1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 6:");

        int guess = sc.nextInt();

        if(guess == dice){
            System.out.println("You Won!");
        }
        else{
            System.out.println("Oops!! Better luck next time.");
            System.out.println(dice);
        }
    }
}
