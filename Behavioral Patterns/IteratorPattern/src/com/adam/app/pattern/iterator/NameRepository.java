/**
 * Iterator implementation
 */

package com.adam.app.pattern.iterator;

public class NameRepository implements Container {

    private static final String[] NAMES = { "doremi", "adam", "scott", "tom",
            "alex" };

    /**
     * Return iterator
     */
    @Override
    public Iterator getIterator() {

        return new NameIterator();
    }

    /**
     * 
     * Name iterator
     * 
     * @author AdamChen
     * 
     */
    private class NameIterator implements Iterator {
        private int mId;

        @Override
        public boolean hasNext() {
            return (mId < NAMES.length) ? true : false;
        }

        @Override
        public Object next() {

            if (mId >= NAMES.length)
                throw new RuntimeException("No next element");

            return NAMES[mId++];
        }

    }

}
