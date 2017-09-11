package com.example.nieyuqi959.mtoutiao.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nieyuqi959 on 17/9/7.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(attachActivityLayout());

        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    public abstract int attachActivityLayout();
}
