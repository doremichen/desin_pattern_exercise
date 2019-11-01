/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: CommandResponse.java
 * Brief: Receive the response of commands
 * 
 * Author: AdamChen
 * Create Date: 2018/3/27
 */

package com.adam.app.command.pattern;

/**
 * <h1>CommandResponse</h1>
 * 
 * @autor AdamChen
 * @since 2018/3/27
 */
public class CommandResponse implements OnResponseListener {

    @Override
    public void onResponse1() {
        Utils.info(this, "onResponse1");
    }

    @Override
    public void onResponse2() {
        Utils.info(this, "onResponse2");
    }

    @Override
    public void onResponse3() {
        Utils.info(this, "onResponse3");
    }

}
