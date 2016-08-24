package com.zxl.test_mvp.ui.base;

/**
 * @Description:
 * @Author: zxl
 * @Date: 24/8/16.
 */
public class BasePresenter<M, V> {
    public M mModel;
    public V mView;

    public void setMV(M m, V v) {
        mModel = m;
        mView = v;
    }

}
