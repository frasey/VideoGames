package com.codeclan.example.VideoGameTracker;

import com.codeclan.example.VideoGameTracker.models.Game;
import com.codeclan.example.VideoGameTracker.repositories.GameRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoGameTrackerApplicationTests {

    @Autowired
    GameRepository gameRepository;

    @Test
    public void saveToDb(){
        Game zelda = new Game("Zelda", "open-world");
        gameRepository.save(zelda);
    }
}
