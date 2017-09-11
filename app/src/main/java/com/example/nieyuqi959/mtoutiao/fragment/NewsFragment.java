package com.example.nieyuqi959.mtoutiao.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nieyuqi959.mtoutiao.R;
import com.example.nieyuqi959.mtoutiao.activity.ChannelActivity;
import com.example.nieyuqi959.mtoutiao.adapter.FragmentNewsTabLayoutAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nieyuqi959 on 17/9/4.
 */

public class NewsFragment extends BaseFragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        initView(view);


        return view;
    }

    @Override
    protected void intiData() {

    }

    @Override
    public int attachLayotId() {
        return R.layout.fragment_news;
    }

    public void initView(View view) {
        String[] titleNames = getResources().getStringArray(R.array.mobile_news_name);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        TabLayout tablayout = (TabLayout) view.findViewById(R.id.tablayout);
        ImageView addChannel = (ImageView) view.findViewById(R.id.add_channel);

        List<Fragment> fragmentList = new ArrayList<>();

        for (int i = 0; i < titleNames.length; i++) {
            Fragment fragment = new Myfragment();

            Bundle bundle = new Bundle();
            bundle.putString("text", titleNames[i]);

            fragment.setArguments(bundle);
            fragmentList.add(fragment);
        }

        viewPager.setAdapter(new FragmentNewsTabLayoutAdapter(fragmentList, titleNames, getFragmentManager()));
        tablayout.setupWithViewPager(viewPager);
        addChannel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ChannelActivity.class);
        startActivity(intent);
    }
}
