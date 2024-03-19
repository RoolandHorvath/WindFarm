package com.example.windfarm.dto;

public class VesselLocationDTO {
    private String mmsi;
    private String vesselName;
    private double latitude;
    private double longitude;
    private double sog;
    private double cog;
    private int heading;

    // Constructors
    public VesselLocationDTO() {
        // Default constructor
    }

    // Setters
    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setSog(double sog) {
        this.sog = sog;
    }

    public void setCog(double cog) {
        this.cog = cog;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    // Getters
    public String getMmsi() {
        return mmsi;
    }

    public String getVesselName() {
        return vesselName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getSog() {
        return sog;
    }

    public double getCog() {
        return cog;
    }

    public int getHeading() {
        return heading;
    }
}
