package com.kaya.mvvm.source;

public interface DataCallback<T> { // 数据操作回调

    void onSuccess(T data); // 通知成功

    void onError(); // 通知失败

}
