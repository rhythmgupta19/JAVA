// METHOD OVERLOADING
// 1-> Change in number of parameters


// Example->1

// class Method_Overloading{
//     static int add(int a ,int b){
//         System.out.println("Two parameters");
//         return a+b;
//     }
//     static int add(int a,int b,int c){
//         System.out.println("Three parameters");
//         return a+b+c;
//     }
//     public static void main(String[] args){
//         System.out.println(add(12,23,34));
//     }
// }


// Example->2

// class Method_Overloading{
//     static int sub(int s ,int r){
//         System.out.println("Two parameters");
//         return s-r;
//     }
//     static int sub(int s,int r,int v){
//         System.out.println("Three parameters");
//         return s-r-v;
//     }
//     public static void main(String[] args){
//         System.out.println(sub(245,54,89));
//     }
// }


// Example->3

// class Method_Overloading{
//     static float multiply(float r ,float s){
//       System.out.println("Two parameters");
//         return r * s;
//     }
//     static float multiply(float e,float t,float k){
//       System.out.println("Three parameter");
//         return e * t *k;
//     }
//     public static void main(String[] args){
//         System.out.println(multiply(23.34f,54.32f));
//         System.out.println(multiply(23.45f,74.874f,899.4f));
//     }
// }


// Example->4   By creating object for method

class Method_Overloading{
     float multiply(float r ,float s){
       System.out.println("Two parameters");
        return r * s;
    }
     float multiply(float e,float t,float k){
       System.out.println("Three parameter");
        return e * t *k;
    }
    public static void main(String[] args){
        Method_Overloading obj = new Method_Overloading();
        System.out.println(obj.multiply(23.455f,543.456f));
        System.out.println(obj.multiply(23.567f,654.76f,876.56f));

    }
}


                              // METHOD 2 -> CHANGE IN DATA TYPE OF PARAMETERS:-