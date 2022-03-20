package org.spr;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("MusicBean")
public class ClassicalMusic implements Music{

    List<String> clasSongs = new ArrayList<>();

    {
        clasSongs.add("songClass1");
        clasSongs.add("songClass2");
        clasSongs.add("songClass3");
    }

    @Override
    public List<String> getSong() {
        return clasSongs;
    }

}
