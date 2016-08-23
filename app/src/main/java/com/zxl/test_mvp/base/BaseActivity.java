package com.zxl.test_mvp.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import butterknife.ButterKnife;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-23.
 */
public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel> extends FragmentActivity {
    public P mPresenter;
    public M mModel;
    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView();
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        if (this instanceof BaseView) {
            Log.e("TAG", "mPresenter关联");
            mPresenter.setVM(this, mModel);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    public abstract int getLayoutId();

    public abstract void initView();

}
