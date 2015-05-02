package com.tinymouse.a0131914.yearslater;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by a0131914 on 4/26/2015.
 */
public class NewsStoryAdepter extends FragmentPagerAdapter {

    public NewsStoryAdepter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int position) {

        return FragmentMain.newInstance(position);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 2;
    }

}
