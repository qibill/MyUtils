package com.qibill.spring.profile.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qibill.spring.profile.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/profile.xml")
@ActiveProfiles("prod")
public class ProfileTest {

    @Autowired
    Person p;
    
    @Test
    public void testProfile(){
    	p.speak();
    }

}
