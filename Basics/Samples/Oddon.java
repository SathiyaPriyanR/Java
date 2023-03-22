
package com.mycompany.oddon;


public class Oddon {

   public static void main(String[] args) {
      int i = 3256749;
      int pos = 1;

      while (i != 0) {
         int digit = i % 10;
         i /= 10;
         if (pos % 2 != 0) {
            System.out.println("Digit at position " + pos + " is: " + digit);
         }
         pos++;
      }
   }
}
