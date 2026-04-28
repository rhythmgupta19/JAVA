package Electronics;

// In Java, == checks if two references point to the same object,not if the strings have the same content.
// For string comparison,use the.equals()method:
public class Fan extends Appliance {
    void rotate(){
        System.out.println("Fan will rotate");
    }
}
