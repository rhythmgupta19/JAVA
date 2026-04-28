// Case-->1 Static variable locked inside the class outside the method with keyword "static"
// public class Static_variable {
//     static int a;
//     public static void main(String[] args){
//     }
// }



// Case-->2 Method of accessing
// Static variable can be called in three different ways:-
// And the recommended approach by class name.
// a-> by creating object.
// b->Directly.
// c->By class name.

// public class Static_variable{
//     static int s = 12;
//     public static void main(String[] args){
        // By creating object
//         Static_variable obj = new Static_variable();
//         System.out.println(obj.s);

        // Directly
//         System.out.println(s);

        // By class name 
//         System.out.println(Static_variable.s);
//     }
// }


// Case-->3 If not initialize it takes default values. 

// Case-->4 Static variable are stored in  method area, at the time of class loading.
public class Static_variable{
    static int r ;
    public static void main(String[] args){
        System.out.println(r);
    }
}

// Case--> It get deleted once the class is deleted.
