

package com.mycompany.main;

class Person {
    String name;
    int age;
    int height;

    void walk() {
        System.out.println(this.name + " is walking.");
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 30;
        person1.walk();
        person1.eat();
        System.out.println(person1.name);
        System.out.println(person1.height);
    }
}
