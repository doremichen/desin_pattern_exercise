/**
 * Program range check
 */

package com.adam.app.range.pattern;

/**
 * @author AdamChen
 * 
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        A rangeA = new A(10, 0);
        B rangeB = new B(20, 11);
        C rangeC = new C(30, 21);
        D rangeD = new D(40, 31);

        rangeA.AddNext(rangeB);
        rangeB.AddNext(rangeC);
        rangeC.AddNext(rangeD);
        rangeD.AddNext(null);

        // start range check
        rangeA.hanlder(31); // Range: Locate in range D

        /*
         * Exception in thread "main" java.lang.RuntimeException: No next range
         */
        // rangeA.hanlder(50);
    }

}
