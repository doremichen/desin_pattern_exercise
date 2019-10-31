/**
 * Help to generate the needed service
 * 
 * @author AdamChen
 */

package com.adam.app.pattern.servicelocator;

public class ServiceLocator {

    private static Cache sCache;

    static {

        sCache = new Cache();

    }

    /**
     * Get service from Cache
     * 
     * @param name
     * @return
     */
    public static IService getService(String name) {

        IService service = sCache.getService(name);

        if (service != null) {
            return service;
        }

        ServiceCreator serviceCreat = new ServiceCreator();
        IService newService = (IService) serviceCreat.lookup(name);
        sCache.addService(newService);
        return newService;

    }
}