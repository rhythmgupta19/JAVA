package Inheritance.Devices;

public class MainApp {
    public static void main(String[] args){
        Laptop l1 = new Laptop();
        l1.brand = "ASUS";
        l1.powerOn();
        l1.showBrand();
        l1.price = 65000;
    }
    
}
