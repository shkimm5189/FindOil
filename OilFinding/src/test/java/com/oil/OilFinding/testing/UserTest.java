package com.oil.OilFinding.testing;

import com.oil.OilFinding.model.entity.User;
import com.oil.OilFinding.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@SpringBootTest
public class UserTest {

    @Autowired
    UserRepository userRepository;
    @Test
    public void create() {

        User user = User.builder()
                .email("test@naver.com")
                .password("password")
                .phoneNumber("010-5189-0829")
                .build();
        userRepository.save(user);

    }
}
