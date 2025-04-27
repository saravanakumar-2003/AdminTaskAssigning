package com.example.AdminTaskAssigning.Repository;

import com.example.AdminTaskAssigning.Entity.ProjectEntity;
import com.example.AdminTaskAssigning.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
    ProjectEntity findByProjName(String projName);

}
