
package com.mycompany.counter;


class Counter {
    static int count = 0;

    static void incrementCount() {
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        
        counter1.count++;
        counter2.count++;
        counter1.incrementCount();
        
        System.out.println("Count: " + Counter.count);
    }
}

