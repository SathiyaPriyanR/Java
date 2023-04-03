package enums;

public class Sample1 {

    enum Class {CSE, IT, ECE, MECH, CIVIL, EEE}

    public static void main(String[] args) {
        int a = Class.CIVIL.ordinal();
        System.out.println(a);
    }
}
