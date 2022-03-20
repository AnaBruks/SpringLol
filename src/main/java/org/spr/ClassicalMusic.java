package org.spr;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic createClassMusicObj(){  // kinda factory-method
        return new ClassicalMusic();   // will be singleton in Spring by default
    }
    @Override
    public String getSong() {
        return "Classical Music";
    }
    public void init(){
        System.out.println("Inizialization...");
    }
    public void destroy(){
        System.out.println("Destruction...");
    }

}
