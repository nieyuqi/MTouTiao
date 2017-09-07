package com.example.nieyuqi959.mtoutiao;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.nieyuqi959.mtoutiao.fragment.NewsFragment;
import com.example.nieyuqi959.mtoutiao.fragment.PhotoFragment;
import com.example.nieyuqi959.mtoutiao.fragment.TouTiaoHaoFragment;
import com.example.nieyuqi959.mtoutiao.fragment.VideoFragment;

public class MainActivity extends FragmentActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initToolBar();
        initDrawLayout();

        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
    }

    private void initDrawLayout() {
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_draw_layout, R.string.close_draw_layout);
        drawerToggle.syncState();

        drawerLayout.setDrawerListener(drawerToggle);
    }

    private void initToolBar() {
        //        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.news_tool_bar);
        toolbar.setNavigationIcon(R.mipmap.ic_menu);
        toolbar.inflateMenu(R.menu.menu_tool_bar);

    }

    private void initView() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        drawerLayout = (DrawerLayout) findViewById(R.id.activity_main);

        showFragment(new NewsFragment(), R.string.news_tool_bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_news:

                        showFragment(new NewsFragment(), R.string.news_tool_bar);
                        break;
                    case R.id.action_photo:
                        showFragment(new PhotoFragment(), R.string.title_photo);
                        break;
                    case R.id.action_video:
                        showFragment(new VideoFragment(), R.string.title_video);
                        break;
                    case R.id.action_media:
                        showFragment(new TouTiaoHaoFragment(), R.string.title_media);
                        break;
                }

                return true;
            }
        });
    }

    private void showFragment(Fragment fragment, int titleRes) {
        toolbar.setTitle(titleRes);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();

    }
}
