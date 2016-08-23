package com.zxl.test_mvp.base;

import android.content.Context;

/**
 * @类说明：
 * @author：zxl
 * @CreateTime: 16-8-23.
 */
public class BasePresenter<M, V> {
    public Context context;
    public M mModel;
    public V mView;

    public void setVM(M m, V v) {
        this.mModel = m;
        this.mView = v;
    }
}
