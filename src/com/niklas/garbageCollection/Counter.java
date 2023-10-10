package com.niklas.garbageCollection;

public class Counter {

    static int value = 0;

    static public void count() {
        System.out.println("Before " + value);
        value++;
        System.out.println("After " + value);
    }

    /* TODO - About Static!
    *
    * static methods, MUST have static variables
    * regular methods, can have static variables
    *
    * What does static method do?
    *  - Added New Feature
    *        - No necessary instantiation for method calling
    *
    * What does static variable do?
    *  - Unchanged memory position
    *  - Only ONE memory position is allocated
    *  - ONE reference only
    *
    * */

}
