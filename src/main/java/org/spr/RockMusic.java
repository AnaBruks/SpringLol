package org.spr;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    List<String> rockSongs = new ArrayList<>();
    {
        rockSongs.add("songRock1");
        rockSongs.add("songRock2");
        rockSongs.add("songRock3");
    }

    @Override
    public List<String> getSong() {
        return rockSongs;
    }
}
