/**
 * 
 */
package com.adam.app.adapter.pattern;

/**
 * @author AdamChen
 * 
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Get value from Adaptee
        System.out.println("The original value  = " + new Adaptee().getValue());

        // Get value form class Adapter
        IAdapter cAdapter = new ClassAdapter();
        System.out.println("The value1 from  class adapter = "
                + cAdapter.getValue1());
        System.out.println("The value2 from  class adapter = "
                + cAdapter.getValue2());
        System.out.println("The value3 from  class adapter = "
                + cAdapter.getValue3());

        // Get value form object Adapter
        IAdapter oAdapter = new ObjAdapter();
        System.out.println("The value1 from  object adapter = "
                + oAdapter.getValue1());
        System.out.println("The value2 from  object adapter = "
                + oAdapter.getValue2());
        System.out.println("The value3 from  object adapter = "
                + oAdapter.getValue3());

    }

}
