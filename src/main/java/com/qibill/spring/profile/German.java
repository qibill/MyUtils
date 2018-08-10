package com.qibill.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class German implements MoveFactor{
    @Override
    public void speak() {
        System.out.println("i am a German");
    }
}
