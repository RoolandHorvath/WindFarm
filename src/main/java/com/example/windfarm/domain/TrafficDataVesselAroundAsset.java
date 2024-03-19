package com.example.windfarm.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TrafficDataVesselsAroundAssets")
public class TrafficDataVesselAroundAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MMSI", nullable = false)
    private String mmsi;

    @Column(name = "ServerInstallationId", nullable = false)
    private Integer serverInstallationId;

    @Column(name = "Name")
    private String name;

    @Column(name = "StartDateTime", nullable = false)
    private LocalDateTime startDateTime;

    @Column(name = "EndDateTime", nullable = false)
    private LocalDateTime endDateTime;

    public TrafficDataVesselAroundAsset() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMmsi() {
        return mmsi;
    }

    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    public Integer getServerInstallationId() {
        return serverInstallationId;
    }

    public void setServerInstallationId(Integer serverInstallationId) {
        this.serverInstallationId = serverInstallationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
