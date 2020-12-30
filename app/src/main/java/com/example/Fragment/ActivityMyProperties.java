package com.example.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.AdapterClass.Pager;
import com.example.newprojectr.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityMyProperties extends Fragment implements TabLayout.OnTabSelectedListener{
    ViewPager vp;
    TabLayout tab;


    public ActivityMyProperties() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_activity_my_properties, container, false);





        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getChildFragmentManager());
        adapter.addFragment(new ActivityMyProperties(), "My Projects");
        adapter.addFragment(new ProjectPhotos(), "Floor Plan(1)");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");


        viewPager.setAdapter(adapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
