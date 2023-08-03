package com.kaya.mvc.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kaya.mvc.R;
import com.kaya.mvc.util.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }
    private void initFragment() {
        DiariesFragment diariesFragment = getDiariesFragment(); // 初始化Fragment
        if (diariesFragment == null) { // 查找是否已经创建过日记Fragment
            diariesFragment = new DiariesFragment(); // 创建日记Fragment
            // 将日记Fragment添加到Activity显示
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), diariesFragment, R.id.content);
        }
    }

    private DiariesFragment getDiariesFragment() {
        // 通过FragmentManager查找日记展示Fragment
        return (DiariesFragment) getSupportFragmentManager().findFragmentById(R.id.content);
    }

}