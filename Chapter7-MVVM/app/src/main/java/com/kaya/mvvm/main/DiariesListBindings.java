package com.kaya.mvvm.main;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.kaya.mvvm.main.list.DiariesAdapter;
import com.kaya.mvvm.model.Diary;

import java.util.List;

/**
 * Created by Yunpeng Li on 2018/12/24.
 */
public class DiariesListBindings {

    @SuppressWarnings("unchecked")
    @BindingAdapter("data")
    public static void setData(RecyclerView recyclerView, List<Diary> data) {
        DiariesAdapter adapter = (DiariesAdapter) recyclerView.getAdapter(); // 获得Adapter
        if (adapter == null) {
            return;
        }
        adapter.update(data); // 更新Adapter中的数据
    }
}
