package com.zxl.test_mvp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import butterknife.ButterKnife;

/**
 * @Description:
 * @Author: zxl
 * @Date: 24/8/16.
 */
public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel> extends FragmentActivity {
    public P mPresenter;
    public M mModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        if(this instanceof BaseView){
            mPresenter.setMV(mModel, this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    public abstract int getLayoutId();
}
