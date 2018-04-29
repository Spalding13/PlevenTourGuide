package com.example.android.pleventourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Spalding on 3/21/2018.
 */

public class LandmarkAdapter extends ArrayAdapter<Landmark> {

    public LandmarkAdapter(Context context, ArrayList<Landmark> sights) {
        super(context, 0, sights);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        Landmark currentLandmark = getItem(position);


        TextView titleTextView = (TextView) listItem.findViewById(R.id.nameTextView);
        titleTextView.setText(currentLandmark.getName());

        TextView addressTextView = (TextView) listItem.findViewById(R.id.addressTextView);
        addressTextView.setText(currentLandmark.getAddress());

        TextView descriptionTextView = (TextView) listItem.findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(currentLandmark.getDescription());

        TextView phoneTextView = (TextView) listItem.findViewById(R.id.phoneTextView);
        phoneTextView.setText(currentLandmark.getPhoneNumber());

        TextView hoursTextView = (TextView) listItem.findViewById(R.id.hoursTextView);
        hoursTextView.setText(currentLandmark.getWorkingHours());


        ImageView imageView = (ImageView) listItem.findViewById(R.id.photoImageView);

        if (currentLandmark.hasImage()) {

            imageView.setImageResource(currentLandmark.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        } else {

            imageView.setVisibility(View.GONE);
        }

        if (currentLandmark.hasName()) {
            titleTextView.setText(currentLandmark.getName());
            titleTextView.setVisibility(View.VISIBLE);
        } else {
            titleTextView.setVisibility(View.GONE);
        }

        if (currentLandmark.hasPhone()) {
            phoneTextView.setText(currentLandmark.getPhoneNumber());
            phoneTextView.setVisibility(View.VISIBLE);
        } else {
            phoneTextView.setVisibility(View.GONE);
        }
        if (currentLandmark.hasDescription()) {
            descriptionTextView.setText(currentLandmark.getDescription());
            descriptionTextView.setVisibility(View.VISIBLE);
        } else {
            descriptionTextView.setVisibility(View.GONE);
        }

        if (currentLandmark.hasWorkingHours()) {
            hoursTextView.setText(currentLandmark.getWorkingHours());
            hoursTextView.setVisibility(View.VISIBLE);
        } else {
            hoursTextView.setVisibility(View.GONE);
        }
        if (currentLandmark.hasAddress()) {
            addressTextView.setText(currentLandmark.getAddress());
            addressTextView.setVisibility(View.VISIBLE);

        } else {
            addressTextView.setVisibility(View.GONE);

        }

        return listItem;
    }
}