package com.linfeng.demo.contract;

import com.baozi.mvp.ui.BaseActivityView;
import com.baozi.mvp.ui.ToolbarView;

/**
 * @author jlanglang  2017/3/7 18:20
 * @版本 2.0
 * @Change
 */

public class MainContract {
    public interface View  extends ToolbarView,BaseActivityView{
    }

    public interface Presenter {
    }

    public interface Model {
    }


}