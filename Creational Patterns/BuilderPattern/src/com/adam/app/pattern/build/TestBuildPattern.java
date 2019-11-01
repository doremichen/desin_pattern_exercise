/**
 * this is sample
 */

package com.adam.app.pattern.build;

import com.adam.app.pattern.build.Phone.PhoneBulder;

public class TestBuildPattern {

    public static void main(String[] args) {
        final PhoneBulder builder = new PhoneBulder();
        builder.setName("Adam");
        builder.hasFlash("1000GB");
        builder.hasBluetooth(true);
        builder.hasGps(false);

        final Phone phone = builder.makePhone();
        phone.ShowInfo();

    }

}
