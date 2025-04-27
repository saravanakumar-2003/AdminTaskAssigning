package com.example.AdminTaskAssigning.Controller;

import com.example.AdminTaskAssigning.Entity.TaskEntity;
import com.example.AdminTaskAssigning.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/addProject")
    public void addProject(@RequestParam String projName){
        projectService.addProject(projName);
    }

    @GetMapping("/viewProject")
    public List<TaskEntity> viewProject(@RequestParam String projName){
        return projectService.viewProject(projName);
    }

    @GetMapping("/viewUser")
    public List<TaskEntity> viewUser(@RequestParam String username, @RequestParam String password){
        return projectService.viewUser(username,password);
    }

    @GetMapping("/adminView")
    public List<TaskEntity> adminView(@RequestParam String username, @RequestParam String password){
        return projectService.adminView(username,password);
    }
}
