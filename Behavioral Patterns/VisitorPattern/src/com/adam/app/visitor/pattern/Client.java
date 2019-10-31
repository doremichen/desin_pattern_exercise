package com.adam.app.visitor.pattern;

public class Client {

    public static void main(String[] args) {
        // start calculate
        int result = ObjectStructure.startCalculate();
        Utils.info(Client.class, "main: result = " + result);

    }

}
