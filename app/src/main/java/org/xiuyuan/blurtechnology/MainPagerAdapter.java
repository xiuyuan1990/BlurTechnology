package org.xiuyuan.blurtechnology;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by xiuyuan on 15-6-8.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragmentList = new ArrayList<>();

    public MainPagerAdapter(Activity activity, FragmentManager fragmentManager) {
        super(fragmentManager);
        fragmentList.add(Fragment.instantiate(activity, RenderScriptBlurFragment.class.getName()));
        fragmentList.add(Fragment.instantiate(activity, FastBlurFragment.class.getName()));
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }
}
