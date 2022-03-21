package org.spr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

public class MusicPlayer {
    // we can use @Autowired on setters, constructors, and PRIVATE field - because of reflection!
    private String name;
    private int volume;

    @Value("${ musicPlayer.name}")
    public String getName() {
        return name;
    }

    @Value("${ musicPlayer.volume}")
    public int getVolume() {
        return volume;
    }

    private Music music1, music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("MusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    /*private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
    }
     */
    public String playMusic() {
        return "Playing: " + music1.getSong() + "\n" + music2.getSong();
    }
}
