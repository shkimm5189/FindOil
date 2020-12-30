package com.oil.OilFinding.testing;

import com.oil.OilFinding.OilFindingApplication;

import com.oil.OilFinding.model.entity.TestModel;
import com.oil.OilFinding.repository.TestRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class DatabaseTest extends OilFindingApplication {
    @Autowired
    TestRepo testRepo;

    @Test
    public void create(){
        TestModel testModel = new TestModel();
        testModel.setId(2);
        
        testRepo.save(testModel);

    }
}
