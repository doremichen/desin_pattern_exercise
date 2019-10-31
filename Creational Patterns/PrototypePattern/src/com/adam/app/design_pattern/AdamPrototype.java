package com.adam.app.design_pattern;

public class AdamPrototype implements IPrototype {
    
    private String mTag;
    
    public AdamPrototype(String str) {
        this.mTag = str;
    }
    
    /**
     * 
     * Change tag information
     *
     * @param str
     */
    public void setMsg(String str) {
        this.mTag = str;
    }
    
    /**
     * Get tag information
     * 
     * Function Description
     *
     * @return
     */
    public String getMsg() {
        return this.mTag;
    }
    
    /**
     * 
     * clone data
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
        
}
