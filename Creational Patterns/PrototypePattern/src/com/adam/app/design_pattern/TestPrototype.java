package com.adam.app.design_pattern;

public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        // New Adam prototype
        AdamPrototype adam1 = new AdamPrototype("Adam 1");
        // Clone adam 2
        AdamPrototype adam2 = (AdamPrototype)adam1.clone();
        // Change tag from adam 2
        adam2.setMsg("Adam 2222");
        // result
        Utils.info(">>>> " + adam1.getMsg());
        Utils.info(">>>> " + adam2.getMsg());

    }

}
