package com.codeclan.example.VideoGameTracker;

import com.codeclan.example.VideoGameTracker.models.Game;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game1;

    @Before
    public void before(){
        game1 = new Game("Zelda", "open-world");
    }

    @Test
    public void contextLoads(){

    }

}

