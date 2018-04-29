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
public class SightsFragment extends Fragment {


    public SightsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Landmark> sights = new ArrayList<>();
        sights.add(new Landmark(getString(R.string.sights_cascade_name), getString(R.string.sights_cascade_description), getString(R.string.sights_cascade_address), R.drawable.cascade, null, null));
        sights.add(new Landmark(getString(R.string.sights_mausoleum_name), getString(R.string.sights_mausoleum_description), getString(R.string.sights_mausoleum_address), R.drawable.rsz_mausoleum, null, null));
        sights.add(new Landmark(getString(R.string.sights_museum_name), getString(R.string.sights_museum_description), getString(R.string.sights_museum_address), R.drawable.rsz_1musei, null, null));
        sights.add(new Landmark(getString(R.string.sights_statue_name), getString(R.string.sights_statue_description), getString(R.string.sights_statue_address), R.drawable.rsz_maikabulgaria, null, null));
        sights.add(new Landmark(getString(R.string.sights_scobelevpark_name), getString(R.string.sights_scobelevpark_description), getString(R.string.sights_scobelevpark_address), R.drawable.rsz_scobelevpark, null, null));
        sights.add(new Landmark(getString(R.string.sights_panorama_name), getString(R.string.sights_panorama_description), getString(R.string.sights_panorama_address), R.drawable.rsz_panorama, null, null));
        sights.add(new Landmark(getString(R.string.sights_kailaka_name), getString(R.string.sights_kailaka_description), getString(R.string.sights_kailaka_address), R.drawable.rsz_kailaka, null, null));
        sights.add(new Landmark(getString(R.string.sights_storgozia_name), getString(R.string.sights_storgozia_description), getString(R.string.sights_storgozia_address), R.drawable.rsz_storgozia, null, null));
        sights.add(new Landmark(getString(R.string.sights_house_name), getString(R.string.sights_house_description), getString(R.string.sights_house_address), R.drawable.rsz_house_museum, null, null));


        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }


}
