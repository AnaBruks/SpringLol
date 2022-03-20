package org.spr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

//        Music classicalMusic = context.getBean("MusicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(classicalMusic);
//        player.playMusic(); // for classicalMusic

     //   Computer computer = context.getBean("computer", Computer.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.ROCK);

        context.close(); //MUST BE CLOSED!
    }
}
