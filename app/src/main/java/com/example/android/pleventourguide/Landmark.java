package com.example.android.pleventourguide;

/**
 * Created by Spalding on 3/20/2018.
 */

public class Landmark {

    private String name;
    private String description;
    private String address;
    private String phoneNumber;
    private String workingHours;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;


    public Landmark(String name, String description, String address,
                    int imageResourceId, String phone, String workingHours) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageResourceId = imageResourceId;
        this.phoneNumber = phone;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    public boolean hasName() {
        return getName() != null;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public boolean hasPhone() {
        return getPhoneNumber() != null;
    }

    public boolean hasDescription() {
        return getDescription() != null;
    }

    public boolean hasWorkingHours() {
        return getWorkingHours() != null;
    }


}


