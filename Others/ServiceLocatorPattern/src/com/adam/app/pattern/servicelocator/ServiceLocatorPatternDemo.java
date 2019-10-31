/**
 * This is servic elocator pattern example.
 */

package com.adam.app.pattern.servicelocator;

public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        IService service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();

        service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();
        
        service = ServiceLocator.getService("Service3");
        service.execute();

    }

}
