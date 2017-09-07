package com.example.nieyuqi959.mtoutiao.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nieyuqi959 on 17/9/4.
 */
public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(attachLayotId(), container, false);
        initView(view);
        intiData();
        return view;
    }

    protected abstract void intiData();

    protected abstract void initView(View view);

    public abstract int attachLayotId();
}
