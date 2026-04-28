package Electronics;

public class MainRunner {
    String power = "on";

    public static void main(String[] args){
    Appliance a1 = new Appliance();
    a1.SwitchOn();

    Fan f1 = new Fan();
    f1.rotate();

    System.out.println(a1.cost);
    }
}