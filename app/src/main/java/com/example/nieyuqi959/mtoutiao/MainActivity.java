package com.example.nieyuqi959.mtoutiao;

import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
    }
}
