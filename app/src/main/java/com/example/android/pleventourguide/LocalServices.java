package com.example.android.pleventourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalServices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Landmark> services = new ArrayList<Landmark>();

        services.add(new Landmark(getString(R.string.bus_station_name), getString(R.string.bus_station_description), getString(R.string.bus_station_address), -1, getString(R.string.bus_station_phone), null));
        services.add(new Landmark(getString(R.string.hospital_name), getString(R.string.hospital_description), getString(R.string.hospital_address), -1, getString(R.string.hospital_phone), null));
        services.add(new Landmark(getString(R.string.polyclinic_name), getString(R.string.polyclinic_description), getString(R.string.polyclinic_address), -1, getString(R.string.polyclinic_phone), null));
        services.add(new Landmark(getString(R.string.car_service_name), getString(R.string.car_service_description), getString(R.string.car_service_address), -1, getString(R.string.car_service_phone), null));
        services.add(new Landmark(getString(R.string.store_name), getString(R.string.store_description), getString(R.string.store_address), -1, getString(R.string.store_phone), null));
        services.add(new Landmark(getString(R.string.taxi_name), getString(R.string.taxi_description), getString(R.string.taxi_address), -1, getString(R.string.taxi_phone), null));


        LandmarkAdapter adapter = new LandmarkAdapter(this, services);

        ListView listView = (ListView) findViewById(R.id.listView);


        listView.setAdapter(adapter);

    }
}