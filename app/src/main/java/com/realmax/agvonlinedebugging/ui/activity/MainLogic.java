package com.realmax.agvonlinedebugging.ui.activity;

import com.realmax.agvonlinedebugging.ui.base.BaseLogic;
import com.realmax.agvonlinedebugging.ui.base.BaseUiRefresh;

public class MainLogic extends BaseLogic {
    private MainUiRefresh mainUiRefresh;

   public void setMainUiRefresh(MainUiRefresh mainUiRefresh) {
        this.mainUiRefresh = mainUiRefresh;
    }


    interface MainUiRefresh extends BaseUiRefresh {

    }
}
