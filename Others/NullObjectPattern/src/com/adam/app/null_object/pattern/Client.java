/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program null objetc pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.null_object.pattern;

/**
 *
 * <h1>Client</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class Client {

    /**
     * Entry method
     *
     * @param
     * @return
     */
    public static void main(String[] args) {

        AbstractData dataA = DataFactory.getData(DataItem.A);
        AbstractData dataB = DataFactory.getData(DataItem.B);
        AbstractData dataC = DataFactory.getData(DataItem.C);
        AbstractData dataD = DataFactory.getData(DataItem.D);
        
        // show data message
        Utils.info(Client.class, dataA.getMsg());
        Utils.info(Client.class, dataB.getMsg());
        Utils.info(Client.class, dataC.getMsg());
        Utils.info(Client.class, dataD.getMsg());
        

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
