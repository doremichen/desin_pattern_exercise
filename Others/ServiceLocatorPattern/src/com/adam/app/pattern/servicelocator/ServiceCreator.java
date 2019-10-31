/**
 * Service Creator
 * 
 * @author AdamChen
 */

package com.adam.app.pattern.servicelocator;

import java.util.HashMap;
import java.util.Map;

public class ServiceCreator {
    
    // Build service map
    private Map<String, IService> mMap = new HashMap<String, IService>();

    {
        mMap.put(Service1.class.getSimpleName(), new Service1());
        mMap.put(Service2.class.getSimpleName(), new Service2());
    }
    
    
    /**
     * Instance service
     * 
     * @param name: Specified service name
     * @return
     */
    public Object lookup(String name) {
        Utils.info(this, "lookup: name" + name);
        
        IService service = this.mMap.get(name);
        
        if (service == null) {
            throw new RuntimeException("No this service object");
        }
        
        return service;
    }

}
