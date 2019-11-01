/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: InvokerCommand.java
 * Brief: Provide add command and handle command
 * 
 * Author: AdamChen
 * Create Date: 2018/3/27
 */

package com.adam.app.command.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>InvokerCommand</h1>
 * 
 * @autor AdamChen
 * @since 2018/3/27
 */
public class InvokerCommand {

    // Command list
    private static List<ICommand> sList = new ArrayList<ICommand>();

    public static void addCommand(ICommand command) {

        if (command == null) {

            throw new IllegalArgumentException("please input the valid command");
        }

        sList.add(command);
    }

    /**
     * 
     * <h1>handle</h1> Process commands
     * 
     * @return void
     * 
     */
    public static void handle() {
        Utils.info(InvokerCommand.class, "handle");
        if (sList.size() == 0) {

            throw new RuntimeException("No command need to handle.");
        }

        // Process command in list
        for (ICommand cmd : sList) {

            cmd.execute();
        }

    }

}
