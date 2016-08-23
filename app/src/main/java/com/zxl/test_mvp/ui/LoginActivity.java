package com.zxl.test_mvp.ui;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zxl.test_mvp.R;
import com.zxl.test_mvp.base.BaseActivity;
import com.zxl.test_mvp.ui.login.LoginContract;
import com.zxl.test_mvp.ui.login.LoginModel;
import com.zxl.test_mvp.ui.login.LoginPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-23.
 */
public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View {
    @Bind(R.id.username)
    EditText username;
    @Bind(R.id.userpassword)
    EditText userpassword;
    @Bind(R.id.submit)
    TextView submit;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {

    }

    @Override
    public void success() {
        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failed() {
        Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.submit)
    void submit() {
        mPresenter.login(username.getText().toString().trim(), userpassword.getText().toString().trim());
    }
}