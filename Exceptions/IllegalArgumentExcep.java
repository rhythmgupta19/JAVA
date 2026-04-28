public class IllegalArgumentExcep{
    public static void main(String[] args){
        Thread t = new Thread();
        t.setPriority(10);
        try{
            t.setPriority(23);
        }
        catch(IllegalArgumentException e){
            System.out.println("The value passed inside the method is greater than limit");
        }
    }
}