import java.io.*;
public class FileNOtFoundExcep {
    public static void main(String[] args) {
         try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
         }
         catch(FileNotFoundException e) {
            System.out.println("File not found.");
         }
         catch(IOException e){
            System.out.println("Error to read file.");
         }
    }
}
