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
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Landmark> sights = new ArrayList<>();
        sights.add(new Landmark(getString(R.string.info_trolleys_name), getString(R.string.info_trolleys_description), null, -1, null, null));
        sights.add(new Landmark(getString(R.string.info_planning_name), getString(R.string.info_planning_description), null, -1, null, null));
        sights.add(new Landmark(getString(R.string.info_counterfeits_name), getString(R.string.info_counterfeits_description), null, -1, null, null));
        sights.add(new Landmark(getString(R.string.info_season_name), getString(R.string.info_season_description), null, -1, null, null));


        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return rootView;
    }
}
