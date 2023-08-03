package com.kaya.mvvm.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kaya.mvp.R;
import com.kaya.mvvm.util.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Activity的onCreate生命周期
        super.onCreate(savedInstanceState); // 调用超类方法
        setContentView(R.layout.activity_main); // 设置布局文件
        initFragment(); // 初始化Fragment
    }

    private void initFragment() {
        DiariesFragment diariesFragment = getDiariesFragment(); // 初始化Fragment
        if (diariesFragment == null) { // 查找是否已经创建过日记Fragment
            diariesFragment = new DiariesFragment(); // 创建日记Fragment
            // 将日记Fragment添加到Activity显示
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), diariesFragment, R.id.content);
        }

//        diariesFragment.setPresenter(new DiariesViewModel(diariesFragment)); // 设置主持人
        diariesFragment.setViewModel(new DiariesViewModel(this));
    }

    private DiariesFragment getDiariesFragment() {
        // 通过FragmentManager查找日记展示Fragment
        return (DiariesFragment) getSupportFragmentManager().findFragmentById(R.id.content);
    }

}
