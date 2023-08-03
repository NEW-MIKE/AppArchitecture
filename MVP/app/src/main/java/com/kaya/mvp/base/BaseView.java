package com.kaya.mvp.base;

import com.kaya.mvp.base.BasePresenter;

public interface BaseView<T extends BasePresenter> { // View基类

    void setPresenter(T presenter); // 传入Presenter

}
