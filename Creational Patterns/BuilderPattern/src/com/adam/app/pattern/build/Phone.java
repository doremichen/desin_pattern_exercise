/**
 * The core of that build a phone
 */

package com.adam.app.pattern.build;

public class Phone {

    public void ShowInfo() {
        System.out.println("Phone:");
        System.out.println("Name: " + Content.sName + "\nFlash: "
                + Content.sFlash + "\nGps: " + Content.sHasGps
                + "\nBluetooth: " + Content.sHasBluetooth);
    }

    /**
     * 
     * Phone builder
     * 
     * @author AdamChen
     * 
     */
    public static class PhoneBulder {

        // generate phone object
        public Phone makePhone() {
            return new Phone();
        }

        // set name
        public void setName(String name) {
            Content.sName = name;
        }

        // has Flash
        public void hasFlash(String flash) {
            Content.sFlash = flash;
        }

        // has Gps
        public void hasGps(boolean isgps) {
            Content.sHasGps = isgps;
        }

        // has bluetooth
        public void hasBluetooth(boolean isbluetooth) {
            Content.sHasBluetooth = isbluetooth;
        }
    }

    /**
     * 
     * Phone content
     * 
     * @author AdamChen
     * 
     */
    private static abstract class Content {
        private static String sName;
        private static String sFlash;

        private static boolean sHasGps;
        private static boolean sHasBluetooth;
    }

}
