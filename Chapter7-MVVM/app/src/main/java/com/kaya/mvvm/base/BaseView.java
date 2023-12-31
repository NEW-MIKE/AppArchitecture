package com.kaya.mvvm.base;

public interface BaseView<T extends BasePresenter> { // View基类

    void setPresenter(T presenter); // 传入Presenter

}
