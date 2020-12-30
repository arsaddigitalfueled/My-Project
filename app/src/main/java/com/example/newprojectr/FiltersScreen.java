package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.AdapterClass.Pager;
import com.example.Fragment.FiltersFragemetnLimit;
import com.example.Fragment.PostPropertyViewPagerBasicDetails;
import com.example.Fragment.ProjectPhotos;
import com.google.android.material.tabs.TabLayout;

public class FiltersScreen extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ViewPager viewPager_filter;
    TabLayout tab_filters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters_screen);
        viewPager_filter =findViewById(R.id.filters_view_pager);
        tab_filters = findViewById(R.id.tab_filter_screen);
        setupViewPager(viewPager_filter);
        tab_filters.setupWithViewPager(viewPager_filter);


    }

    private void setupViewPager(ViewPager viewPager) {

        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addFragment(new FiltersFragemetnLimit(), "Residential");
        adapter.addFragment(new ProjectPhotos(), "Commercial");
        adapter.addFragment(new ProjectPhotos(), "Other");
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
