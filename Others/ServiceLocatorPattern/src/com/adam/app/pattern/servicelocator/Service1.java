/**
 * Service 1
 * 
 * @author AdamChen
 */

package com.adam.app.pattern.servicelocator;

public class Service1 implements IService {

    @Override
    public String getName() {

        return Service1.class.getSimpleName();
    }

    @Override
    public void execute() {
        Utils.info(this, "execute");
    }

}
