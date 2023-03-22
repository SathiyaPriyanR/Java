

package com.mycompany.examplereturn;



class Examplereturn {
    static int a;
    static int b;
   
    
    static int returns(){
         a=12;
        b=8;
         return a+b ;
         
    }
    
    public static void main(String[] args) {
        
       
        System.out.println(returns());
     }
}
