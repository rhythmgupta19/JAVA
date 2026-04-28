package MultiThreading;
// In this we are using "join()" method.
// Jab tak pahla thread complete nhi ho jayega tab tak next run nhi hoga.
// Need to handle InterruptedException

class MyThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
            try {
                MyThread5.sleep(6000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 t = new MyThread4();
        t.start();
        t.join();
        // MyThread.sleep(5000);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
