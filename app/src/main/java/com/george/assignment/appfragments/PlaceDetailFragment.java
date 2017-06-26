package com.george.assignment.appfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.george.assignment.R;
import com.george.assignment.classhelper.Data;
import com.george.assignment.model.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceDetailFragment extends Fragment
{
    PlaceDetail placeDetail;
    public PlaceDetailFragment(int id)
    {
        placeDetail= Data.getPlaceDetails().get(id);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v=  inflater.inflate(R.layout.fragment_place_detail, container, false);
        initializeComponent(v);
        return v;
    }

    private void initializeComponent(View v)
    {
        getActivity().getIntent().putExtra("PlaceDetail",true);
        TextView tvDescription = (TextView) v.findViewById(R.id.tvDescription);
        ImageView ivPlaceDetail = (ImageView) v.findViewById(R.id.ivPlaceDetail);
        tvDescription.setText(placeDetail.getDetail());
        Glide.with(getActivity()).load(placeDetail.getImage()).into(ivPlaceDetail);

    }

}
