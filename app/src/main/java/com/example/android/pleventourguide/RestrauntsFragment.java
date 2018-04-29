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
public class RestrauntsFragment extends Fragment {


    public RestrauntsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Landmark> sights = new ArrayList<>();
        sights.add(new Landmark(getString(R.string.restaurants_cantonata_name), null, getString(R.string.restaurants_cantonata_address), R.drawable.rsz_cantonata, getString(R.string.restaurants_cantonata_phone), getString(R.string.restaurants_cantonata_workingHours)));
        sights.add(new Landmark(getString(R.string.restaurants_napoli_name), null, getString(R.string.restaurants_napoli_address), R.drawable.rsz_napoli, getString(R.string.restaurants_napoli_phone), getString(R.string.restaurants_napoli_workingHours)));
        sights.add(new Landmark(getString(R.string.restaurants_karutsata_name), null, getString(R.string.restaurants_karutsata_address), R.drawable.karucata, getString(R.string.restaurants_karutsata_phone), getString(R.string.restaurants_karutsata_workingHours)));
        sights.add(new Landmark(getString(R.string.restaurants_peshterata_name), null, getString(R.string.restaurants_peshterata_address), R.drawable.rsz_1peshterata, getString(R.string.restaurants_peshterata_phone), getString(R.string.restaurants_peshterata_workingHours)));
        sights.add(new Landmark(getString(R.string.restaurants_karadzhekata_name), null, getString(R.string.restaurants_karadzhekata_address), R.drawable.rsz_karadjeikata, getString(R.string.restaurants_karadzhekata_phone), getString(R.string.restaurants_karadzhekata_workingHours)));
        sights.add(new Landmark(getString(R.string.restaurants_LoWiLow_name), null, getString(R.string.restaurants_LoWiLow_address), R.drawable.lowilow, getString(R.string.restaurants_LoWiLow_phone), getString(R.string.restaurants_LoWiLow_workingHours)));


        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }

}
