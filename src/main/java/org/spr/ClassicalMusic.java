package org.spr;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

   // @PostCostruct          @PostConstruct and @PreDestroy have been completely removed in Java 11
    public void init() {
        System.out.println("init");
    }

    // @PreDestroy            @PostConstruct and @PreDestroy have been completely removed in Java 11.
    public void destroy() {
        System.out.println("destroy");
    }

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
