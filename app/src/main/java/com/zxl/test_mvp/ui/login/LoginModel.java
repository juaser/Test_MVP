package com.zxl.test_mvp.ui.login;

import android.util.Log;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-24.
 */
public class LoginModel implements LoginContract.Model {
    @Override
    public String login(String name, String password) {
        Log.e("LoginModel", "name==" + "password==" + password);
        return name;
    }
}
