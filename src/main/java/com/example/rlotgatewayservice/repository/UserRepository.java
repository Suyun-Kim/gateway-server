package com.example.rlotgatewayservice.repository;

import com.example.rlotgatewayservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUserIdAndUserPw(String userId, String userPw);

}
