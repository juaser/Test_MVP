package com.zxl.test_mvp.ui.login;

import android.util.Log;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-23.
 */
public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(String name, String password) {
        Log.e("LoginPresenter", "name==" + "password==" + password);
//        if (TextUtils.isEmpty(name)) {
//            mView.failed();
//        } else {
            mModel.login(name, password);
//        }
    }
}
