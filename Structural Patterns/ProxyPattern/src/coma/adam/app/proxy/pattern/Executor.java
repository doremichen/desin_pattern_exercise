/**
 * Program proxy pattern
 */

package coma.adam.app.proxy.pattern;

public class Executor {

    public static void main(String[] args) {

        // Create proxy instance
        final IInterface proxy = new ProxyObject();

        // make the proxy to do something
        proxy.doSomething();
        Utils.print(Executor.class, "====================");
        // make the proxy to do something again
        proxy.doSomething();

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
