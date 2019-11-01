/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program Command pattern
 * 
 * Author: AdamChen
 * Create Date: 2018/3/27
 */

package com.adam.app.command.pattern;

/**
 * <h1>Client</h1>
 * 
 * @autor AdamChen
 * @since 2018/3/27
 */
public class Client {

    /**
     * <h1>main</h1>
     * 
     * @param args
     * @return void
     * 
     */
    public static void main(String[] args) {

        // Prepare Command and receiver
        CommandResponse receiver = new CommandResponse();
        Command1 cmd1 = new Command1(receiver);
        Command2 cmd2 = new Command2(receiver);
        Command3 cmd3 = new Command3(receiver);

        // Add command to invoker and handle command
        InvokerCommand.addCommand(cmd1);
        InvokerCommand.addCommand(cmd2);
        InvokerCommand.addCommand(cmd3);

        InvokerCommand.handle();

    }

}
