package com.example.android.pleventourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopsFragment extends Fragment {


    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Landmark> sights = new ArrayList<>();
        sights.add(new Landmark(getString(R.string.shops_centrallMall_name), null, getString(R.string.shops_centrallMall_address), R.drawable.rsz_centrallmall, getString(R.string.shops_centrallMall_phone), getString(R.string.shops_centrallMall_workingHours)));
        sights.add(new Landmark(getString(R.string.shops_panoramaMall_name), null, getString(R.string.shops_panoramaMall_address), R.drawable.mallpanorama, getString(R.string.shops_panoramaMall_phone), getString(R.string.shops_panoramaMall_workingHours)));
        sights.add(new Landmark(getString(R.string.shops_maxiCentre_name), null, getString(R.string.shops_maxiCentre_address), R.drawable.rsz_maxitrade, getString(R.string.shops_maxiCentre_phone), getString(R.string.shops_maxiCentre_workingHours)));


        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }
}
