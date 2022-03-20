package org.spr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        //TestBean bean = context.getBean("TestBean", TestBean.class); // class to create a bean
        //System.out.println(bean.getName()); // bean is an object created from class

        //IoC manually
//        Music music1 = context.getBean("MusicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music1);

        //ID - dependency injection (with constructor)
//        MusicPlayer player = context.getBean("MusicPlayer", MusicPlayer.class);
//       player.playMusic();
//        System.out.println(player.getName() +" " + player.getVolume());

 //       MusicPlayer player2 = context.getBean("musicListBean", MusicPlayer.class);
  //      player2.playMusicList();

        ClassicalMusic classicalMusic = context.getBean("MusicBean", ClassicalMusic.class);
        context.close(); //MUST BE CLOSED!
    }
}
