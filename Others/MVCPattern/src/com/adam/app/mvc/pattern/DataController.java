/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: DataController.java
 * Brief: Controller
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */


package com.adam.app.mvc.pattern;

import com.adam.app.mvc.pattern.DataModel.OnDataDoneListener;

/**
 * @author AdamChen
 *
 */
public class DataController implements OnDataDoneListener{
    
    // mode and view
    private DataModel mModel;
    private DataView mView;
    
    public DataController(DataModel model, DataView view) {
        this.mModel = model;
        this.mView = view;
    }
    
    public void modifyModel(String data) {
        Utils.info(this, "modifyModel");
        // modify data model
        this.mModel.updateData(data, this);
    }
    
    
    /* (non-Javadoc)
     * @see com.adam.app.mvc.pattern.DataModel.OnDataDoneListener#done(java.lang.String)
     */
    @Override
    public void done(String result) {
        Utils.info(this, "done result = " + result);
        // tell view
        this.mView.updateView(result);
        
    }
    

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
