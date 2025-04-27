package com.example.AdminTaskAssigning.Service;

import com.example.AdminTaskAssigning.Entity.ProjectEntity;
import com.example.AdminTaskAssigning.Entity.TaskEntity;
import com.example.AdminTaskAssigning.Entity.UserEntity;
import com.example.AdminTaskAssigning.Repository.ProjectRepository;
import com.example.AdminTaskAssigning.Repository.TaskRepository;
import com.example.AdminTaskAssigning.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    public void addProject(String projName) {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setProjName(projName);
        projectRepository.save(projectEntity);
    }

    public List<TaskEntity> viewProject(String projName) {

        ProjectEntity proj = projectRepository.findByProjName(projName);
        return taskRepository.findAllByProjectEntity(proj);

    }

    public List<TaskEntity> viewUser(String username, String password) {
        UserEntity user = userRepository.userLogin(username,password);
        return taskRepository.findAllByUserEntity(user);

    }

    public List<TaskEntity> adminView(String username, String password) {

        UserEntity user = userRepository.userLogin(username,password);
        return taskRepository.findAll();
    }
}
