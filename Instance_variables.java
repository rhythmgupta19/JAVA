// Case-->1   One variable present inside class and outside methods (main method , user-define methods,constructor)
// public class Instance_variables {
//     int a ;
//     public static void main(String[] args){
//     }
// }
// here a is the instance variable 

// Case-->2     Instance must be accessed with obj only,if it hold somevalue.
// public class Instance_variables{
//     int a = 10;
//     public static void main(String[] args) {
//         Instance_variables obj = new Instance_variables();
//         System.out.println(obj.a);
//     }
// }

// Case-->3     If not initialized,instance variable will give default values as output based on data types(zero)
// public class Instance_variables{
//     int r;
//     public static void main(String[] args){
//         Instance_variables obj  = new Instance_variables();
//         System.out.println(obj.r);
//     }
// }

// This give values in either True or False
public class Instance_variables {
    boolean r;

    public static void main(String[] args) {
        Instance_variables obj = new Instance_variables();
        System.out.println(obj.r);
    }
}

// Q.n--> Where instance variable are stored ?
// Ans--> It is stored in heap area,only after the obj is created.

// Case--> It get deleted by garbage collectors on the instruction pf JVM.
