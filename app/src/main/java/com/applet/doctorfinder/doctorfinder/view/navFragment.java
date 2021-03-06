package com.applet.doctorfinder.doctorfinder.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.applet.doctorfinder.doctorfinder.R;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class navFragment extends Fragment {

    boolean doc=true;

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    public navFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View doctor = inflater.inflate(R.layout.nav_doctor, container, false);
        View visitor =inflater.inflate(R.layout.nav_visitor,container,false);

        CircleImageView circleImageView=(CircleImageView)doctor.findViewById(R.id.circleImageView);
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getContext(),doctorprofile.class);
                    startActivity(intent);

            }
        });
        CircleImageView vist=(CircleImageView)visitor.findViewById(R.id.circleImageView);
        vist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(),doctorprofile.class);
                startActivity(intent);
            }
        });

        TextView text=(TextView) doctor.findViewById(R.id.textView);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(),doctorprofile.class);
                startActivity(intent);
            }
        });

        if (doc)
        return doctor;
        else
            return visitor;
    }
    public void setUP(DrawerLayout drawerLayput,Toolbar toolBar) {
        mDrawerLayout = drawerLayput;
        mDrawerToggle=new ActionBarDrawerToggle(getActivity(),drawerLayput,toolBar,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();


    }

}
