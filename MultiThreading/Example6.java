package MultiThreading;

// In this we are  using "yield()" method which hold a thread for a small time period in which other get chance to run.

class MyThread6 extends Thread{
    public void run(){
        for(int i = 1;i <=5;i++){
            System.out.println("Child Thread");
            MyThread6.yield();
        }
    }
}
public class Example6 {
    public static void main(String[] args) {
        MyThread6
         t = new MyThread6();
        t.start();
        for(int i = 1;i<=5;i++){
            System.out.println("Main Thread");
        }

    }
}
