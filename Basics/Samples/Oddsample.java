
package com.mycompany.oddsample;


public class Oddsample {
    public static void main(String[] args) {
      int i = 132435465;
      String numStr = Integer.toString(i);

      for (int pos = 0; pos < numStr.length(); pos++) {
         int digit = Character.getNumericValue(numStr.charAt(pos));
         if ((pos + 1) % 2 != 0) {
            System.out.println(digit);
         }
      }
   }
}
