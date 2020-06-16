package com.thoughtworks.domain;


public class Position {
    //经度
    private int longitude;
    //维度
    private int latitude;
    //方向
    private String orientation;

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Position() {
    }

    public Position(int longitude, int latitude, String orientation) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.orientation = orientation;
    }
}
