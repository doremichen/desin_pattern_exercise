/**
 * Program Iterator pattern
 */

package com.adam.app.pattern.iterator;

public class TestIteratorPattern {

    public static void main(String[] args) {

        final NameRepository repository = new NameRepository();

        final Iterator iter = repository.getIterator();

        while (iter.hasNext()) {
            final String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

        // test case: Go to next continuous
        // expected: throw exception
        iter.next();

    }

}
