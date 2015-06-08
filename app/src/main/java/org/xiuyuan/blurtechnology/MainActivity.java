package org.xiuyuan.blurtechnology;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {
    private View mRenderScriptBlurView;
    private ViewPager mViewPager;

    private PagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.vp_main);

        pagerAdapter = new MainPagerAdapter(this, getSupportFragmentManager());

        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }
}
