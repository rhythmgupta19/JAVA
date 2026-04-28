// public class Practice{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         System.out.println(a+b*2);
//     }
// }


// public class Practice{
//     public static void main(String[]args){
//         int x = 5;
//         System.out.println(x++);
//         System.out.println(++x);
//     }
// }


// public class Practice{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//         System.out.println(a > b);      //false
//         System.out.println(a < b);      //true
//     }
// }


// public class Practice{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         System.out.println(a == b);
//     }
// }


// public class Practice{
//     public static void main(String[]args){
//         boolean result = (10 > 5) && (5 < 3);
//         System.out.println(result);
//     }

// }


// public class Practice{
//     public static void main(String[]args){
//         int a = 5;
//         int b = 10;
//         System.out.println(a != b);
//     }
// }


// public class Practice{
//     public static void main(String[]args){
//         int a = 10;
//         a += 5;
//         System.out.println(a);
//     }
// }

// 8
// public class Practice{
//     public static void main(String[] args){
//         int a = 20;
//         a -= 3;
//         System.out.println(a);
//     }
// }

// 9
// public class Practice{
//     public static void main(String[]args){
//         int a = 10;
//         int b = 3;
//         System.out.println(a % b);
//         System.out.println(10/3);
//     }
// }


// 10
// public class Practice{
//     public static void main(String[]args){
//         int a = 10;
//         if(a > 5){
//             System.out.println("Hello");
//         }
//     }
// }


// 11
// public class Practice{
//     public static void main(String[] args){
//         int a  = 3;
//         if(a > 5){
//             System.out.println("A");
//         }
//         else{
//             System.out.println("B");
//         }
//     }
// }

// 12
// public class Practice{
//     public static void main(String[] args){
//         int a = 10;
//         if(a < 5){
//             if( a > 15){
//                 System.out.println("Yeaa");
//             }
//         }
//         else{
//             System.out.println("Faaaaa");
//         }
//     }
// }

// 13
// public class Practice{
//     public static void main(String[] args){
//         int a = 10;
//         if(a > 5){
//         System.out.println("A");
//         }
//         else if(a > 8){
//             System.out.println("B");
//         }
//     }
// }

//14 
// public class Practice{
//     public static void main(String[] args){
//         int a = 2;
//         switch(a){
//             case 1:
//                 System.out.println("one");
//             case 2:
//                 System.out.println("Two");
//             case 3:
//                 System.out.println("Three");
//             default:
//                 System.out.println("Default");
//         }
//     }
// }

// 15
// public class  Practice{
//     public static void main(String[] args){
//         int a = 10;
//         if(a == 5){
//             System.out.println("Yes");
//         }
//     }
// }

// 16
// public class Practice{
//     public static void main(String[] args){
//         boolean flag = true;
//         if(flag){
//             System.out.println("Rhythm");
//         }
//     }
// }

// 17
// public class Practice{
//     public static void main(String[] args){
//         int a = 5;
//         if(a > 10){
//             System.out.println("Big");
//         }
//         else if(a > 3){
//             System.out.println("Medium");
//         }
//         else{
//             System.out.println("Small");
//         }
//     }
// }

// 18
// public class Practice{
//     public static void main(String[] args){
//         for(int i = 0;i<100;i++){
//             System.out.println(i);
//         }
//     }
// }

// 19 infinite loop.
// public class Practice{
//     public static void main(String[] args){
//         int i = 0;
//         while(i < 3){
//             System.out.println(i);
//         }
//     }
// }

// 20
// public class Practice{
//     public static void main(String[] args){
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(i <3);
//     }
// }

// 21
// public class Practice{
//     public static void main(String[] args){
//         for(int i = 0;i < 5;i++){
//             System.out.println(i);
//             if(i == 3){
//                 break;
//             }
//         }
//     }
// }

// 22
// public class Practice{
//     public static void main(String[] args){
//         for(int i = 0;i <5;i++){
//             if(i == 3){
//                 continue;
//             }
//         System.out.println(i);
//         }
//     }
// }

// 23
// public class Practice{
//         public static void main(String[] args){
//             int i = 5;
//             while(i > 0){
//                 i--;
//                 System.out.println(i);
//             }
            
//         }
// }


public class Practice{
    int age;
    String name;
    String Add;
    String clg;
    String friendName;

    Practice(){                 //Default constructor
        age = 19;
        name = "Rhythm";            // if value passed it prints the value either give op 0 or null
        Add = "Rewa";
    }
    Practice(int age,String name,String Add){           //Parameterized constructor
        this.age = age;                             
        this.name = name;                           // if value passed it prints the value either give op 0 or null
        this.Add = Add; 
           System.out.println("Three parameterized constructor running");
           System.out.println(age + " " + name + " " + Add);
    }
    Practice(String clg,String friendName){
        System.out.println("Two parameterized constructor running");
        System.out.println("My friend name is " + friendName + " whom i met in" + " " + clg + " college");
    }
    Practice (Practice p){                  // copy constructor
        age = p.age;
        name = p.name;
        Add = p.Add;
    
        System.out.println("Copy constructor ");
    }
    public class main{
            public static void main(String[]args){
                Practice p = new Practice();
                System.out.println(p.age + " " + p.name+ " " + p.Add);
                Practice p1 = new Practice(19,"pallavi","bhopal");
                Practice p2 = new Practice("oriental","pallavi");
                Practice p3 = new Practice(p1);
                System.out.println(p3.age + " " + p3.name + " " + p3.Add);
            }
    }
}