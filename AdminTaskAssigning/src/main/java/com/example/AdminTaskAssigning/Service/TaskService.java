package com.example.AdminTaskAssigning.Service;

import com.example.AdminTaskAssigning.DTO.TaskDTO;
import com.example.AdminTaskAssigning.Entity.ProjectEntity;
import com.example.AdminTaskAssigning.Entity.TaskEntity;
import com.example.AdminTaskAssigning.Entity.UserEntity;
import com.example.AdminTaskAssigning.Repository.ProjectRepository;
import com.example.AdminTaskAssigning.Repository.TaskRepository;
import com.example.AdminTaskAssigning.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    public void addtask(TaskDTO taskDTO) {

        ProjectEntity projectEntity = projectRepository.findByProjName(taskDTO.getProjName());
        UserEntity userEntity = userRepository.findByName(taskDTO.getUserName());

        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTaskName(taskDTO.getTaskName());
        taskEntity.setProjectEntity(projectEntity);
        taskEntity.setUserEntity(userEntity);
        taskRepository.save(taskEntity);
    }
}
