package MultiThreading;
// In this we check which thread is running & priority.
// we can get,set, name and priority of thread.
class MyThread7 extends Thread{
    public void run(){
        System.out.println("Thread is ready");
        Thread.currentThread().setName("Pallavi"); // Set thread name

        System.out.println(Thread.currentThread().getName()); // Print thread name

        // System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().setPriority(7));
    }
}
public class Example7 {
    public static void main(String[] args) {
        MyThread7 t = new MyThread7();
        t.start();

        System.out.println("This is the end!!");

        // System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Rhythm"); // Set thread name
        System.out.println(Thread.currentThread().getName()); // Print thread name
        System.out.println(Thread.currentThread().getPriority());
    }
}
