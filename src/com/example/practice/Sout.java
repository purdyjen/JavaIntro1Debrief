package com.example.practice;


/*
    SHORTCUTS:
    main - public static void main(String[] args) {}
    sout - System.out.println()
    (windows) ctrl + j - shows a list of keyboard shortcuts
    (mac) cmd + j - shows a list of keyboard shortcuts
 */

public class Sout {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // declare and define a variable of each of the 8 primitive data types in Java
        // (byte, short, int, long, float, double, boolean, char)
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long creditCardNumber = 1234_5678_9012_3456L;
        float pi = 3.14_15F;
        double d = 123.4;
        boolean boo = true;
        char c = 'A';

        // use System.out.println() to display the values of each variable to the system
        System.out.println(b); // 100
        System.out.println(s); // 10000
        System.out.println(i); // 100000
        System.out.println(creditCardNumber); // 1234_5678_9012_3456L
        System.out.println(pi); // 3.14_15F
        System.out.println(d); // 123.4
        System.out.println(boo); // true
        System.out.println(c); // A

    }
}
