package com.example.android.pleventourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Landmark> hotels = new ArrayList<Landmark>();

        hotels.add(new Landmark(getString(R.string.hotels_balkan_name), getString(R.string.hotels_balkan_description), getString(R.string.hotels_balkan_address), -1, getString(R.string.hotels_balkan_phone), null));
        hotels.add(new Landmark(getString(R.string.hotels_rostov_name), getString(R.string.hotels_rostov_description), getString(R.string.hotels_rostov_address), -1, getString(R.string.hotels_rostov_phone), null));
        hotels.add(new Landmark(getString(R.string.hotels_mirage_name), getString(R.string.hotels_mirage_description), getString(R.string.hotels_mirage_address), -1, getString(R.string.hotels_mirage_phone), null));
        hotels.add(new Landmark(getString(R.string.hotels_simona_name), getString(R.string.hotels_simona_description), getString(R.string.hotels_simona_address), -1, getString(R.string.hotels_simona_phone), null));
        hotels.add(new Landmark(getString(R.string.hotels_pleven_name), getString(R.string.hotels_pleven_description), getString(R.string.hotels_pleven_address), -1, getString(R.string.hotels_pleven_phone), null));


        LandmarkAdapter adapter = new LandmarkAdapter(this, hotels);

        ListView listView = (ListView) findViewById(R.id.listView);


        listView.setAdapter(adapter);

    }
}
