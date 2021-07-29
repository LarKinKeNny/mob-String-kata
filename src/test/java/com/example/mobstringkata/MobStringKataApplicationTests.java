package com.example.mobstringkata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
class MobStringKataApplicationTests {

    @Test
    void testEmptyString() {
        System.out.println(application.add(""));
    }

    @Autowired
    private MainApplication application;
}
