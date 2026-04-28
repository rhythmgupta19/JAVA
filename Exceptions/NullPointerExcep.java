// NullPointerException-> Operation performed on null values

import Inheritance.main;

public class NullPointerExcep {
    public static void main(String[] args){
        String s = null;
        try{
            int len = s.length();
        }
        catch(NullPointerException e){
            System.out.println("The value of string entered in null,change the value");
        }
        System.out.println("Exception Resolved");
    }
}
