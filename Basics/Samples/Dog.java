

package com.mycompany.dog;

class Dog extends Main{
    String breed;
    int age;
    String name;

    // constructor
    Dog(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador", 5, "Max");
        Dog dog2 = new Dog("Bulldog", 3, "Rocky");

        System.out.println("Dog 1: " + dog1.breed + " " + dog1.age + " " + dog1.name);
        System.out.println("Dog 2: " + dog2.breed + " " + dog2.age + " " + dog2.name);

        dog1.bark();
        dog2.bark();
    }
}
