package com.aniket.connectifybackend.repository;

import com.aniket.connectifybackend.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
