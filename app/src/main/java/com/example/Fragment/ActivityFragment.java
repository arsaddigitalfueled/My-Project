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
public class ActivityFragment extends Fragment implements TabLayout.OnTabSelectedListener {
    ViewPager viewPager;
    TabLayout tabLayout;


    public ActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_activity, container, false);

        viewPager= view.findViewById(R.id.view_pager_activityy);
        tabLayout = view.findViewById(R.id.tabs_activity);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getChildFragmentManager());
        adapter.addFragment(new MyProperties(), "My Projects");
        adapter.addFragment(new ActivityMyProperties(), "My Properties");
        adapter.addFragment(new MyResponses(), "My Response");
        adapter.addFragment(new PropertiesContracted(), "Properties Contracted");
        adapter.addFragment(new PropertiesOffered(), "Property Offered");
        adapter.addFragment(new MyRequirement(), "My Requirement");


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
