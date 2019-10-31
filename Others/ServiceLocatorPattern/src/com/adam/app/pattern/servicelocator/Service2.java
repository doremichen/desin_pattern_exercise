/**
 * Servcie 2
 * 
 * @author AdamChen
 */

package com.adam.app.pattern.servicelocator;

public class Service2 implements IService {

    @Override
    public String getName() {

        return Service2.class.getSimpleName();
    }

    @Override
    public void execute() {
        Utils.info(this, "execute");
    }

}
