package com.zxl.test_mvp.ui.login;

import android.text.TextUtils;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-23.
 */
public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(String name, String password) {
        if (TextUtils.isEmpty(name)) {
            mView.failed();
        } else {
            mModel.login(name, password);
        }
    }
}
