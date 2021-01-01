package com.oil.OilFinding.repository;

import com.oil.OilFinding.model.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {
}
