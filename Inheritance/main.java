
package Inheritance;

public class main {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();

        Tiger t = new Tiger();
        t.wild();
        t.eat();

        Cow c = new Cow();
        c.graze();
        
        System.out.println(d.leg);
        System.out.println(t.eye);
    }
    
}
