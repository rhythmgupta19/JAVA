public class NestedTryCatch {
    public static void main(String[] args){
       try{
         int arr[] = {12,13,14,15,16,17};
        try{
            int res = 15/0;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero error");
        }
        System.out.println(arr[8]);
       }
       catch(IndexOutOfBoundsException e){
        System.out.println("Enter correct index value.");
       }
    }
}
