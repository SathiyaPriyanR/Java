
package com.mycompany.sample1;


public class Sample2 {  // if use final keyword in class cant inherit
    
    final int a = 10;
    
    public static void main(String args[]) {
       Sample2 obj = new Sample2();
     
       Sample2 obj2 = new Sample2();
       
       System.out.println(obj.a); //cant change the value 'a'
       System.out.println(obj.methodsample1());
       Sample1.ex1();
    }
    
    int methodsample1(){  // cant override this method
        
        int b = 19;
        return b;
     }
}
