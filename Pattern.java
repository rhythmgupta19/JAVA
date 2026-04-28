// First for loop for how many times tou want to print
// Second for loop is for what you want to print & how m any times
// j is used for column 
// i is used for row

//1 Rectangle

// public class Pattern {
//     public static void main(String[] args) {
//         for(int i = 1;i <= 5;i++){
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 2 Number Pattern
// public class Pattern{
//     public static void main(String[] args){
//         for(int i = 0;i <5;i++){
//             for(int j = 0;j<5;j++){
//                 System.out.print(i+1 +" ");
//             }
//             System.out.println();
//         }
//     }
// }

// 3 Number pattern
// public class Pattern {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print(j + 1 + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 4 Hallow Square Pattern 5*5

// public class Pattern{
//     public static void main(String[] args){
//         for(int i = 0;i < 5;i++){
//             for(int j = 0;j<5;j++){
//             if(i == 0 || i == 4 || j == 0 || j == 4){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//             }
//             System.out.println();
//         }
//     }
// }

// Hallo rectngle 10* 10

public class Pattern {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}