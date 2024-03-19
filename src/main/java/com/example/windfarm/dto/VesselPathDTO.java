// VesselPathDTO.java
package com.example.windfarm.dto;

public class VesselPathDTO {
    private String mmsi;
    private String path; // This could be a serialized format of the path data
    // Other properties related to the vessel path can be added here

    // Getters and setters for each property
    public String getMmsi() {
        return mmsi;
    }

    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    // Consider adding other relevant fields and their getters and setters
}
