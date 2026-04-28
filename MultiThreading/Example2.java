package MultiThreading;

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}