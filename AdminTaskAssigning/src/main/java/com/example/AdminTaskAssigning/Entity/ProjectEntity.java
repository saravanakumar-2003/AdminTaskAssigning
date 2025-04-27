package com.example.AdminTaskAssigning.Entity;

import jakarta.persistence.*;

@Entity
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projId;

    @Column
    private String projName;

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public ProjectEntity() {
    }

    public ProjectEntity(int projId, String projName) {
        this.projId = projId;
        this.projName = projName;
    }
}
