//  Case-->1 If the variable present inside the method it is my local variable.
// public class Local_variable {
//     void num(){
//         int b = 20;
//     }
//     public static void main(String[] args) {
//         int a = 10;
//     }
// }
// Here both a and b are local variable



// Case-->2 Local variable are accessed directly.
// public class Local_variable{
//     static void m1(){
//           int b = 34;
//     System.out.println(b);
//     }
//     public static void main(String[] args){
//         int a = 43;
//         System.out.println(a);
//         m1();
//     }
// }



// Case-->4 Local variable must be intialized
// public class Local_variable{
//     public static void main(String[] args){
//         int s;
//         System.out.println(s);
//     }
// }
// Give an error:"The local variable s may not have been initialized."


// Case-->4 Local variable are stored in stack memory at the time of activation record.

// Case-->5 Local variable gets deleted at the time of deactivation records.
