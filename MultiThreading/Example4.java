package MultiThreading;

// In this example we are using "sleep" method for a time duration -> t.sleep(5000);,1000 = 1 second.
// sleep always give an exception "throws InterruptedException"

class MyThread4 extends Thread{
    public void run(){
        for(int i = 1; i<=5;i++){
            System.out.println("Child Thread");
            try{
                MyThread4.sleep(6000);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}
public class Example4 {
    public static void main(String[] args)throws InterruptedException {
        MyThread4 t = new MyThread4();
        t.start();
        // MyThread.sleep(5000);
        for(int i = 1;i <=5;i++){
            System.out.println("Main Thread");
        }
    }
}
