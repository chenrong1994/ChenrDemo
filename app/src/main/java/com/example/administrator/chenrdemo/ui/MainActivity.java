package com.example.administrator.chenrdemo.ui;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import com.example.administrator.chenrdemo.R;

/**
 * 首页
 *
 * @author chenrong
 * @date 2019/01/25
 */
public class MainActivity extends AppCompatActivity {

    private DrawerLayout dlMainContainer;
    private Toolbar tbMain;
    private NavigationView navMainContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        dlMainContainer = findViewById(R.id.dl_main_container);
        tbMain = findViewById(R.id.tb_main);
        navMainContainer = findViewById(R.id.nav_main_container);

        tbMain.setTitle("首页");
        tbMain.setNavigationIcon(R.drawable.ic_menu);
        tbMain.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlMainContainer.openDrawer(Gravity.START);
            }
        });
    }
}
