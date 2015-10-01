package com.example.hyhy.univer;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {
	String ar[] = {"rer"};
	int positiion;
	int screen;
	Fragment fragment;

	public TabsPagerAdapter(FragmentManager fm, int pos, int screen) {
		super(fm);
		this.positiion = pos;
		this.screen = screen;
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:

		case 1:
			// Movies fragment activity
			return new Item(this, positiion, screen);
		}
		
		
		return null;
	}

	@Override
	public int getCount() {
		return 2;
	}

}
