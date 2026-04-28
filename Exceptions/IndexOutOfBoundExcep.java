// IndexOutOfBoundOfException -> In array and string.trying to insert or retrive data
// from the index outside the boundary.
public class IndexOutOfBoundExcep {
    public static void main(String[] args){
        int arr[] = {1,2,3,45};
        System.out.println(arr[3]);
        try{
            System.out.println(arr[6]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Element at the index is not available!!");
        }
    }
}