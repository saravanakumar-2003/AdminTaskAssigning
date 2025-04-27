package com.example.AdminTaskAssigning.Repository;

import com.example.AdminTaskAssigning.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByName(String userName);

    @Query("SELECT user from UserEntity user WHERE user.username = :username AND user.password = :password")
    UserEntity userLogin(@Param("username") String username, @Param("password") String password);
}
