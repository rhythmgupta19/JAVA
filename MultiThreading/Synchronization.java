package MultiThreading;

// Syncronization
// Deadlock,Daemon thread and synchronized
class MyThreadR extends Thread{
    // String name;
    Display d;
    int age;

    MyThreadR(Display d,int age){
        // this.name = name;
        this.d = d;
        this.age = age;
    }
    public void run(){
        d.disp(age);
    }
}
class Display{
    public synchronized void disp(int age){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("The age is " + age);
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Display d= new Display();
        MyThreadR t1 = new MyThreadR(d,12);
        MyThreadR t2 = new MyThreadR(d,19);
        t1.start();
        t2.start();
    }
}
