package com.example.windfarm.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UID")
    private String uid;

    @Column(name = "ServerInstallationId")
    private Long serverInstallationId;

    @Column(name = "ProjectID")
    private Long projectId;

    @Column(name = "TypeID")
    private Long typeId;

    @Column(name = "ProjectInstallationStatusID")
    private Long projectInstallationStatusId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Position")
    private String position;

    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "ModifiedBy", nullable = false)
    private String modifiedBy;

    @Column(name = "ChangedOnServer")
    private LocalDateTime changedOnServer;

    @Column(name = "HasPhoto")
    private Boolean hasPhoto;
    public Asset() {}

    // Parameterized constructor for all fields
    public Asset(Long id, String uid, Long serverInstallationId, Long projectId, Long typeId,
                 Long projectInstallationStatusId, String name, String position) {
        this.id = id;
        this.uid = uid;
        this.serverInstallationId = serverInstallationId;
        this.projectId = projectId;
        this.typeId = typeId;
        this.projectInstallationStatusId = projectInstallationStatusId;
        this.name = name;
        this.position = position;
    }

    // Getters and setters for all fields
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // ... other getters and setters for remaining fields ...

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }


}
