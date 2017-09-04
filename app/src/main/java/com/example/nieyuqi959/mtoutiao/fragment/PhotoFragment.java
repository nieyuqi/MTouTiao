package com.example.nieyuqi959.mtoutiao.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nieyuqi959.mtoutiao.R;

/**
 * Created by nieyuqi959 on 17/9/4.
 */

public class PhotoFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo, container,false);

        return view;
    }
}
