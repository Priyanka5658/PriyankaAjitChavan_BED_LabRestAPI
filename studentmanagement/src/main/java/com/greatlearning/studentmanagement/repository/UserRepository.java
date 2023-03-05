package com.greatlearning.studentmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.studentmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

@Query ("SELECT u FROM User u WHERE u.username = ?1")
public User getUserByUsername(String username);
}


