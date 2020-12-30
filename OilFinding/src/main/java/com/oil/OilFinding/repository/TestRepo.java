package com.oil.OilFinding.repository;

import com.oil.OilFinding.model.entity.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<TestModel,Long> {

}
