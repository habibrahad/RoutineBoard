package com.darkwhite.routineboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new MondayFragment();
        else if (position == 1)
            return new TuesdayFragment();
        else if (position == 2)
            return new WednesdayFragment();
        else if (position == 3)
            return new ThrusdayFragment();
        else
            return new FridayFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Mon";
        else if (position == 1)
            return "Tue";
        else if (position == 2)
            return "Wed";
        else if (position == 3)
            return "Thr";
        else
            return "Fri";
    }
}
