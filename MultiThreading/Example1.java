package MultiThreading;

class MyThread extends Thread { // Create Thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class Example1 {
    public static void main(String[] args) { // Main Thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
        MyThread t = new MyThread();
        t.start(); // Start method,calls or run Thread by default.
    }
}
