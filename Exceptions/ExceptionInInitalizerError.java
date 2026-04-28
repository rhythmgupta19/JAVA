// This exception raise when there is an exception inside a static block

import Inheritance.main;

public class ExceptionInInitalizerError {
    static{
        String s = null;
        System.out.println(s.length());
    }
    public  static void main(String[] args){
        
    }
}
