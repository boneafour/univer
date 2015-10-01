package com.example.hyhy.univer.screen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hyhy.univer.R;

/**
 * Created by HYHY on 04.06.2015.
 */
public class Screen1 extends android.support.v4.app.Fragment {
    public Screen1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_main, container,
                false);


        return rootView;
    }


}
