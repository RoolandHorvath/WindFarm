package com.example.windfarm.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "ManifestsJson")
public class ManifestJson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EventID")
    private Long eventId;

    @Column(name = "CardID")
    private Long cardId;

    @Column(name = "Action")
    private String action;

    @Column(name = "Explanation")
    private String explanation;

    @Column(name = "Lon")
    private Double lon;

    @Column(name = "Lat")
    private Double lat;

    @Column(name = "LocationID")
    private Long locationId;

    @Column(name = "ProjectInstallationTypeID")
    private Long projectInstallationTypeId;

    @Column(name = "EntryTime")
    private LocalDateTime entryTime;

    @Column(name = "LocationName")
    private String locationName;

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "IsAutomatic")
    private Boolean isAutomatic;

    @Column(name = "EmployeeID")
    private Long employeeId;

    @Column(name = "ProjectID")
    private Long projectId;

    @Column(name = "LocationProject")
    private Long locationProject;

    @Column(name = "AssetName")
    private String assetName;

    public ManifestJson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getProjectInstallationTypeId() {
        return projectInstallationTypeId;
    }

    public void setProjectInstallationTypeId(Long projectInstallationTypeId) {
        this.projectInstallationTypeId = projectInstallationTypeId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(Boolean automatic) {
        isAutomatic = automatic;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getLocationProject() {
        return locationProject;
    }

    public void setLocationProject(Long locationProject) {
        this.locationProject = locationProject;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
}