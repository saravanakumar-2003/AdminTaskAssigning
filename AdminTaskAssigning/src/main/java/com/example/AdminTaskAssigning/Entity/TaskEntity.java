package com.example.AdminTaskAssigning.Entity;

import jakarta.persistence.*;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @Column
    private String taskName;

    @ManyToOne
    @JoinColumn(name = "projId" , referencedColumnName = "projId")
    private ProjectEntity projectEntity;

    @ManyToOne
    @JoinColumn(name = "userId" , referencedColumnName = "userId")
    private UserEntity userEntity;

    public TaskEntity() {
    }

    public TaskEntity(int taskId, String taskName, ProjectEntity projectEntity, UserEntity userEntity) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.projectEntity = projectEntity;
        this.userEntity = userEntity;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
