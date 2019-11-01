/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Command3.java
 * Brief: Operate command3 process flow
 * 
 * Author: AdamChen
 * Create Date: 2018/3/27
 */

package com.adam.app.command.pattern;

/**
 * <h1>Command3</h1>
 * 
 * @autor AdamChen
 * @since 2018/3/27
 */
public class Command3 implements ICommand {

    private OnResponseListener mReceiver;

    public Command3(OnResponseListener receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        Utils.info(this, "execute");
        this.mReceiver.onResponse3();
    }

}
