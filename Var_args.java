// EXAMPLE-->1

// public class Var_args {
//     static int m1(int[] arr){
//         System.out.println("Array parameter");
//         return 1;
//     }
//     static int m1(int[]... arr){
//         System.out.println("2D Var-args parameter");
//         return 0;
//     }
//     public static void main(String[] args){}
// }


// EXAMPLE-->2

// public class Var_args{
//     static int m1(int[]arr){
//         System.out.println("m1 method");
//         return 1;
//     }
//     static int m2(int...arr){
//         System.out.println("m2 method");
//         return 0;
//     }
//     public static void main(String... args)
//     // public static void main(String[] args)    either use this still output
//     {
//         int[]arr = {1,2,3,};
//         m1(arr);
//         m2();

//     }
// }


// EXAMPLE-->3

public class Var_args{
    static int m1(int arr){
        System.out.println("int method");
        return 1;
    }
    static int m1(int... arr1){
        System.out.println("Var_args method");
        return 0;
    }
    public static void main(String... args){
        m1(10);
        m1(20,30);
    }
}
