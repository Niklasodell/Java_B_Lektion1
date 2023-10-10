package com.niklas.garbageCollection;

public class Main {

    /* - Deprecated
    public void finalize() {
        System.out.println("Test Garbage Collection");
    }
    */

    public static void main(String[] args) {

        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Counter counterC = new Counter();
        Counter counterD = new Counter();


        // Garbage Collection - Mark for unreferenced Object (heap)
        new Counter(); // Anonymous Object
        counterC = null; // Nulling Reference
        counterC = counterD; // Assigning Reference (to another)

        System.out.println(counterC);
        System.out.println(counterD);

        System.gc();


        for (int i = 0; i < 5; i++) {
            System.out.println("--Counter A--");
            counterA.count();

            System.out.println("--Counter B--");
            counterB.count();
        }

    }

}
