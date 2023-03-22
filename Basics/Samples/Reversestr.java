package com.mycompany.reversestr;

public class Reversestr {


  public static void main(String[] args) {
    String n = " ANIHD "; // change this to the string you want to reverse
    String reversed = "";

    for (int i = n.length() - 1; i >= 0; i--) {
      reversed += n.charAt(i);
    }

    System.out.println("Reversed string: " + reversed);
  }
}
