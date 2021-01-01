package com.oil.OilFinding.repository;

import com.oil.OilFinding.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
