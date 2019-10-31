/**
 * Cache service in service list
 * 
 * @author AdamChen
 */

package com.adam.app.pattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<IService> mList;

    public Cache() {
        mList = new ArrayList<IService>();
    }

    /**
     * Get service from service list
     * 
     * @param name
     * @return
     */
    public IService getService(String name) {
        Utils.info(this, "getService: " + name);
        for (IService service : mList) {

            if (service.getName().equalsIgnoreCase(name)) {
                Utils.info(this, "Got service in catch list.");
                return service;
            }

        }

        return null;
    }

    /**
     * Add service in service list
     * 
     * @param newService
     */
    public void addService(IService newService) {
        Utils.info(this, "addService");
        boolean exist = false;

        // check whether service exits in service list?
        for (IService service : mList) {

            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exist = true;
            }

        }
        
        // add service in service list
        if (exist == false) {
            mList.add(newService);
        }
    }

}
