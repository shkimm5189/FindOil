package com.oil.OilFinding.testing;


import com.oil.OilFinding.model.entity.Posts;
import com.oil.OilFinding.repository.PostsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostsTest {
    @Autowired
    PostsRepository postsRepository;

    @Test
    public void create(){
        postsRepository.save(Posts.builder()
                .content("testDbCode")
                .build());
        System.out.println("OK");
    }
    @Test
    public void Read(){
        
    }
    @Test
    public void update(){

    }
    @Test
    public void delete(){
    }
}
