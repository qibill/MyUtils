package com.qibill.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class English implements MoveFactor{
    @Override
    public void speak() {
        System.out.println("i am an English");
    }
}
