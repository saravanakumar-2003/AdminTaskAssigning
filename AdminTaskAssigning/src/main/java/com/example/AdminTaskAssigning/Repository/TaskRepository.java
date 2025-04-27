package com.example.AdminTaskAssigning.Repository;

import com.example.AdminTaskAssigning.Entity.ProjectEntity;
import com.example.AdminTaskAssigning.Entity.TaskEntity;
import com.example.AdminTaskAssigning.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {


    List<TaskEntity> findAllByProjectEntity(ProjectEntity projectEntity);


    List<TaskEntity> findAllByUserEntity(UserEntity user);
}
