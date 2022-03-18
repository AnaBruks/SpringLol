package org.spr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        //TestBean bean = context.getBean("TestBean", TestBean.class); // class to create a bean
        //System.out.println(bean.getName()); // bean is an object created from class

        Music music1 = context.getBean("MusicBean", Music.class);
        //IoC manually
        MusicPlayer player = new MusicPlayer(music1);
        player.playMusic();

        context.close(); //MUST BE CLOSED!
    }
}
