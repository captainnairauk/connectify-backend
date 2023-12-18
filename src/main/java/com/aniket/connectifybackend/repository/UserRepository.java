package com.aniket.connectifybackend.repository;

import com.aniket.connectifybackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
