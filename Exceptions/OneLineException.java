
public class OneLineException {
    public static void main(String[]args){
        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[8]);
        }
        catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
