

package com.mycompany.example1;

class Example {
  

  static int add(int a, int b) {
    return a + b;
  }
}

public class Example1 {
  public static void main(String[] args) {
    int result = Example.add(10, 20);
    System.out.println("Result: " + result);
  }
}
