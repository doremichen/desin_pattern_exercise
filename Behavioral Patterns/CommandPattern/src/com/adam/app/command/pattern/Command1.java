/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Command1.java
 * Brief: Operate command1 process flow
 * 
 * Author: AdamChen
 * Create Date: 2018/3/27
 */

package com.adam.app.command.pattern;

/**
 * <h1>Command1</h1>
 * 
 * @autor AdamChen
 * @since 2018/3/27
 */
public class Command1 implements ICommand {

    private OnResponseListener mReceiver;

    public Command1(OnResponseListener receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        Utils.info(this, "execute");
        mReceiver.onResponse1();
    }

}
