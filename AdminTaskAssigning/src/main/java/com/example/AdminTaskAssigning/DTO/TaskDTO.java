package com.example.AdminTaskAssigning.DTO;

public class TaskDTO {

    private String taskName;
    private String projName;
    private String userName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TaskDTO() {
    }

    public TaskDTO(String taskName, String projName, String userName) {
        this.taskName = taskName;
        this.projName = projName;
        this.userName = userName;
    }
}
