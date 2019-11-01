/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Command2.java
 * Brief: Operate command2 process flow
 * 
 * Author: AdamChen
 * Create Date: 2018/3/27
 */

package com.adam.app.command.pattern;

/**
 * <h1>Command2</h1>
 * 
 * @autor AdamChen
 * @since 2018/3/27
 */
public class Command2 implements ICommand {

    private OnResponseListener mReceiver;

    public Command2(OnResponseListener receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        Utils.info(this, "execute");
        this.mReceiver.onResponse2();
    }

}
