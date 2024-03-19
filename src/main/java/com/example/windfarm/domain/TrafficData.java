package com.example.windfarm.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "TrafficData")
public class TrafficData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DatetimeUtc", nullable = false)
    private LocalDateTime datetimeUtc;

    @Column(name = "MMSI", nullable = false)
    private String mmsi;

    @Column(name = "Class")
    private String vesselClass;

    @Column(name = "MsgTypeID")
    private Integer msgTypeId;

    @Column(name = "Position")
    private String position;

    @Column(name = "SOG")
    private Double sog;

    @Column(name = "COG")
    private Double cog;

    @Column(name = "Heading")
    private Integer heading;

    // Default constructor
    public TrafficData() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatetimeUtc() {
        return datetimeUtc;
    }

    public void setDatetimeUtc(LocalDateTime datetimeUtc) {
        this.datetimeUtc = datetimeUtc;
    }

    public String getMmsi() {
        return mmsi;
    }

    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    public String getVesselClass() {
        return vesselClass;
    }

    public void setVesselClass(String vesselClass) {
        this.vesselClass = vesselClass;
    }

    public Integer getMsgTypeId() {
        return msgTypeId;
    }

    public void setMsgTypeId(Integer msgTypeId) {
        this.msgTypeId = msgTypeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSog() {
        return sog;
    }

    public void setSog(Double sog) {
        this.sog = sog;
    }

    public Double getCog() {
        return cog;
    }

    public void setCog(Double cog) {
        this.cog = cog;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }
}