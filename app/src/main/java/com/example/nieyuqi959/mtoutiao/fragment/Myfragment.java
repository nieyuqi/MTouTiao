package com.example.nieyuqi959.mtoutiao.fragment;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;

import com.example.nieyuqi959.mtoutiao.R;

/**
 * Created by nieyuqi959 on 17/9/6.
 */
public class Myfragment extends BaseFragment {

    @Override
    protected void intiData() {


    }

    @Override
    protected void initView(View view) {

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public int attachLayotId() {

        return R.layout.fragment_news_tablayout;
    }
}
