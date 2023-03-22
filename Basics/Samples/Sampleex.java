

package com.mycompany.sampleex;

public class Sampleex {
    public static void main(String[] args) {
        int a = 7;
        int b = 18;
        int c = 5;
       
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        
        System.out.println(max);
    }
}
