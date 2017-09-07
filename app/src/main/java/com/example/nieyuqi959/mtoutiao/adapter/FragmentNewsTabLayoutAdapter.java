package com.example.nieyuqi959.mtoutiao.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by nieyuqi959 on 17/9/6.
 */

public class FragmentNewsTabLayoutAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragmentList;
    private final FragmentManager fragmentManager;
    private final String[] titles;

    public FragmentNewsTabLayoutAdapter(List<Fragment> fragments, String[] titles, FragmentManager fm) {
        super(fm);

        this.fragmentList = fragments;
        this.fragmentManager = fm;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
