package com.zxl.test_mvp.ui.login;

import com.zxl.test_mvp.base.BaseModel;
import com.zxl.test_mvp.base.BasePresenter;
import com.zxl.test_mvp.base.BaseView;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-23.
 */
public interface LoginContract {
    interface Model extends BaseModel {
        String login(String name, String password);
    }

    interface View extends BaseView {
        void success();

        void failed();
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        public abstract void login(String name, String password);
    }
}
