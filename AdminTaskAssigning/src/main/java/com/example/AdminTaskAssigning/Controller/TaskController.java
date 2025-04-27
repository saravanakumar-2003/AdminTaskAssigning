package com.example.AdminTaskAssigning.Controller;

import com.example.AdminTaskAssigning.DTO.TaskDTO;
import com.example.AdminTaskAssigning.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/addTask")
    public void addTask(@RequestBody TaskDTO taskDTO){
        taskService.addtask(taskDTO);
    }
}
