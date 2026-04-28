class Animal{
    void Sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog is barking");
    }
}

public class InstanceKeyword{
    public static void main(String[] args){
        Animal d = new Dog();
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        d.Sound();
        

        if (d instanceof Dog){
            d.Sound();
        }
    }
}