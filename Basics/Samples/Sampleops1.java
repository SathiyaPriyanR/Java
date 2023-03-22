
package com.mycompany.sampleops1;

public class Sampleops1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 10;
        int d = 8;
        int e = 20;
        int f = 5;
        
        String g = (a<=d)?"yes":"No";
        
        System.out.println(g);
         System.out.println(a&b);
         System.out.println(c|e);
         System.out.println(a^e);
         
         boolean bluepens = true;
         boolean nopens = false;
         
         if (bluepens && nopens){
             System.out.println("no" );
         }else{
             System.out.println("yes");
         }
        
         int r = ((a+b)*(c/d));
        
         System.out.println(f>>1);
         System.out.println(b<<1);
         System.out.println(a>>>1);
      
        a++;
        
        e = ++f;
        System.out.println(e);
        d = f--;
        b += c;
        
        System.out.println(r);
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        
    }
}
