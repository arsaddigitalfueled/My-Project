package com.example.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.newprojectr.LoginActivity;
import com.example.newprojectr.NewProjectHomeBuyer;
import com.example.newprojectr.R;
import com.example.newprojectr.SahilDahiyaCircle;
import com.example.newprojectr.SaleProperties;
import com.example.newprojectr.SearchViewActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    ImageView imageView;
    TextView tv_se_all,nes_professional,city_centre,nest_project,hot_properties,featured_product,tv_new_project;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        tv_new_project =view.findViewById(R.id.new_projects_alt);

        nes_professional=view.findViewById(R.id.see_all_nest_professional);
        city_centre= view.findViewById(R.id.see_all_city_centre);
        nest_project = view.findViewById(R.id.see_all_new_project);
        hot_properties=view.findViewById(R.id.see_all_hot_properties);
        featured_product=view.findViewById(R.id.see_all_featured_product);
        imageView = view.findViewById(R.id.search_view);
        tv_se_all = view.findViewById(R.id.see_all_nestowener);
        tv_new_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NewProjectHomeBuyer.class));

            }
        });

        featured_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        hot_properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        nest_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        city_centre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        nes_professional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        tv_se_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SearchViewActivity.class));

            }
        });
        return view;
    }


}
