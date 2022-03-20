package org.spr;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public List<Music> getMusicList() {
        return musicList;
    }
    public Music getMusic() {
        return music;
    }
    public void setMusic(Music music) {
        this.music = music;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public MusicPlayer() { }
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusicList() {
        System.out.println("Music is playing: ");
        for (Music music : musicList){
            System.out.println(music.getSong() + "\n");
        }
    }
    public void playMusic(){
        System.out.println("Music is playing: " + music.getSong());
    }
}
