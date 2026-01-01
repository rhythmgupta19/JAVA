// WITH PARAMETER WITHOUT RETURN VALUE:
// Number of input must be equal to number of parameters.
// Input must be take inside main method().
// Return type must be void.
// Print statement must be inside method body().
// Name pf parameters and input variables can be same or different.
// Datatype of parameters and input variables must be same or lower than parameters datatype.


// EXAMPLE -> 01

// public class Method_3 {
//     static void id(int a){
//         System.out.println("Your id is: " + a);
//     }
//     public static void main(String[] args){
//         int a = 12345;
//         id(a);
//     }
    
// }


// EXAMPLE -> 02
class Method_3 {
    static void details(String name, int age, char grade){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args){
        String name = "Rhythm";
        int age = 19;
        char grade = 'A';
        details(name, age, grade);
    }
    
}