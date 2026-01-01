
import java.io.*;
public class Details{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter your college name:");
        String collegeName = br.readLine();
        System.out.println("Enter your percentage:");
        int percentage = Integer.parseInt(br.readLine());
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("College Name:" + collegeName);
        System.out.println("Percentage:" + percentage);
    }

    }
